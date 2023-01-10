package org.example.pages;
import org.example.stepDefs.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P01_register {

    public WebElement registerlink()
    {
        return Hooks.driver.findElement(By.className("ico-register"));
    }
    public WebElement gender()
    {
        return Hooks.driver.findElement(By.className("male"));
    }
    public WebElement fname()
    {
        return Hooks.driver.findElement(By.id("FirstName"));
    }
    public WebElement lname()
    {
        return Hooks.driver.findElement(By.id("LastName"));
    }
    public WebElement day()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthDay"));
    }
    public WebElement month()
    {
        return Hooks.driver.findElement(By.name("DateOfBirthMonth"));
    }
    public WebElement year()
    {
        return Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[3]"));
    }
    public WebElement email()
    {
        return Hooks.driver.findElement(By.id("Email"));
    }
    public WebElement password()
    {
        return Hooks.driver.findElement(By.id("Password"));
    }
    public WebElement confirmPassword()
    {
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public WebElement button()
    {
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public WebElement confirmationMessage()
    {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"result\"]"));
    }







}
