package io.ghost.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;
import java.util.stream.Collectors;

public class PageListPage extends BasePage {

	@FindBy(css="h2.gh-canvas-title")
	WebElement pagesHeader;

	@FindBy(css="a[href='#/editor/page/']")
	WebElement newPageLnk;

	@FindBy(css="")
	WebElement listPagesDiv;
	public PageListPage(WebDriver driver) {
		super(driver);
	}

	public boolean isAt() {
		return pagesHeader.isDisplayed() &&
				newPageLnk.isDisplayed();
	}

	public void clickNewPageLink() {
		this.newPageLnk.click();
	}

	public List<String> getPageTitleList() {
		return
				wait.until(
						ExpectedConditions.presenceOfAllElementsLocatedBy(
								By.cssSelector(".gh-posts-list-item .gh-content-entry-title")
						)
				)
				.stream()
				.map(elem -> elem.getText())
				.collect(Collectors.toList());
	}

}
