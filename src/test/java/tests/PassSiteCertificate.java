package tests;

import org.testng.annotations.Test;
import pages.loginPage.LoginPageVerify;
import steps.passSecuritySystem.SearchSecuritySystemStep;

public class PassSiteCertificate extends BaseTest {
    SearchSecuritySystemStep searchSecuritySystemStep = new SearchSecuritySystemStep();
    public PassSiteCertificate() {
        super();
    }
    @Test(groups = "checkingTests")
    public void checkThatPageOpen() {
        searchSecuritySystemStep.verifyThatPageOpen();
        systemSteps.passTheSecuritySystem().verifyThatTheSystemHasPassed();
    }
}
