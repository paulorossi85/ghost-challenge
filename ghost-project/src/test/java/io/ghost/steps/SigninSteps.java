package io.ghost.steps;

import io.ghost.hooks.Hooks;
import io.ghost.sites.GhostSite;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class SigninSteps {
	GhostSite ghostSite;

	public SigninSteps(Hooks hooksClass) {
		this.ghostSite = hooksClass.getGhostSite();
	}

	@Given("I navigate to Ghost Signin Page")
	public void iNavigateToHomePage() {
		ghostSite.signin().goTo();
	}
	@When("I log into the site with user {word} and password {word}")
	public void i_log_into_the_site_with_credentials_frank_sinatra(String user, String pass) {
		//trabajo en dos paginas.  la home page, y la login page
		ghostSite.signin().correctLogin(user, pass);
	}

	@Given("User {word} and password {word} is logged in ghost admin")
	public void userHasLoggedIntoGhostAdmin(String user, String pass) {
		ghostSite.signin().goTo();
		ghostSite.signin().correctLogin(user, pass);
		assertTrue("User login failure", ghostSite.home().isAt());
	}

	@Then("I will see a login error")
	public void i_will_see_an_error_message() {
	    assertTrue("User login failure", ghostSite.signin().isSigninErrorVisible());
	}


}
