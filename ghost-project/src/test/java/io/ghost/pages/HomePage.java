package io.ghost.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

	// page members
	@FindBy(css ="a[href='#/pages/']")
	WebElement pagesLnk;
	
	@FindBy(css = ".gh-nav-menu-details-sitetitle")
	WebElement ghostSiteName;

	public HomePage(WebDriver driver) {
		super(driver);
	}

	public boolean isAt() {
		return pagesLnk.isDisplayed() &&
				ghostSiteName.isDisplayed();
	}

	public void clickPagesLink() {
		// dar click en Songs
		wait.until(ExpectedConditions.elementToBeClickable(this.pagesLnk));
		this.pagesLnk.click();
		
	}

	public boolean hasPagesLink() {
		return wait.until(ExpectedConditions.visibilityOf(pagesLnk)).isDisplayed();
	}
}
