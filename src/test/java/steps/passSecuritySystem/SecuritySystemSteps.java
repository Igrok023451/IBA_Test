package steps.passSecuritySystem;

import pages.securityPage.SecurityCertificatePage;

public class SecuritySystemSteps {
    SecurityCertificatePage securityCertificatePage = new SecurityCertificatePage();

    public SearchSecuritySystemStep passTheSecuritySystem() {
        securityCertificatePage.clickSecurityPage();
        return new SearchSecuritySystemStep();
    }
}
