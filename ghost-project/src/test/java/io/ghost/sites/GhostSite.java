package io.ghost.sites;

import io.ghost.pages.HomePage;
import io.ghost.pages.PageCreationPage;
import io.ghost.pages.PageListPage;
import io.ghost.pages.SigninPage;
import org.openqa.selenium.WebDriver;

public class GhostSite {
    private HomePage home;
    private SigninPage signin;
    private PageListPage pageList;
    private PageCreationPage pageCreation;
    private WebDriver driver;

    public GhostSite(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage home() {
        if(home == null) {
            home = new HomePage(driver);
            return home;
        }
        return home;
    }

    public SigninPage signin() {
        if(home == null) {
            return new SigninPage(driver);
        }
        return signin;
    }

    public PageListPage pageList() {
        if(pageList == null) {
            return new PageListPage(driver);
        }
        return pageList;
    }

    public PageCreationPage pageCreation() {
        if(pageCreation == null) {
            return new PageCreationPage(driver);
        }
        return pageCreation;
    }
}
