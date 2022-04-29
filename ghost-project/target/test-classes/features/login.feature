Feature: Ghost Login
  As a User
  I want to log into Ghost
  So I admin the site

  Scenario: User can login succesfully
    Given I navigate to Ghost Signin Page
    When I log into the site with user paulorossi85@gmail.com and password test@12345
    Then I will be in Home Page
    And I will have an option to edit Pages

  Scenario Outline: User can not log in using wrong credentials
    Given I navigate to Ghost Signin Page
    When I log into the site with user <bad_user> and password <bad_password>
    Then I will see a login error

    Examples:
      | bad_user               | bad_password |
      | foo@bar.com            | toast@12345  |
      | paulorossi85@gmail.com | toast@12345  |
