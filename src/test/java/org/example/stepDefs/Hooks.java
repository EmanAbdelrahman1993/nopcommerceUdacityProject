package org.example.stepDefs;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class Hooks {

public static WebDriver driver;

@Before
    public static void OpenBrowser()
    {
        //1- Bridge
        //System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        //System.setProperty("webdriver.chrome.driver","C:\\Users\\Ali\\IdeaProjects\\ECommerceProject\\src\\main\\resources\\chromedriver.exe");
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver", chromePath);
        //2- Create object from chromeBrowser
        driver = new ChromeDriver();
        //3- Configurations
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 4- navigate to url
        //driver.get("https://demo.nopcommerce.com/");
        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

    }


    @After
    public static void quitDriver () throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
