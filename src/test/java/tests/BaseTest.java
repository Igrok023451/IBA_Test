package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;
import pages.loginPage.LoginPage;
import pages.securityPage.SecurityCertificatePage;
import steps.LoginSteps;
import steps.passSecuritySystem.SearchSecuritySystemStep;
import steps.passSecuritySystem.SecuritySystemSteps;
import util.driver.Driver;
import util.property.XLUtility;

import java.io.IOException;

import static util.property.PropertyReader.getInstance;

public class BaseTest {
    protected static WebDriver driver;

    protected String[] excelData;
    protected XLUtility excel = new XLUtility(getInstance().getValue("fileForSubscriber"));
    private int numberSheet = Integer.parseInt(getInstance().getValue("numberSheet"));
    private int numberRow = Integer.parseInt(getInstance().getValue("numberRow"));
    private int numberCell = Integer.parseInt(getInstance().getValue("numberCell"));
    protected LoginSteps steps;
    LoginPage loginPage;
    SecuritySystemSteps systemSteps;

    SearchSecuritySystemStep searchSecuritySystemStep = new SearchSecuritySystemStep();


    @BeforeTest(groups = "checkingTests")
    public void start() throws IOException {
        driver = Driver.getDriver();
        Driver.settingDriver();
        driver.get(getInstance().getValue("url"));
        systemSteps = new SecuritySystemSteps();
        steps = new LoginSteps();
        loginPage = new LoginPage();
        excelData = excel.getSubscriberText(numberSheet, numberRow, numberCell);
        searchSecuritySystemStep.verifyThatPageOpen();
        systemSteps.passTheSecuritySystem().verifyThatTheSystemHasPassed();
    }

//    @AfterMethod
//    public void exit() {
//       driver.close();
//    }
    @DataProvider(name = "LogIn")
    protected Object[][] getData() {
        return new String[][]{
                {"admin", "admin", "userlog"},
                // {"admin", "ad", "Invalid"}
        };
    }
    @DataProvider(name = "UserIncorrect")
    protected Object[][] getDateIncorrect() {
        return new String[][]{
                {"ad","ad", " Проверьте корректность введенных имени пользователя и/или пароля "}
        };
    }
}