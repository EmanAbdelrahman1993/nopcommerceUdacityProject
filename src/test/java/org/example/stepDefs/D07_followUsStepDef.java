package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;

import java.util.ArrayList;

import static org.example.stepDefs.Hooks.driver;

public class D07_followUsStepDef {

    P03_homePage home = new P03_homePage();

    @When("clicks on facebook link")
    public void openFacebook() {
        home.facebookIcon().click();
    }

    @And("user moves to new tab")
    public void switchTab() {
        ArrayList<String> tabs = new ArrayList<String> (Hooks.driver.getWindowHandles());
        if(tabs.size() > 1)
            Hooks.driver.switchTo().window(tabs.get(1));
    }

    @When("clicks on twitter link")
    public void openTwitter() {
        home.twitterIcon().click();
    }

    @When("clicks on rss link")
    public void openRss() {
        home.rssIcon().click();
    }

    @When("clicks on youtube link")
    public void openYoutube() {
        home.youtubeIcon().click();
    }

    @Then("page url should be {string}")
    public void assertURL(String url) {
        Assert.assertTrue( Hooks.driver.getCurrentUrl().contains(url) );
    }
}
