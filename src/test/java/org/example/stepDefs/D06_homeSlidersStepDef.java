package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stepDefs.Hooks.driver;

public class D06_homeSlidersStepDef {

    P03_homePage home  = new P03_homePage();

    @When("user click on first slider")
    public void userClicksOnFirstSlider() throws InterruptedException {
        home.Nokia().click();
        //home.homeSlider("1").click();
        Thread.sleep(3000);
    }

    @Then("related product page opens for first slider")
    public void productPageOpensForFirstSlider() {
        String expectedResult = "https://demo.nopcommerce.com/nokia-lumia-1020";
        Assert.assertEquals(driver.getCurrentUrl().contains(expectedResult), true);
    }

    @And("user scroll down")
    public void scroll()
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,75)", "");
    }

    @When("user click on second slider")
    public void userClicksOnSecondSlider() throws InterruptedException {
        home.IPhone().click();
        //home.homeSlider("2").click();
        Thread.sleep(3000);

    }

    @Then("user should be directed to {string}")
    public void pageOpenSlider(String expectedResult) {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue(driver.getCurrentUrl().contains(expectedResult));
        soft.assertAll();





    }
}
