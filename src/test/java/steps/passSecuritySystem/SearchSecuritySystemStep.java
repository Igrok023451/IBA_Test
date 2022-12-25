package steps.passSecuritySystem;

import pages.loginPage.LoginPageVerify;
import pages.securityPage.SecurityCertificatePage;

public class SearchSecuritySystemStep {
    SecurityCertificatePage securityCertificatePage = new SecurityCertificatePage();
    LoginPageVerify loginPageVerify = new LoginPageVerify();

    public SecurityCertificatePage verifyThatPageOpen() {
        securityCertificatePage.assertThatIsSecurityPage();
        return new SecurityCertificatePage();
    }
    public SecurityCertificatePage verifyThatTheSystemHasPassed() {
        loginPageVerify.verifyThatIsLogInPage();
        return new SecurityCertificatePage();
    }
}