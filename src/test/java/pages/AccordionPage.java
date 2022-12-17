package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccordionPage extends BasePage{
    public AccordionPage() {
        super();
    }
    @FindBy(xpath = "//a[@data-target='#CSR']")
    private WebElement openAccordionCustomerCenter;
    @FindBy(xpath = "//a[@data-target='#subs-create']")
    private WebElement openAccordionSubscriberCreation;
    @FindBy(xpath = "//a[@ng-reflect-router-link='/subscribers/create-individual']")
    private WebElement clickIndividuals;

    public void wayIndividual(){
        openAccordionCustomerCenter.click();
        openAccordionSubscriberCreation.click();
        clickIndividuals.click();
    }
}
