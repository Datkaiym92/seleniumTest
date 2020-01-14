package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomeDepot {

    @Test
    public void testRegister() throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.homedepot.com/");
        driver.findElement(By.id("headerMyAccountTitle")).click();
        driver.findElement(By.id("SPSORegister")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gulnura2017@yahoo.com"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.id("password-input-field")).sendKeys("Abcdefjh123!"+ Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='zipCode']")).sendKeys("33617");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id='phone']")).sendKeys("8134543672");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@class='bttn__content'][1]"));
        driver.close();
    }
    }



