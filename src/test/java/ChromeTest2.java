import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeTest2 {
    @Test

    public  void testAmazon() throws InterruptedException{
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        driver.findElement(By.id("nav-hamburger-menu")).click();
        Thread.sleep(2000);

        WebElement text =driver.findElement(By.id("nav-hamburger-menu"));
        Assert.assertTrue(text.isDisplayed());
        driver.close();
    }

    @Test
    public void testSeleniumPractice()  throws InterruptedException{
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.practiceselenium.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Let's Talk Tea")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("name")).sendKeys("John"+ Keys.ENTER);
        driver.findElement(By.name("email")).sendKeys("abc123@gmail.com"+ Keys.ENTER);
        driver.findElement(By.name("subject")).sendKeys("special request"+ Keys.ENTER);
        driver.findElement(By.name("message")).sendKeys("some text"+ Keys.ENTER);
        driver.findElement(By.className("form-submit")).click();

        driver.close();

    }
}
