package ru.evendate.seleniumTests.LandingPage.AuthorizationTests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.evendate.seleniumTests.Base.BaseTest;
import ru.evendate.seleniumTests.LandingPage.LandingButtons;

import java.util.concurrent.TimeUnit;

/**
 * Created by agref on 05.02.2017.
 */
public class FacebookAuthTest extends BaseTest {

    private WebDriver driver;
    private WebDriverWait wait;

    @Before
    public void start() {
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver,10);
    }


    @Test
    public void FacebookAuthTest() throws InterruptedException {
        BaseTest.openMainPage(driver);
        driver.manage().window().maximize();
        BaseTest.makeHardPause(3500);
        LandingButtons.clickAuthButton(driver);
        LandingButtons.authViaFacebook(driver);







    }




//    @After
//    public void stop(){
//        driver.quit();
//        driver = null;
//    }

}
