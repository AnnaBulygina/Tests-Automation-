package net.artsy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

public class Browser {

    @Test //Search function positive
    public static void main (String [] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
        driver.get("https://www.artsy.net");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        WebElement mainSearchBar = driver.findElement(By.id("main-layout-search-bar-input"));
        String searchTermText = "Frangipani";
        mainSearchBar.sendKeys(searchTermText);
        mainSearchBar.submit();

        WebElement searchTerm = driver.findElement(By.id("search-term"));
        WebElement searchQuery = driver.findElement(By.className("search-query"));
        WebElement searchResultTitle = driver.findElement(By.className("search-result-title"));

        Assert.assertEquals(searchTerm.getText(), "Frangipani");
        Assert.assertEquals(searchQuery.getText(), "Search results for" + "“" + searchTerm.getText() + "”");
        Assert.assertTrue(searchResultTitle.getText().contains("Frangipani"));

        /*searchResultTitle.getText().toLowerCase().contains(searchTermText.toLowerCase());
        //System.out.println(searchResultTitle.toString());*/

        /*java.util.List allSearchResultTitles = driver.findElements(By.className("search-result-title"));
        System.out.println(allSearchResultTitles);*/

        Thread.sleep(10000);

        driver.quit();

        System.out.println("Test 1 - Search function positive - finished successfully.");

    }

    // --- UNCOMMENT THIS TEST (AND COMMENT THE PREVIOUS ONE) TO EXECUTE ! ---
    /*@Test //Search function negative
    public static void main (String [] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

        driver.get("https://www.artsy.net");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String searchTermText = "oction";
        WebElement mainSearchBar = driver.findElement(By.id("main-layout-search-bar-input"));
        mainSearchBar.sendKeys(searchTermText);
        mainSearchBar.submit();

        WebElement searchTerm = driver.findElement(By.id("search-term"));
        WebElement searchQuery = driver.findElement(By.className("search-query"));
        WebElement searchResults = driver.findElement(By.className("search-results"));

        Assert.assertEquals(searchTerm.getText(), "oction");
        Assert.assertEquals(searchQuery.getText(), "Search results for" + "“" + searchTerm.getText() + "”");
        Assert.assertEquals(searchResults.getText(), "Nothing found");

        Thread.sleep(10000);

        driver.quit();

        System.out.println("Test 2 - Search function negative - finished successfully.");
    }*/

    // --- THIS TEST DOESN'T WORK ! ---
    /*@Test //Search function - Number of results pro page
    public static void main (String [] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

        driver.get("https://www.artsy.net");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        String searchTermText = "sunflower";
        WebElement mainSearchBar = driver.findElement(By.id("main-layout-search-bar-input"));
        mainSearchBar.sendKeys(searchTermText);
        mainSearchBar.submit();

        WebElement searchResultInfo = driver.findElements(By.className("search-result-info"));

        Assert.assertArrayEquals(searchResultInfo);

        //Thread.sleep(10000);
    }*/

    // --- THIS TEST DOESN'T WORK ! ---
    /*@Test //Search function - Price filter check
    public static void main (String [] args) throws Exception {
        ChromeDriver driver = new ChromeDriver();
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");

        driver.get("https://www.artsy.net");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        WebElement Artworks = driver.findElementByCssSelector("*[class='mlh-top-nav-link.is-inactive']");
        Artworks.click();



        //Thread.sleep(10000);
    }*/

}

