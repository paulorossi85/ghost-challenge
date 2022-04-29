Feature: Ghost Create Pages
  As a User
  I want to be able to create pages
  So I can attract new members

  Scenario: User can create a new Page
    Given User paulorossi85@gmail.com and password test@12345 is logged in ghost admin
    When I publish a new post
    Then I will see the post listed
