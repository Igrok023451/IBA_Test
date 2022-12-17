package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import util.property.ActionsKeyboardMouse;

public class LoginPage extends BasePage {

    @FindBy(xpath = "//button[@class='uk-button']")
    private WebElement activeLanguage;
    @FindBy(xpath = "//button[text()='ENG' and @class = 'uk-button active']")
    private WebElement changeToEng;
    @FindBy(xpath = "//button[text()='RUS' and @class = 'uk-button active']")
    private WebElement changeToRUS;
    @FindBy(xpath = "//input[@formcontrolname ='username']")
    private WebElement userName;
    @FindBy(xpath = "//input[@formcontrolname ='password']")
    private WebElement password;
    @FindBy(xpath = "//button[@class = 'uk-button uk-button-primary']")
    private WebElement buttonEnter;
    @FindBy(xpath = "//span[text() = 'Время на сервере:']")
    private WebElement checkGeneralPage;


    public LoginPage() {
        super();
    }

    public void changeLanguageEng() {
        activeLanguage.click();
    }
    public void assertChangeLanguageToEng(boolean type) {
        Assert.assertEquals(changeToEng.isDisplayed(), type);
    }
    public void assertChangeLanguageToRus(boolean type) {
        Assert.assertEquals(changeToRUS.isDisplayed(), type);
    }

    public void sendTextToUserField(String user) {
        userName.sendKeys(user);
    }
    public void sendTextToPasswordField(String psw) {
        password.sendKeys(psw);
    }
    public void clickToButtonSignIn() {
        buttonEnter.click();
    }

    public void pastLogin(String user) {
        actionsKeyboardMouse.pasteTextToElementFromKeyboard(userName, user);
    }

    public void pastPassword(String pass) {
        actionsKeyboardMouse.pasteTextToElementFromKeyboard(password, pass);
    }

    public void passEnter() {
        buttonEnter.sendKeys(Keys.ENTER);
    }

    public void assertThatPageOpen(String expected) {
        Assert.assertEquals(expected, checkGeneralPage.getText(), "You can't enter in the web site");
    }
}