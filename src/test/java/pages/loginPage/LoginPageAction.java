package pages.loginPage;

import org.openqa.selenium.Keys;
import org.testng.Assert;

public class LoginPageAction extends LoginPage {
    public LoginPageAction() {
        super();
    }

    public void changeLanguageToRus() {
        changeToRUS.click();
    }

    public void changeLanguageToEng() {
        changeToEng.click();
    }

    public void sendTextToUserField(String user) {
        userName.sendKeys(user);
    }

    public void cleanFieldUsername() {
        userName.clear();
    }

    public void sendTextToPasswordField(String psw) {
        password.sendKeys(psw);
    }

    public void cleanFieldPassword() {
        password.clear();
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

    public void selectAllTextUserName() {
        actionsKeyboardMouse.selectAllTextToElementFromKeyboard(userName);
    }

    public void copyTextUsername() {
        actionsKeyboardMouse.copyTextToElementFromKeyboard(userName);
    }

    public void cutTextUsername() {
        actionsKeyboardMouse.cutTextToElementFromKeyboard(userName);
    }

    public void selectAllTextPassword() {
        actionsKeyboardMouse.selectAllTextToElementFromKeyboard(password);
    }

    public void copyTextPassword() {
        actionsKeyboardMouse.copyTextToElementFromKeyboard(password);
    }

    public void cutTextPassword() {
        actionsKeyboardMouse.cutTextToElementFromKeyboard(password);
    }

    public void deleteTextByDeleteUsername() {
        userName.sendKeys(Keys.DELETE);
    }

    public void deleteTextByBackspaceUsername() {
        userName.sendKeys(Keys.BACK_SPACE);
    }

    public void deleteTextByDeletePassword() {
        password.sendKeys(Keys.DELETE);
    }

    public void deleteTextByBackspacePassword() {
        password.sendKeys(Keys.BACK_SPACE);
    }
}