package pages.loginPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class LoginPage extends BasePage {
    public LoginPage() {
        super();
    }

    @FindBy(xpath = "//div[@class = 'login-form-header']")
    protected WebElement isLogInPage;
    @FindBy(xpath = "//button[@class = 'uk-button active']")
    protected WebElement activeLanguage;
    @FindBy(xpath = "//button[text()='ENG']")
    protected WebElement changeToEng;
    @FindBy(xpath = "//button[text()='RUS']")
    protected WebElement changeToRUS;
    @FindBy(xpath = "//div[@class = 'login-form-header']")
    protected WebElement titleLogIn;
    @FindBy(xpath = "//label[text() = 'Логин']")
    protected WebElement loginTitleRus;
    @FindBy(xpath = "//label[text() = 'Пароль']")
    protected WebElement passwordTitleRus;
    @FindBy(xpath = "//button[text() = 'Войти']")
    protected WebElement buttonNameLogInRus;
    @FindBy(xpath = "//p[@class = 'all-rights-reserved-text']")
    protected WebElement nameCompany;
    @FindBy(xpath = "//label[text() = 'Username']")
    protected WebElement loginTitleEng;
    @FindBy(xpath = "//label[text() = 'Password']")
    protected WebElement passwordTitleEng;
    @FindBy(xpath = "//button[text() = 'Sign in']")
    protected WebElement buttonNameLogInEng;
    @FindBy(xpath = "//input[@formcontrolname ='username']")
    protected WebElement userName;
    @FindBy(xpath = "//input[@formcontrolname ='password']")
    protected WebElement password;
    @FindBy(xpath = "//button[@class = 'uk-button uk-button-primary']")
    protected WebElement buttonLogIn;
    @FindBy(xpath = "//div[@class = 'login-form-header']")
    protected WebElement checkLogInPage;
    @FindBy(css = "input[formcontrolname='username'] + i")
    protected WebElement userNameAlert;
    @FindBy(css = "input[formcontrolname='password'] + i")
    protected WebElement passwordAlert;
    @FindBy(css = "[class='alert-cont my-translated-paragraph']")
    protected WebElement errorAlert;
}