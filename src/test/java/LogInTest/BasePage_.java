package LogInTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import util.property.XLUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static util.property.PropertyReader.getInstance;

public abstract class BasePage_ {
    protected WebDriver driver;
    protected String[] excelData;
    protected XLUtility excel = new XLUtility(getInstance().getValue("fileForSubscriber"));
    protected int numberSheet = Integer.parseInt(getInstance().getValue("numberSheet"));
    protected int numberRow = Integer.parseInt(getInstance().getValue("numberRow"));
    protected int numberCell = Integer.parseInt(getInstance().getValue("numberCell"));

    @BeforeMethod
    public void setUp(){
        try {
            excelData = excel.getSubscriberText(numberSheet, numberRow, numberCell);
        } catch (IOException e){
            e.getMessage();
        }

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @AfterMethod
    private void close(){
        driver.quit();
    }

}
