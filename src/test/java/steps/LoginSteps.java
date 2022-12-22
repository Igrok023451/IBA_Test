package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import util.property.ActionsKeyboardMouse;

public class LoginSteps {

    private ActionsKeyboardMouse action = new ActionsKeyboardMouse();
    private LoginPage loginPage = new LoginPage();
    public SearchResulLoginSteps changeLang() {
        loginPage.changeLanguage();
        return new SearchResulLoginSteps();
    }
    public SearchResulLoginSteps changeLangToRus() {
        loginPage.changeLanguageToRus();
        return new SearchResulLoginSteps();
    }
    public SearchResulLoginSteps changeLangToEng() {
        loginPage.changeLanguageToEng();
        return new SearchResulLoginSteps();
    }

    public SearchResulLoginSteps setUserValue(String user) {
        loginPage.sendTextToUserField(user);
        return new SearchResulLoginSteps();
    }

    public SearchResulLoginSteps setPasswordValue(String psw) {
        loginPage.sendTextToPasswordField(psw);
        return new SearchResulLoginSteps();
    }

    public SearchResulLoginSteps setUserAndPasswordValue(String user, String psw){
        loginPage.sendTextToUserField(user);
        loginPage.sendTextToPasswordField(psw);
        return new SearchResulLoginSteps();
    }

    public SearchResulLoginSteps pastUserAndPasswordValue(String user, String psw) {
        loginPage.pastLogin(user);
        loginPage.pastPassword(psw);
        return new SearchResulLoginSteps();
    }

    public SearchResulLoginSteps pushButtonSignInEnter() {
        loginPage.passEnter();
        return new SearchResulLoginSteps();
    }
    public SearchResulLoginSteps clickButtonSignIn(){
        loginPage.clickToButtonSignIn();
        return new SearchResulLoginSteps();
    }
    public SearchResulLoginSteps clickLogOut(){
        loginPage.openPersonalMenu();
        loginPage.clickLinkLogOut();
        return new SearchResulLoginSteps();
    }



}
