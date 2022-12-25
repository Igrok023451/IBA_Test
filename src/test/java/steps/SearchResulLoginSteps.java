package steps;

import pages.generalPage.GeneralPageVerify;
import pages.loginPage.LoginPageAction;
import pages.loginPage.LoginPageVerify;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class SearchResulLoginSteps{

    ///Надо справить и обрааться к одному классу при создании наследника
    private LoginPageAction loginPageAction = new LoginPageAction();
    private LoginPageVerify loginPageVerify = new LoginPageVerify();

    private GeneralPageVerify generalPageVerify = new GeneralPageVerify();

    public SearchResulLoginSteps verifyThatLanguageChangeToEng() throws InterruptedException {
        Thread.sleep(300);
        loginPageVerify.verifyThatLanguageIsEng();
        Thread.sleep(300);
        loginPageVerify.verifyThatInterfaceChangeLanguageToEng();
        return this;
    }
    public SearchResulLoginSteps verifyThatLanguageChangeToRus() throws InterruptedException {
        loginPageVerify.verifyThatLanguageIsRus();
        Thread.sleep(300);
        loginPageVerify.verifyThatInterfaceChangeLanguageToRus();
        return this;
    }
    public SearchResulLoginSteps verifyThatIsGeneralPage(String exp){
        generalPageVerify.verifyThatPassToGeneralPage(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatIsLogInPage(String exp) {
        loginPageVerify.verifyThatIsLogInPage(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatClipboardHasDataUsername(String exp) throws IOException, UnsupportedFlavorException {
        loginPageAction.selectAllTextUserName();
        loginPageAction.copyTextUsername();
        loginPageVerify.verifyThatClipboardHasData(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatClipboardHasDataPassword(String exp) throws IOException, UnsupportedFlavorException {
        loginPageAction.selectAllTextPassword();
        loginPageAction.copyTextPassword();
        loginPageVerify.verifyThatClipboardHasData(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatCanCutIntoFieldUsername(String exp) throws IOException, UnsupportedFlavorException {
        loginPageAction.selectAllTextUserName();
        loginPageAction.cutTextUsername();
        loginPageVerify.verifyThatClipboardHasData(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatCanCutIntoFieldPassword(String exp) throws IOException, UnsupportedFlavorException {
        loginPageAction.selectAllTextPassword();
        loginPageAction.cutTextPassword();
        loginPageVerify.verifyThatClipboardHasData(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatDeleteWorkUsername(String exp) {
        loginPageAction.selectAllTextUserName();
        loginPageAction.deleteTextByDeleteUsername();
        loginPageVerify.verifyThatFieldUsernameCleanAndAlertWork(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatBackspaceWorkUsername(String exp) {
        loginPageAction.selectAllTextUserName();
        loginPageAction.deleteTextByBackspaceUsername();
        loginPageVerify.verifyThatFieldUsernameCleanAndAlertWork(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatDeleteWorkPassword(String exp) {
        loginPageAction.selectAllTextPassword();
        loginPageAction.deleteTextByDeletePassword();
        loginPageVerify.verifyThatFieldPasswordCleanAndAlertWork(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatBackspaceWorkPassword(String exp) {
        loginPageAction.selectAllTextPassword();
        loginPageAction.deleteTextByBackspacePassword();
        loginPageVerify.verifyThatFieldPasswordCleanAndAlertWork(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatPasswordAlertWork(String exp) throws InterruptedException {
        loginPageAction.clickToButtonSignIn();
        Thread.sleep(300);
        loginPageVerify.verifyThatFieldPasswordCleanAndAlertWork(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatUsernameAlertWork(String exp) throws InterruptedException {
        loginPageAction.passEnter();
        Thread.sleep(300);
        loginPageVerify.verifyThatFieldUsernameCleanAndAlertWork(exp);
        return this;
    }
    public SearchResulLoginSteps verifyErrorTypeWrongUsername(String exp) {
        loginPageAction.clickToButtonSignIn();
        loginPageVerify.verifyThatErrorAppeared(exp);
        return this;
    }



}
