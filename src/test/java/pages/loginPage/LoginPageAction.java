package pages.loginPage;

import org.openqa.selenium.Keys;
import org.testng.Assert;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class LoginPageAction extends LoginPage{
    LoginPage loginPage = new LoginPage();
    public LoginPageAction() {
        super();
    }

    public void changeLanguage() {
        activeLanguage.click();
    }

    public void changeLanguageToRus() {
        changeToRUS.click();
    }
    public void changeLanguageToEng() {
        changeToEng.click();
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
        buttonLogIn.click();
    }

    public void pastLogin(String user) {
        actionsKeyboardMouse.pasteTextToClipboardFromElementFromKeyboard(userName, user);
    }

    public void pastPassword(String pass) {
        actionsKeyboardMouse.pasteTextToClipboardFromElementFromKeyboard(password, pass);
    }

    public void passEnter() {
        buttonLogIn.sendKeys(Keys.ENTER);
    }

    public void assertThatPageOpen(String expected) {
        Assert.assertEquals(expected, checkGeneralPageAndOpenSystemMenu.getAttribute("class"), "You can't enter in the web site");
    }

    public void openPersonalMenu() {
        checkGeneralPageAndOpenSystemMenu.click();
    }


    public void clickLinkLogOut() {
        linkExit.click();
    }

    public void assertThatIsLogInPage(String expected) {
        Assert.assertEquals(expected, checkLogInPage.getAttribute("class"), "You can't enter in the web site");
    }

    /////Actions methods
    public void selectAllText() {
        actionsKeyboardMouse.selectAllTextToElementFromKeyboard(userName);
    }

    public void copyText() {
        actionsKeyboardMouse.copyTextToElementFromKeyboard(userName);
    }

    public void cutText() {
        actionsKeyboardMouse.cutTextToElementFromKeyboard(userName);
    }
    public void deleteTextByDelete() {
        userName.sendKeys(Keys.DELETE);
    }
    public void deleteTextByBackspace() {
        userName.sendKeys(Keys.BACK_SPACE);
    }

    public void assertThatClipboardHasData(String expected) throws IOException, UnsupportedFlavorException {
        Assert.assertEquals(expected, actionsKeyboardMouse.getTextThatKeepInClipboard(), "You can't enter in the web site");
    }

    public void assertThatFillingControlWork(String actual) {
        Assert.assertEquals(actual, userNameAlert.getAttribute("ng-reflect-text"), "Thq field doesn't keep Valid control");
    }
    public void assertThatButtonDeleteWork(String actual) {
        Assert.assertEquals(actual, userNameAlert.getAttribute("ng-reflect-text"), "Thq field doesn't keep Valid control");
    }
    public void assertThatButtonBackspaceWork(String actual) {
        Assert.assertEquals(actual, userNameAlert.getAttribute("ng-reflect-text"), "Thq field doesn't keep Valid control");
    }

}
