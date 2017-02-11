package ru.evendate.seleniumTests.LandingPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by agref on 05.02.2017.
 */
public class LandingButtons {

    public static void clickAuthButton(WebDriver driver){
        WebElement authButton = driver.findElement(By.linkText("Войти"));
        authButton.click();
    }


    public static void clickFacebookAuthButton(WebDriver driver){
//        WebElement facebookAuthButton = driver.findElement(By.xpath("//a[@class='social-btn fb-btn facebook-btn']"));
        WebElement facebookAuthButton = driver.findElement(By.linkText("Facebook"));
        facebookAuthButton.click();
    }

    public static void enterFacebookLogin(WebDriver driver){
        String facebookLogin = "Evendateautotests@gmail.com";
        WebElement facebookLoginInput = driver.findElement(By.id("email"));
        facebookLoginInput.sendKeys(facebookLogin);
    }

    public static void enterFacebookPassword(WebDriver driver){
        String facebookPassword = "Evendate123Test";
        WebElement facebookPasswordInput = driver.findElement(By.id("pass"));
        facebookPasswordInput.sendKeys(facebookPassword);
    }
    public static void clickFacebookNextButton(WebDriver driver){
        WebElement facebookNextButton = driver.findElement(By.id("u_0_2"));
        facebookNextButton.click();
    }

    public static void authViaFacebook(WebDriver driver){
        clickFacebookAuthButton(driver);
        enterFacebookLogin(driver);
        enterFacebookPassword(driver);
        clickFacebookNextButton(driver);
    }
}
