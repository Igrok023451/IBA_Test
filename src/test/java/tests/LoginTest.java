package tests;

import org.testng.annotations.Test;
import pages.AccordionPage;
import pages.CreatePersonPage;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class LoginTest extends BaseTest {
    public LoginTest() {
        super();
    }

    ////Позитиные тест кейсы
    @Test(priority = 1, description = "Change Language")
    public void changeLanguageToEng() throws InterruptedException {
        steps.changeLang().verifyThatLanguageChangeToEng(true);
        Thread.sleep(300);
        steps.changeLang().verifyThatLanguageChangeToRus(true);
    }

    @Test(dataProvider = "LogIn", priority = 2,
            description = "Log in and Log out")
    public void enterInBillingAndExitRus(String user, String psw, String exp) {
        steps.setUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
        steps.clickLogOut().verifyThatIsLogInPage("login-form-header");
    }

    @Test(dataProvider = "LogIn", priority = 3,
            description = "Log in and Log out")
    public void enterInBillingAndExitEng(String user, String psw, String exp) {
        steps.changeLangToEng();
        steps.setUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
        steps.clickLogOut().verifyThatIsLogInPage("login-form-header");
    }

    @Test(dataProvider = "LogIn", priority = 4,
            description = "Type text by keyboard and Log in by click to button 'Log in'. RUS")
    public void enterInBillingBySetTextAndClickButtonRUS(String user, String psw, String exp) {
        steps.changeLangToRus();
        steps.setUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
    }

    @Test(dataProvider = "LogIn", priority = 5,
            description = "Past text by keyboard and Log in by click to button 'Log in'. RUS")
    public void enterInBillingByPastTextAndClickButtonRUS(String user, String psw, String exp) {
        steps.pastUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
    }

    @Test(dataProvider = "LogIn", priority = 6,
            description = "Type text by keyboard and Log in by push Enter 'Log in'. RUS")
    public void enterInBillingBySetTextAndPushButtonRUS(String user, String psw, String exp) {
        steps.setUserAndPasswordValue(user, psw);
        steps.pushButtonSignInEnter().verifyThatIsGeneralPage(exp);
    }

    @Test(dataProvider = "LogIn", priority = 7,
            description = "Past text by keyboard and Log in by push Enter 'Log in'. RUS")
    public void enterInBillingByPastTextAndPushButtonRUS(String user, String psw, String exp) {
        steps.pastUserAndPasswordValue(user, psw);
        steps.pushButtonSignInEnter().verifyThatIsGeneralPage(exp);
    }

    @Test(dataProvider = "LogIn", priority = 8,
            description = "Type text by keyboard and Log in by click to button 'Log in'. ENG")
    public void enterInBillingBySetTextAndClickButtonENG(String user, String psw, String exp) {
        steps.changeLangToEng();
        steps.setUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
    }

    @Test(dataProvider = "LogIn", priority = 9,
            description = "Past text by keyboard and Log in by click to button 'Log in'. ENG")
    public void enterInBillingByPastTextAndClickButtonENG(String user, String psw, String exp) {
        steps.pastUserAndPasswordValue(user, psw);
        steps.clickButtonSignIn().verifyThatIsGeneralPage(exp);
    }

    @Test(dataProvider = "LogIn", priority = 10,
            description = "Type text by keyboard and Log in by push Enter 'Log in'. ENG")
    public void enterInBillingBySetTextAndPushButtonENG(String user, String psw, String exp) {
        steps.setUserAndPasswordValue(user, psw);
        steps.pushButtonSignInEnter().verifyThatIsGeneralPage(exp);
    }

    @Test(dataProvider = "LogIn", priority = 11,
            description = "Past text by keyboard and Log in by push Enter 'Log in'. ENG")
    public void enterInBillingByPastTextAndPushButtonENG(String user, String psw, String exp) {
        steps.pastUserAndPasswordValue(user, psw);
        steps.pushButtonSignInEnter().verifyThatIsGeneralPage(exp);
    }

    @Test(dataProvider = "LogIn", priority = 12,
            description = "Check that into field can select all text and copy it")
    public void checkThatIntoFieldCanCopy(String user, String psw, String exp) throws IOException, UnsupportedFlavorException {
        steps.setUserValue(user).verifyThatClipboardHasData(user);
    }
    @Test(dataProvider = "LogIn", priority = 13,
            description = "Check that into field can select all text and copy it")
    public void checkThatIntoTheFieldCanCut(String user, String psw, String exp) throws IOException, UnsupportedFlavorException {
        steps.setUserValue(user).verifyThatCanCutIntoField(user);
    }

    @Test(dataProvider = "LogIn", priority = 14,
            description = "Check that keyboard Delete work")
    public void checkThatDeleteWork(String user, String psw, String exp) throws IOException, UnsupportedFlavorException {
        String expected = "Заполните обязательные поля";
        steps.setUserValue(user).verifyThatDeleteWork(expected);
    }

    @Test(dataProvider = "LogIn", priority = 15,
            description = "Check that into field can select all text and copy it")
    public void checkThatFieldHaveToFill(String user, String psw, String exp) throws IOException, UnsupportedFlavorException {
        String expected = "Заполните обязательные поля";
        steps.setUserValue(user).verifyThatFieldHaveToFill(expected);
    }

    @Test(dataProvider = "LogIn", priority = 16,
            description = "Check that keyboard Delete work")
    public void checkThatBackspaceWork(String user, String psw, String exp) throws IOException, UnsupportedFlavorException {
        String expected = "Заполните обязательные поля";
        steps.setUserValue(user).verifyThatBackspaceWork(expected);
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