package io.ghost.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.ExpectedConditions;

public class SigninPage extends BasePage {

	@FindBy(css =  "[name='identification']")
	WebElement emailTxt;
	
	@FindBy(css =  "[name='password']")
	WebElement passField;

	@FindBy(css =  "button[type='submit']")
	WebElement signinButton;

	@FindBy(css = "p.main-error")
	WebElement mainErrorTxt;

	public SigninPage(WebDriver driver) {
		super(driver);
	}

	public void goTo() {
		driver.get("http://localhost:2368/ghost");
	}

	public void correctLogin(String email, String password) {
		wait.until(ExpectedConditions.visibilityOf(emailTxt));
		emailTxt.sendKeys(email);
		passField.sendKeys(password);
		wait.until(ExpectedConditions.elementToBeClickable(signinButton));
		signinButton.click();

	}

	public boolean isSigninErrorVisible() {
		return mainErrorTxt.isDisplayed();
	}
}
