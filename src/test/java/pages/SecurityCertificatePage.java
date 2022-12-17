package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SecurityCertificatePage extends BasePage {
    @FindBy(xpath = "//button[@aria-expanded = 'false']")
    private WebElement securityDopolnitelno;
    @FindBy(xpath = "//p[@id='final-paragraph']/a")
    private WebElement securityNext;

    public SecurityCertificatePage() {
        super();
    }

    public void clickSecurityPage() {
        securityDopolnitelno.click();
        securityNext.click();
    }
}