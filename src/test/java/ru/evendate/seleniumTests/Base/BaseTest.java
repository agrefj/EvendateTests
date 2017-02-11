package ru.evendate.seleniumTests.Base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

/**
 * Created by agref on 05.02.2017.
 */
public class BaseTest {
//    private WebDriver driver;
//    private WebDriverWait wait;
//
//    @Before
//    public void start() {
//        driver = new ChromeDriver();
//        wait = new WebDriverWait(driver,10);
//    }
//
//
//    @After
//    public void stop(){
//        driver.quit();
//        driver = null;
//    }

    public static void openMainPage(WebDriver driver){
        driver.get("http://evendate.ru");
    }

    public static void makePause(WebDriver driver, int duration){
        driver.manage().timeouts().implicitlyWait(duration, TimeUnit.SECONDS);
    }

    public static void  makeHardPause(int duration) throws InterruptedException {
        Thread.sleep(duration);
    }

}
