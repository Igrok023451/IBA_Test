package LogInTest;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogInTest extends BasePage_ {

    @DataProvider(name = "LogIn")
    public Object[][] getData() {
        return new String[][]{
                {"admin", "admin", "Время на сервере:"},
               // {"admin", "ad", "Invalid"}
        };
    }
    @Test(dataProvider = "LogIn")
    public void enterInBilling(String user, String psw, String exp) {
        driver.get("https://test-billing.mtis.by/mtis-web-billing/#/");
        ///check security
        driver.findElement(By.xpath("//button[@aria-expanded = 'false']")).click();
        driver.findElement(By.xpath("//p[@id='final-paragraph']/a")).click();
        ///enter in system
        driver.findElement(By.xpath("//input[@formcontrolname ='username']")).sendKeys(user);
        driver.findElement(By.xpath("//input[@formcontrolname ='password']")).sendKeys(psw);
        driver.findElement(By.xpath("//button[@class = 'uk-button uk-button-primary']")).click();
        ///Check website
        String actual = driver.findElement(By.xpath("//span[text() = 'Время на сервере:']")).getText();
        Assert.assertEquals(exp, actual, "You can't enter in the web site");
    }
}