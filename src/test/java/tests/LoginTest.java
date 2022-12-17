package tests;

import org.testng.annotations.Test;
import pages.AccordionPage;
import pages.CreatePersonPage;

public class LoginTest extends BaseTest {
    public LoginTest() {
        super();
    }

    @Test(priority = 1, description = "Change Language")
    public void changeLanguageToEng()  throws InterruptedException {
    steps.changeLang().verifyThatLanguageChangeToEng(true);
    Thread.sleep(300);
    steps.changeLang().verifyThatLanguageChangeToRus(true);
    }
    @Test(dataProvider = "LogIn", priority = 2, description = "")
    public void enterInBilling(String user, String psw, String exp){
     //   steps.setUserAndPasswordValue(user, psw);
        steps.pastUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
    }

    @Test(priority = 3)
    public void two() {

        AccordionPage accordionPage = new AccordionPage();
        accordionPage.wayIndividual();
        CreatePersonPage createPersonPage = new CreatePersonPage();
        createPersonPage.sendNameSurnameMiddleName(excelData[0], excelData[1], excelData[2]);
        createPersonPage.sex();
        createPersonPage.subscriberCategory();
        createPersonPage.subscriberSubgroup();
        createPersonPage.residenceRB();
        createPersonPage.countryName(excelData[3]);
        createPersonPage.documentSubtype();
        createPersonPage.documentNumber(excelData[4]);
        createPersonPage.numberOfPersona(excelData[5]);
        createPersonPage.dateOfBirth();
        createPersonPage.placeOfBirth(excelData[6]);
        createPersonPage.dateOfIssue();
        createPersonPage.expirationDate();
        createPersonPage.issuedBy(excelData[7]);
        createPersonPage.registeredAddress(excelData[8]);
        createPersonPage.noteIdentityDocument(excelData[9]);
        createPersonPage.contactNumber(excelData[10]);
        createPersonPage.mobileNumber(excelData[11]);
        createPersonPage.faxNumbers(excelData[12]);
        createPersonPage.otherNumbers(excelData[13]);
        createPersonPage.e_mail(excelData[14]);
        createPersonPage.postAddress(excelData[15]);
        createPersonPage.addressOfResidence(excelData[16]);
        createPersonPage.noteContactInformation(excelData[17]);
        createPersonPage.additionalAddressPerson(excelData[18]);
        createPersonPage.serviceManager(excelData[19]);
        createPersonPage.correspondenceDeliveryMethod();
        createPersonPage.codeWordPerson(excelData[20]);
        createPersonPage.noteAdditionalInformation(excelData[21]);
        createPersonPage.unsubscribedFromMailingList();
        createPersonPage.notificationLang();
    }
}