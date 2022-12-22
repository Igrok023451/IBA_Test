package steps;

import pages.loginPage.LoginPageAction;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class SearchResulLoginSteps{
    private LoginPageAction loginPageAction = new LoginPageAction();

    public SearchResulLoginSteps verifyThatLanguageChangeToEng(boolean type) {
        loginPageAction.assertChangeLanguageToEng(type);
        return this;
    }
    public SearchResulLoginSteps verifyThatLanguageChangeToRus(boolean type) {
        loginPageAction.assertChangeLanguageToRus(type);
        return this;
    }
    public SearchResulLoginSteps verifyThatIsGeneralPage(String exp){
        loginPageAction.assertThatPageOpen(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatIsLogInPage(String exp) {
        loginPageAction.assertThatIsLogInPage(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatClipboardHasData(String exp) throws IOException, UnsupportedFlavorException {
        loginPageAction.selectAllText();
        loginPageAction.copyText();
        loginPageAction.assertThatClipboardHasData(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatCanCutIntoField(String exp) throws IOException, UnsupportedFlavorException {
        loginPageAction.selectAllText();
        loginPageAction.cutText();
        loginPageAction.assertThatClipboardHasData(exp);
        return this;
    }

    public SearchResulLoginSteps verifyThatFieldHaveToFill(String exp) throws IOException, UnsupportedFlavorException {
        loginPageAction.selectAllText();
        loginPageAction.cutText();
        loginPageAction.assertThatFillingControlWork(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatDeleteWork(String exp) throws IOException, UnsupportedFlavorException {
        loginPageAction.selectAllText();
        loginPageAction.deleteTextByDelete();
        loginPageAction.assertThatButtonDeleteWork(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatBackspaceWork(String exp) throws IOException, UnsupportedFlavorException {
        loginPageAction.selectAllText();
        loginPageAction.deleteTextByBackspace();
        loginPageAction.assertThatButtonDeleteWork(exp);
        return this;
    }
}
