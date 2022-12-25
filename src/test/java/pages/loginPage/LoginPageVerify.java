package pages.loginPage;

import org.testng.Assert;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class LoginPageVerify extends LoginPageAction {
    public LoginPageVerify() {
        super();
    }
    public void verifyThatIsLogInPage() {
    isLogInPage.isDisplayed();
    }

    public void verifyThatLanguageIsRus() {
        Assert.assertEquals("RUS", activeLanguage.getText(), "Language page is not Russian");
    }
    public void verifyThatLanguageIsEng() {
        Assert.assertEquals("ENG", activeLanguage.getText(), "Language page is not English");
    }
    public void verifyThatInterfaceChangeLanguageToEng() {
        Assert.assertEquals("Login to your account", titleLogIn.getText(), "Language page is not English");
        Assert.assertEquals("Username", loginTitleEng.getText(), "Language page is not English");
        Assert.assertEquals("Password", passwordTitleEng.getText(), "Language page is not English");
        Assert.assertEquals("SIGN IN", buttonNameLogInEng.getText(), "Language page is not English");
        Assert.assertEquals("All rights reserved ©2007-2018 OJSC Minsk Television Information Networks", nameCompany.getText(), "Language page is not English");
    }
    public void verifyThatInterfaceChangeLanguageToRus() {
        Assert.assertEquals("Вход в биллинговую систему", titleLogIn.getText(), "Language page is not English");
        Assert.assertEquals("Логин", loginTitleRus.getText(), "Language page is not English");
        Assert.assertEquals("Пароль", passwordTitleRus.getText(), "Language page is not English");
        Assert.assertEquals("ВОЙТИ", buttonNameLogInRus.getText(), "Language page is not English");
        Assert.assertEquals("Все права защищены ©2007-2019 ОАО «Минские телевизионные информационные сети»", nameCompany.getText(), "Language page is not English");
    }
    public void verifyThatIsLogInPage(String expected) {
        Assert.assertEquals(expected, checkLogInPage.getAttribute("class"), "You can't enter in the web site");
    }
    public void verifyThatClipboardHasData(String expected) throws IOException, UnsupportedFlavorException {
        Assert.assertEquals(expected, actionsKeyboardMouse.getTextThatKeepInClipboard());
    }
    public void verifyThatFieldUsernameCleanAndAlertWork(String actual) {
        Assert.assertEquals(actual, userNameAlert.getAttribute("ng-reflect-text"), "Thq field doesn't keep Valid control");
    }
    public void verifyThatFieldPasswordCleanAndAlertWork(String actual) {
        Assert.assertEquals(actual, passwordAlert.getAttribute("ng-reflect-text"), "Thq field doesn't keep Valid control");
    }
    public void verifyThatErrorAppeared(String actual) {
        Assert.assertEquals(actual, errorAlert.getText(), "System error failed");
    }
    public void assertThatButtonBackspaceWork(String actual) {
        Assert.assertEquals(actual, userNameAlert.getAttribute("ng-reflect-text"), "Thq field doesn't keep Valid control");
    }
}