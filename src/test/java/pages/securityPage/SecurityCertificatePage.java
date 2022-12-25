package pages.securityPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SecurityCertificatePage extends BasePage {
    @FindBy(xpath = "//button[@aria-expanded = 'false']")
    private WebElement securityDopolnitelno;
    @FindBy(xpath = "//p[@id='final-paragraph']/a")
    private WebElement securityNext;
    @FindBy(xpath = "//div[@id = 'main-message']")
    private WebElement isSecurityPage;

    public SecurityCertificatePage() {
        super();
    }

    public void clickSecurityPage() {
        securityDopolnitelno.click();
        securityNext.click();
    }
    public void assertThatIsSecurityPage() {
        isSecurityPage.isDisplayed();
    }
}