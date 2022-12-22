package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import util.property.ActionsKeyboardMouse;

import static util.driver.Driver.getDriver;

public abstract class BasePage {

    protected ActionsKeyboardMouse actionsKeyboardMouse;

    WebDriver driver;

    public BasePage() {
        actionsKeyboardMouse = new ActionsKeyboardMouse();
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }
}