package io.ghost.steps;

import io.ghost.hooks.Hooks;
import io.ghost.sites.GhostSite;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class PageCreationSteps {

	GhostSite ghostSite;
	private int randomTitleNumber;

	public PageCreationSteps(Hooks hooksClass) {
		this.ghostSite = hooksClass.getGhostSite();
	}

	@When("I publish a new post")
	public void iPublishANewPage() {
		ghostSite.home().clickPagesLink();
		ghostSite.pageList().clickNewPageLink();
		randomTitleNumber = new Random().nextInt(Integer.MAX_VALUE);
		ghostSite.pageCreation().publishPage(String.format("title%d", randomTitleNumber), "Some Content");
	}

	@Then("I will see the post listed")
	public void iWillSeePostListed() {
		assertTrue(String.format("title%d is not included in the page titles", randomTitleNumber),
				ghostSite.pageList().getPageTitleList().contains(String.format("title%d", randomTitleNumber)));
	}
}
