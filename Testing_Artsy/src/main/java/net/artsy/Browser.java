package net.artsy;

//import jdk.tools.jaotc.collect.SearchPath;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.SystemClock;
import org.w3c.dom.html.HTMLTitleElement;

import java.util.concurrent.TimeUnit;

public class Browser {
    @Test
    public static void main (String [] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
        //FirefoxDriver driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\geckodriver-v0.22.0-win64\\geckodriver.exe");

        driver.get("https://www.artsy.net");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.findElement(By.id("main-header-search-box"));
        driver.findElement(By.cssSelector("input[name='term']")).click();
        //driver.findElement(By.id("main-header-search-box")).sendKeys("frangipani");
        //driver.findElement(By.id("input[type='main-header-search-button']")).click();
        //driver.findElement(By.cssSelector("input[type='submit']")).click();

        Thread.sleep(10000);



        driver.quit();

    }
}
