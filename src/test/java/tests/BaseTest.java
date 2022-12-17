package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import pages.LoginPage;
import pages.SecurityCertificatePage;
import steps.LoginSteps;
import util.driver.Driver;
import util.property.XLUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static util.property.PropertyReader.getInstance;

public class BaseTest {
    private static WebDriver driver;

    protected String[] excelData;
    protected XLUtility excel = new XLUtility(getInstance().getValue("fileForSubscriber"));
    private int numberSheet = Integer.parseInt(getInstance().getValue("numberSheet"));
    private int numberRow = Integer.parseInt(getInstance().getValue("numberRow"));
    private int numberCell = Integer.parseInt(getInstance().getValue("numberCell"));
    LoginSteps steps;
    LoginPage loginPage;

    @BeforeTest
    public void start() throws IOException {
        driver = Driver.getDriver();
        Driver.settingDriver();
        driver.get(getInstance().getValue("url"));
        SecurityCertificatePage securityCertificatePage = new SecurityCertificatePage();
        securityCertificatePage.clickSecurityPage();
        steps = new LoginSteps();
        loginPage = new LoginPage();
        excelData = excel.getSubscriberText(numberSheet, numberRow, numberCell);
    }
    @AfterMethod
    public void exit() {
       /// driver.navigate().back();
    }
    @DataProvider(name = "LogIn")
    public Object[][] getData() {
        return new String[][]{
                {"admin", "admin", "Время на сервере:"},
               /// {"admin", "ad", "Invalid"}
        };
    }


}
