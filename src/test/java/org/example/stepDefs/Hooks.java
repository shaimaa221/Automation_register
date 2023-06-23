package org.example.stepDefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver;
    public static void OpenBrowser() {
        //creat objectfrom driver
        driver = new ChromeDriver();
        //configration from driver
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //navigate to url
        driver.get("https://codenboxautomationlab.com/registration-form/");
    }

    public static void quitDriver() throws InterruptedException {
        Thread.sleep(10000);
        driver.quit();
    }

}


