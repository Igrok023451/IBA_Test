package freymwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class BasePage_ {
   public static WebDriver driver;


    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://test-billing.mtis.by/mtis-web-billing/#/");
        WebElement but0 = driver.findElement(By.xpath("//button[@aria-expanded = 'false']"));
        but0.click();
        WebElement but1 = driver.findElement(By.xpath("//p[@id='final-paragraph']/a"));
        but1.click();
        WebElement but = driver.findElement(By.xpath("//input[@formcontrolname ='username']"));

    }

}
