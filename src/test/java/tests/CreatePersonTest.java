package tests;

import org.testng.annotations.Test;
import pages.generalPage.AccordionPage;
import pages.newPersonPage.CreatePersonPage;

public class CreatePersonTest extends BaseTest {
    public CreatePersonTest() {
        super();
    }
    @Test(priority = 30)
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
