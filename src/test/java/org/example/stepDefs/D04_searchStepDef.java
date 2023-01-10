package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P02_login;
import org.example.pages.P03_homePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import java.util.List;

public class D04_searchStepDef {

    P02_login login = new P02_login();
    P03_homePage home  = new P03_homePage();

    @Given("user logged in")
    public void login() {
        login.websiteLink().click();
        login.login("test@example.com","P@ssw0rd");
    }
    @And("user located in home page")
    public void toHome() {
        home.homePageLink().click();
    }

    @When("^user enter product name as \"(.*)\"$")
    public void typeProductName(String item) {
        home.searchField().sendKeys(item);
    }

    @And("user press enter")
    public void pressEnter() {
        home.searchField().sendKeys(Keys.ENTER);
    }

    @Then("^search results should appears and contain \"(.*)\"$")
    public void SucessAssertion(String item) {
        SoftAssert soft = new SoftAssert();
        soft.assertTrue( Hooks.driver.getCurrentUrl().contains("https://demo.nopcommerce.com/search?q="));
        List<WebElement> products = home.products();
        for (WebElement product : products) {
            soft.assertTrue( home.productTitle(product).getText().toLowerCase().trim().contains(item) );
        }
        soft.assertAll();
    }

    @When("^user enter product sku as \"(.*)\"$")
    public void typeProductSKU(String sku) {
        home.searchField().sendKeys(sku);
    }

    @Then("search result should appears and contain {string}")
    public void searchResultShouldContain(String item) {
        List<WebElement> products = home.products();
        for (WebElement product : products) {
            product.click();
            System.out.println(this.home.getSKU().getText());
            System.out.println(item);
            Assert.assertTrue( this.home.getSKU().getText().toLowerCase().trim().contains(item.toLowerCase()) );
        }
    }
}
