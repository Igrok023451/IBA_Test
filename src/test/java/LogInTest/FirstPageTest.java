package LogInTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import util.property.XLUtility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import static util.property.PropertyReader.getInstance;

public class FirstPageTest {
    WebDriver driver;
    String[] excelData;
    XLUtility excel = new XLUtility(getInstance().getValue("fileForSubscriber"));
    int numberSheet = Integer.parseInt(getInstance().getValue("numberSheet"));
    int numberRow = Integer.parseInt(getInstance().getValue("numberRow"));
    int numberCell = Integer.parseInt(getInstance().getValue("numberCell"));


    @BeforeTest
    public void beforeTest() throws IOException {
        excelData = excel.getSubscriberText(numberSheet, numberRow, numberCell);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @Test
    public void startBrowser() {
        driver.get("https://test-billing.mtis.by/mtis-web-billing/#/");
        ///check security
        driver.findElement(By.xpath("//div[@class = 'nav-wrapper']/button[3]")).click();
        driver.findElement(By.xpath("//div[@id = 'details']/p[@id='final-paragraph']/a")).click();
        ///enter in system
        driver.findElement(By.xpath("//div[@class='uk-form-controls']/input[@formcontrolname ='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//div[@class='uk-form-controls']/input[@formcontrolname ='password']")).sendKeys("admin");
        driver.findElement(By.xpath("//button[@class = 'uk-button uk-button-primary']")).click();
        ///create new person
        driver.findElement(By.xpath("//a[@data-target='#CSR']")).click();
        driver.findElement(By.xpath("//a[@data-target='#subs-create']")).click();
        driver.findElement(By.xpath("//a[@ng-reflect-router-link='/subscribers/create-individual']")).click();
        /////////////////General information
        ///Last Name
        driver.findElement(By.xpath("//div[@class='uk-form-controls']/textarea[@formcontrolname='lastName']")).sendKeys(excelData[0]);
        ///Name
        driver.findElement(By.xpath("//div[@class='uk-form-controls']/textarea[@formcontrolname='firstName']")).sendKeys(excelData[1]);
        ///Middle name
        driver.findElement(By.xpath("//div[@class='uk-form-controls']/textarea[@formcontrolname='patronymic']")).sendKeys(excelData[2]);
        ///Sex
        driver.findElement(By.xpath("//div[@class='uk-form-controls']/p-dropdown[@formcontrolname='sexId']")).click();
        driver.findElement(By.xpath("//li[@aria-label='??????????????']")).click();
        ///Subscriber Category
        driver.findElement(By.xpath("//label[text() = '?????????????????? ????????????????']/following-sibling::div")).click();
        driver.findElement(By.xpath("//label[text() = '?????????????????? ????????????????']/following-sibling::div//span[text() = '??????????????????????']")).click();
        ///Subscriber Subgroup
        driver.findElement(By.xpath("//label[text() = '?????????????????? ????????????????']/following-sibling::div")).click();
        driver.findElement(By.xpath("//label[text() = '?????????????????? ????????????????']/following-sibling::div//span[text() = '??????????????????????']")).click();
        ///Residence RB
        driver.findElement(By.xpath("//label[text() = '?????????????????????? ????']/following-sibling::div")).click();
        driver.findElement(By.xpath("//li[@aria-label='????????????????????']")).click();
        ///Name country
        driver.findElement(By.xpath("//label[text() = '???????????????? ????????????']/following-sibling::div")).click();
        driver.findElement(By.xpath("//label[text() = '???????????????? ????????????']/following-sibling::div//input[@type= 'text' and @autocomplete ='off']")).sendKeys(excelData[3]);
        driver.findElement(By.xpath("//li[@aria-label='????????????????']")).click();
        ///Status*
        ///////////Identity document
        ///Type of documents
        driver.findElement(By.xpath("//div[contains(@class,'ng-tns-c5-12')]")).click();
        driver.findElement(By.xpath("//li[@aria-label='?????????????? ????']")).click();
        ///Document Number
        driver.findElement(By.xpath("//input[@formcontrolname='docNumber']")).sendKeys(excelData[4]);
        ///Personal Number
        driver.findElement(By.xpath("//input[@formcontrolname='personalNumber']")).sendKeys(excelData[5]);
        ///Date of Birth
        driver.findElement(By.xpath("//label[text() = '???????? ????????????????']/following-sibling::div/p-calendar")).click();
        driver.findElement(By.xpath("//span[text() ='??????????????']")).click();
        ///Place of Birth
        driver.findElement(By.xpath("//label[text() = '?????????? ????????????????']/following-sibling::div/textarea")).sendKeys(excelData[6]);
        ///date of issue
        driver.findElement(By.xpath("//label[text() = '???????? ????????????']/following-sibling::div/p-calendar")).click();
        driver.findElement(By.xpath("//span[text() ='??????????????']")).click();
        ///expiration date
        driver.findElement(By.xpath("//label[text() = '???????? ??????????????????']/following-sibling::div/p-calendar")).click();
        driver.findElement(By.xpath("//span[text() ='??????????????']")).click();
        ///Issued by
        driver.findElement(By.xpath("//label[text() = '?????? ??????????']/following-sibling::div/textarea")).sendKeys(excelData[7]);
        ///Registered address
        driver.findElement(By.xpath("//label[text() = '?????????? ???? ????????????????']/following-sibling::div/textarea")).sendKeys(excelData[8]);
        ///Note
        driver.findElement(By.xpath("//label[text() = '????????????????????']/following-sibling::div/textarea")).sendKeys(excelData[9]);
        //////////////////Contact information
        ///Contact number
        driver.findElement(By.xpath("//label[text() = '???????????????????? ??????????????']/following-sibling::div/input")).sendKeys(excelData[10]);
        ///Mobile number
        driver.findElement(By.xpath("//label[text() = '?????????????????? ??????????????']/following-sibling::div/input")).sendKeys(excelData[11]);
        ///Fax number
        driver.findElement(By.xpath("//label[text() = '?????????? ??????????']/following-sibling::div/input")).sendKeys(excelData[12]);
        ///Other numbers
        driver.findElement(By.xpath("//label[text() = '???????????? ????????????????']/following-sibling::div/input")).sendKeys(excelData[13]);
        ///E-mail
        driver.findElement(By.xpath("//label[text() = 'E-mail']/following-sibling::div/input")).sendKeys(excelData[14]);
        ///Post address
        driver.findElement(By.xpath("//label[text() = '???????????????? ??????????']/following-sibling::div/textarea")).sendKeys(excelData[15]);
        ///Address of residence/location
        driver.findElement(By.xpath("//label[text() = '?????????? ????????????????????/??????????????????????????????']/following-sibling::div/textarea")).sendKeys(excelData[16]);
        ///Notes
        driver.findElement(By.xpath("//h3[text()='???????????????????? ????????????????????']//following-sibling::div//label[text() = '????????????????????']//following-sibling::div/div/textarea")).sendKeys(excelData[17]);
        ///Additional address
        driver.findElement(By.xpath("//label[text() = '???????????????????????????? ??????????']/following-sibling::div/textarea")).sendKeys(excelData[18]);
        //////////Additional information
        ///Service manager
        driver.findElement(By.xpath("//label[text() = '?????????????????????????? ????????????????']/following-sibling::div")).click();
        driver.findElement(By.xpath("//label[text() = '?????????????????????????? ????????????????']/following-sibling::div//input[@autocomplete = 'off' and @type ='text']")).sendKeys(excelData[19]);
        driver.findElement(By.xpath("//li[@aria-label='????????????????????  ??. ??.']")).click();
        ///Migration base
        //driver.findElement(By.xpath("")).click();
        ///Subscriber code in the base
        //driver.findElement(By.xpath("")).click();
        ///Correspondence delivery method*
        driver.findElement(By.xpath("//label[text() = '???????????? ???????????????? ??????????????????????????????']/following-sibling::div/p-dropdown")).click();
        driver.findElement(By.xpath("//label[text() = '???????????? ???????????????? ??????????????????????????????']/following-sibling::div//li[@aria-label ='E-mail + ??????????']")).click();
        ///Codeword
        driver.findElement(By.xpath("//label[text() = '?????????????? ??????????']/following-sibling::div/textarea")).sendKeys(excelData[20]);
        ///Note
        driver.findElement(By.xpath("//h3[text()='???????????????????????????? ????????????????????']//following-sibling::div//label[text() = '????????????????????']//following-sibling::div/textarea")).sendKeys(excelData[21]);
        ///Unsubscribed from mailing list
        driver.findElement(By.xpath("//input[@ng-reflect-name = 'emailNoticeDisableBySubscr']")).click();
        ///Notification lang*
        driver.findElement(By.xpath("//label[text() = '???????? ??????????????????????']/following-sibling::div//p-dropdown")).click();
        driver.findElement(By.xpath("//label[text() = '???????? ??????????????????????']/following-sibling::div//li[@aria-label ='????????????????????']")).click();
        ////////////Additional field
        // driver.findElement(By.xpath("")).click();
        ///
        // driver.findElement(By.xpath("")).click();


    }

   /* @Test
    public void addPerson() {

    }
*/


}
