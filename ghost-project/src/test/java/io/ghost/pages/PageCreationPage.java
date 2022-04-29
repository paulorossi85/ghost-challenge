package io.ghost.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class PageCreationPage extends BasePage {

	@FindBy(css="textarea.gh-editor-title")
	WebElement pageTitleTxt;

	@FindBy(css=".koenig-editor__editor p")
	WebElement pageContentTxt;

	@FindBy(css=".gh-publishmenu")
	WebElement publishMenuBtn;

	@FindBy(css=".gh-publishmenu-button")
	WebElement publishBtn;

	@FindBy(css="a[href='#/pages/']")
	WebElement pagesLink;

	public PageCreationPage(WebDriver driver) {
		super(driver);
	}

	public void publishPage(String title, String pageContent) {
		this.wait.until(ExpectedConditions.elementToBeClickable(pageTitleTxt));
		this.pageTitleTxt.sendKeys(title);
		this.pageContentTxt.sendKeys(pageContent + "\n");
		this.publishMenuBtn.click();
		this.wait.until(ExpectedConditions.visibilityOf(publishBtn));
		publishBtn.click();
		this.wait.until(ExpectedConditions.textToBePresentInElement(publishMenuBtn, "Update"));
		this.pagesLink.click();
	}
}
