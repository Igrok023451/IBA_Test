package pages.loginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//button[@class='uk-button']")
    protected WebElement activeLanguage;
    @FindBy(xpath = "//button[text()='ENG']")
    protected WebElement changeToEng;
    @FindBy(xpath = "//button[text()='RUS']")
    protected WebElement changeToRUS;
    @FindBy(xpath = "//input[@formcontrolname ='username']")
    protected WebElement userName;
    @FindBy(xpath = "//input[@formcontrolname ='password']")
    protected WebElement password;
    @FindBy(xpath = "//button[@class = 'uk-button uk-button-primary']")
    protected WebElement buttonLogIn;
    @FindBy(xpath = "//div[@class = 'userlog']")
    protected WebElement checkGeneralPageAndOpenSystemMenu;
    @FindBy(xpath = "//div[@class = 'user-menu']/div/a")
    protected WebElement linkExit;
    @FindBy(xpath = "//div[@class = 'login-form-header']")
    protected WebElement checkLogInPage;

    @FindBy(css = "input[formcontrolname='username'] + i")
    protected WebElement userNameAlert;

    public LoginPage() {
        super();
    }

}