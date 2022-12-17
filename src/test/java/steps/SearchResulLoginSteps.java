package steps;

import pages.LoginPage;

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
}
