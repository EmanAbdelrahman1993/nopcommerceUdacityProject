package org.example.stepDefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P03_homePage;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D03_currenciesStepDef {

P03_homePage home = new P03_homePage();

    @Given("user go to home page")
    public void homePage()
    {
        home.homePageLink().click();
    }

    @When("select Euro currency from the dropdown menu")
    public void euroCurrency()
    {
        home.currencyList().sendKeys("Euro");
    }

    @Then("Euro Symbol is shown on the 4 products that are displayed in Home page")
    public void euroSymbol()
    {
        List<WebElement> products = home.productImage();
        SoftAssert soft = new SoftAssert();
        for(WebElement product : products) {
            soft.assertTrue( home.productPrice(product).getText().contains("€"));
        }
        soft.assertAll();
    }

}
