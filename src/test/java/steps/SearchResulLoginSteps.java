package steps;

import pages.LoginPage;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class SearchResulLoginSteps{
    private LoginPage loginPage = new LoginPage();

    public SearchResulLoginSteps verifyThatLanguageChangeToEng(boolean type) {
        loginPage.assertChangeLanguageToEng(type);
        return this;
    }
    public SearchResulLoginSteps verifyThatLanguageChangeToRus(boolean type) {
        loginPage.assertChangeLanguageToRus(type);
        return this;
    }
    public SearchResulLoginSteps verifyThatIsGeneralPage(String exp){
        loginPage.assertThatPageOpen(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatIsLogInPage(String exp) {
        loginPage.assertThatIsLogInPage(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatClipboardHasData(String exp) throws IOException, UnsupportedFlavorException {
        loginPage.selectAllText();
        loginPage.copyText();
        loginPage.assertThatClipboardHasData(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatCanCutIntoField(String exp) throws IOException, UnsupportedFlavorException {
        loginPage.selectAllText();
        loginPage.cutText();
        loginPage.assertThatClipboardHasData(exp);
        return this;
    }

    public SearchResulLoginSteps verifyThatFieldHaveToFill(String exp) throws IOException, UnsupportedFlavorException {
        loginPage.selectAllText();
        loginPage.cutText();
        loginPage.assertThatFillingControlWork(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatDeleteWork(String exp) throws IOException, UnsupportedFlavorException {
        loginPage.selectAllText();
        loginPage.deleteTextByDelete();
        loginPage.assertThatButtonDeleteWork(exp);
        return this;
    }
    public SearchResulLoginSteps verifyThatBackspaceWork(String exp) throws IOException, UnsupportedFlavorException {
        loginPage.selectAllText();
        loginPage.deleteTextByBackspace();
        loginPage.assertThatButtonDeleteWork(exp);
        return this;
    }
}
