package tests;

import org.testng.annotations.Test;
import pages.generalPage.AccordionPage;
import pages.newPersonPage.CreatePersonPage;
import steps.LoginSteps;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class LoginTest extends BaseTest {
    LoginSteps steps =new LoginSteps();
    public LoginTest() {
        super();
    }

    //Позитиные тест кейсы
    @Test(priority = 1, description = "Checking the language and Interface change to Eng and Rus")
    public void changeLanguageToEng() throws InterruptedException {
        steps.changeLangToEng().verifyThatLanguageChangeToEng();
        Thread.sleep(300);
        steps.changeLangToRus().verifyThatLanguageChangeToRus();
    }

    @Test(dataProvider = "LogIn", priority = 2,
            description = "Log in and Log out. RUS")
    public void enterInBillingAndExitRus(String user, String psw, String exp) {
        steps.setUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
        steps.clickLogOut().verifyThatIsLogInPage("login-form-header");
    }

    @Test(dataProvider = "LogIn", priority = 3,
            description = "Log in and Log out. ENG")
    public void enterInBillingAndExitEng(String user, String psw, String exp) {
        steps.changeLangToEng();
        steps.setUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
        steps.clickLogOut().verifyThatIsLogInPage("login-form-header");
    }

    @Test(dataProvider = "LogIn", priority = 4,
            description = "Type text by keyboard and Log in by click to button 'Log in'. RUS")
    public void enterInBillingBySetTextAndClickButtonRUS(String user, String psw, String exp) {
        steps.changeLangToRus();
        steps.setUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
        driver.navigate().back();
    }

    @Test(dataProvider = "LogIn", priority = 5,
            description = "Past text by keyboard and Log in by click to button 'Log in'. RUS")
    public void enterInBillingByPastTextAndClickButtonRUS(String user, String psw, String exp) {
        steps.pastUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
        driver.navigate().back();
    }

    @Test(dataProvider = "LogIn", priority = 6,
            description = "Type text by keyboard and Log in by push Enter 'Log in'. RUS")
    public void enterInBillingBySetTextAndPushButtonRUS(String user, String psw, String exp) {
        steps.setUserAndPasswordValue(user, psw);
        steps.pushButtonSignInEnter().verifyThatIsGeneralPage(exp);
        driver.navigate().back();
    }

    @Test(dataProvider = "LogIn", priority = 7,
            description = "Past text by keyboard and Log in by push Enter 'Log in'. RUS")
    public void enterInBillingByPastTextAndPushButtonRUS(String user, String psw, String exp) {
        steps.pastUserAndPasswordValue(user, psw);
        steps.pushButtonSignInEnter().verifyThatIsGeneralPage(exp);
        driver.navigate().back();
    }

    @Test(dataProvider = "LogIn", priority = 8,
            description = "Type text by keyboard and Log in by click to button 'Log in'. ENG")
    public void enterInBillingBySetTextAndClickButtonENG(String user, String psw, String exp) {
        steps.changeLangToEng();
        steps.setUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
        driver.navigate().back();
    }

    @Test(dataProvider = "LogIn", priority = 9,
            description = "Past text by keyboard and Log in by click to button 'Log in'. ENG")
    public void enterInBillingByPastTextAndClickButtonENG(String user, String psw, String exp) {
        steps.pastUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
        driver.navigate().back();
    }

    @Test(dataProvider = "LogIn", priority = 10,
            description = "Type text by keyboard and Log in by push Enter 'Log in'. ENG")
    public void enterInBillingBySetTextAndPushButtonENG(String user, String psw, String exp) {
        steps.setUserAndPasswordValue(user, psw);
        steps.pushButtonSignInEnter().verifyThatIsGeneralPage(exp);
        driver.navigate().back();
    }

    @Test(dataProvider = "LogIn", priority = 11,
            description = "Past text by keyboard and Log in by push Enter 'Log in'. ENG")
    public void enterInBillingByPastTextAndPushButtonENG(String user, String psw, String exp) {
        steps.pastUserAndPasswordValue(user, psw);
        steps.pushButtonSignInEnter().verifyThatIsGeneralPage(exp);
        driver.navigate().back();
        steps.changeLangToRus();
    }

    @Test(dataProvider = "LogIn", priority = 12,
            description = "Check that into field Username can select all text, copy it and Clipboard Has copied text")
    public void checkThatIntoFieldUsernameCanCopy(String user, String psw, String exp) throws IOException, UnsupportedFlavorException {
        steps.cleanUserValue();
        steps.setUserValue(user).verifyThatClipboardHasDataUsername(user);
    }
    @Test(dataProvider = "LogIn", priority = 13,
            description = "Check that into field Username can select all text, cut it and Clipboard Has copied text")
    public void checkThatIntoTheFieldUsernameCanCut(String user, String psw, String exp) throws IOException, UnsupportedFlavorException {
        steps.cleanUserValue();
        steps.setUserValue(user).verifyThatCanCutIntoFieldUsername(user);
    }
    @Test(dataProvider = "LogIn", priority = 14,
            description = "Check that keyboard Delete work in field Username")
    public void checkThatDeleteWorkIntoFieldUsername(String user, String psw, String exp) {
        steps.cleanUserValue();
        String expected = "Заполните обязательные поля";
        steps.setUserValue(user).verifyThatDeleteWorkUsername(expected);
    }
    @Test(dataProvider = "LogIn", priority = 15,
            description = "Check that keyboard Backspace work in field Username")
    public void checkThatBackspaceWorkIntoFieldUsername(String user, String psw, String exp) {
        steps.cleanUserValue();
        String expected = "Заполните обязательные поля";
        steps.setUserValue(user).verifyThatBackspaceWorkUsername(expected);
    }
    @Test(dataProvider = "LogIn", priority = 16,
            description = "Check that into field Password can select all text and copy it")
    public void checkThatIntoFieldPasswordCanCopy(String user, String psw, String exp) throws IOException, UnsupportedFlavorException {
        steps.cleanPasswordValue();
        steps.setPasswordValue(psw).verifyThatClipboardHasDataPassword(psw);
    }
    @Test(dataProvider = "LogIn", priority = 17,
            description = "Check that into field Password can select all text and cut it")
    public void checkThatIntoTheFieldPasswordCanCut(String user, String psw, String exp) throws IOException, UnsupportedFlavorException {
        steps.cleanPasswordValue();
        steps.setPasswordValue(psw).verifyThatCanCutIntoFieldPassword(psw);
    }

    @Test(dataProvider = "LogIn", priority = 18,
            description = "Check that keyboard Delete work in field Password")
    public void checkThatDeleteWorkIntoFieldPassword(String user, String psw, String exp) {
        steps.changeLangToEng();
        steps.cleanPasswordValue();
        String expected = "The field is required";
        steps.setPasswordValue(psw).verifyThatDeleteWorkPassword(expected);
    }
    @Test(dataProvider = "LogIn", priority = 19,
            description = "Check that keyboard Backspace work in field Username")
    public void checkThatBackspaceWorkIntoFieldPassword(String user, String psw, String exp) {
        steps.cleanPasswordValue();
        String expected = "The field is required";
        steps.setPasswordValue(psw).verifyThatBackspaceWorkPassword(expected);
        steps.changeLangToRus();
    }
    @Test(dataProvider = "UserIncorrect", priority = 20,
    description = "Check help alert in Password field after type Username and click try log in")
    public void checkThatTypeUsernameCanNotLogIn(String user, String psw, String exp) throws InterruptedException {
        driver.navigate().refresh();
        steps.setUserValue(user).verifyThatPasswordAlertWork(exp);
    }
    @Test(dataProvider = "UserIncorrect", priority = 21,
            description = "Check help alert in Username field after type Password and click try log in")
    public void checkThatTypePasswordCanNotLogIn(String user, String psw, String exp) throws InterruptedException {
        driver.navigate().refresh();
        steps.setPasswordValue(psw).verifyThatUsernameAlertWork(exp);
    }
    @Test(dataProvider = "UserIncorrect", priority = 21, groups = "checkingTests",
            description = "Check system Error : E00004 type wrong Username")
    public void checkErrorAfterWrongUsername(String user, String psw, String exp) throws InterruptedException {
        driver.navigate().refresh();
        steps.setUserAndPasswordValue(user, psw).verifyErrorTypeWrongUsername(exp);
    }






}