package io.ghost.steps;

import static org.junit.Assert.*;

import io.ghost.hooks.Hooks;
import io.ghost.sites.GhostSite;
import cucumber.api.java.en.Then;

public class HomeSteps {
	GhostSite ghostSite;

	public HomeSteps(Hooks hooksClass) {
		this.ghostSite = hooksClass.getGhostSite();
	}

	@Then("I will be in Home Page")
	public void i_will_be_in_Home_Page() {
	    assertTrue(ghostSite.home().isAt());
	}

	@Then("I will have an option to edit Pages")
	public void iWillHaveOptionEditPages() {
		assertTrue("Can't find the 'Pages' Link on the home page.", ghostSite.home().hasPagesLink());
	}
}
