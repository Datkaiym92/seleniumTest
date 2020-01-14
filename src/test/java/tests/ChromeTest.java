package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ChromeTest {

    @Test

    public void testPartialLink() throws InterruptedException{
        WebDriverManager.chromedriver().setup(); // used instead of system.property
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);
        driver.findElement(By.partialLinkText("Search")).click();
        String expectedTitle = "Discover How Google Search Works";
        Assert.assertTrue(driver.getTitle().contains(expectedTitle));

        driver.close();

    }
    @Test
    public void testSearch() throws InterruptedException{
         WebDriverManager.chromedriver().setup();

         WebDriver driver =new ChromeDriver();
        driver.get("https://www.google.com/");
        Thread.sleep(2000);

        driver.findElement(By.name("q")).sendKeys("Australia" + Keys.ENTER);
        Thread.sleep(2000);
        Assert.assertTrue(driver.getTitle().contains("Australia"));

        driver.close();
    }


//    @Test
//    public void testExpedia()throws InterruptedException{
//
//        WebDriverManager.chromedriver().setup();
//        WebDriver driver = new ChromeDriver();
//        driver.get("https://www.expedia.com/");
//        Thread.sleep(2000);
//        driver.findElement(By.id("tab-flight-tab-hp")).click();
//        driver.findElement(By.id("flight-origin-hp-flight")).sendKeys("PITT");
//        driver.findElement(By.id("flight-destination-hp-flight")).sendKeys("Chicago, IL (ORD-O'Hare Intl.");
//        driver.findElement(By.xpath("//button[@data-day='30'][1]")).click();
//        //driver.findElement(By.id("package-returning-hp-package")).sendKeys("01/15/2020");
//        driver.findElement(By.id("package-advanced-preferred-class-hp-package")).sendKeys("Economy/Coach");
//        driver.findElement(By.linkText("Search"));
//    }

}
