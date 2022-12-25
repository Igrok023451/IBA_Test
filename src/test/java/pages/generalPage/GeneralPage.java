package pages.generalPage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class GeneralPage extends BasePage {
    @FindBy(xpath = "//div[@class = 'userlog']")
    protected WebElement checkGeneralPageAndOpenSystemMenu;
    @FindBy(xpath = "//div[@class = 'user-menu']/div/a")
    protected WebElement linkExit;


}
