package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreatePersonPage extends BasePage {
    @FindBy(xpath = "//textarea[@formcontrolname='lastName']")
    private WebElement lastName;
    @FindBy(xpath = "//textarea[@formcontrolname='firstName']")
    private WebElement firstName;
    @FindBy(xpath = "//textarea[@formcontrolname='patronymic']")
    private WebElement middleName;
    @FindBy(xpath = "//p-dropdown[@formcontrolname='sexId']")
    private WebElement sexID;
    @FindBy(xpath = "//li[@aria-label='Женщина']")
    private WebElement typeOfSex;
    @FindBy(xpath = "//p-dropdown[@formcontrolname='categoryId']")
    private WebElement categoryId;
    @FindBy(xpath = "//span[text() = 'Стандартный']")
    private WebElement categoryIdStandard;
    @FindBy(xpath = "//p-dropdown[@formcontrolname='subscrSubgroupId']")
    private WebElement subscrSubgroupId;
    @FindBy(xpath = "//span[text() = 'Не подключать']")
    private WebElement subscrSubgroupIdNoConnect;
    @FindBy(xpath = "//p-dropdown[@formcontrolname='residentId']")
    private WebElement residentId;
    @FindBy(xpath = "//li[@aria-label='Нерезидент']")
    private WebElement residentIdNo;
    @FindBy(xpath = "//p-dropdown[@formcontrolname='countryId']")
    private WebElement countryId;
    @FindBy(xpath = "//p-dropdown[@formcontrolname = 'countryId']//input[@type= 'text' and @autocomplete ='off']")
    private WebElement countryIdSendText;
    @FindBy(xpath = "//li[@aria-label='Колумбия']")
    private WebElement clickNameCountry;
    @FindBy(xpath = "//p-dropdown[@formcontrolname='docTypeId']")
    private WebElement docTypeId;
    @FindBy(xpath = "//li[@aria-label='Паспорт РБ']")
    private WebElement passportRB;
    @FindBy(xpath = "//input[@formcontrolname='docNumber']")
    private WebElement docNumber;
    @FindBy(xpath = "//input[@formcontrolname='personalNumber']")
    private WebElement personalNumber;
    @FindBy(xpath = "//label[text() = 'Дата рождения']/following-sibling::div/p-calendar")
    private WebElement birthDay;
    @FindBy(xpath = "//span[text() ='Сегодня']")
    private WebElement clickTodayBirth;
    @FindBy(xpath = "//textarea[@formcontrolname='birthPlace']")
    private WebElement birthPlace;
    @FindBy(xpath = "//label[text() = 'Дата выдачи']/following-sibling::div/p-calendar")
    private WebElement issueDay;
    @FindBy(xpath = "//span[text() ='Сегодня']")
    private WebElement clickTodayIssue;
    @FindBy(xpath = "//label[text() = 'Дата окончания']/following-sibling::div/p-calendar")
    private WebElement expirationDay;
    @FindBy(xpath = "//span[text() ='Сегодня']")
    private WebElement clickTodayExpiration;
    @FindBy(xpath = "//textarea[@formcontrolname='issuerName']")
    private WebElement issuerName;
    @FindBy(xpath = "//textarea[@formcontrolname='residenceAddress']")
    private WebElement residenceAddress;
    @FindBy(xpath = "//label[text() = 'Примечание']/following-sibling::div/textarea")
    private WebElement noteID;
    @FindBy(xpath = "//input[@formcontrolname='contactPhone']")
    private WebElement contactPhone;
    @FindBy(xpath = "//input[@formcontrolname='mobilePhone']")
    private WebElement mobilePhone;
    @FindBy(xpath = "//input[@formcontrolname='faxNumber']")
    private WebElement faxNumber;
    @FindBy(xpath = "//input[@formcontrolname='otherPhones']")
    private WebElement otherPhones;
    @FindBy(xpath = "//input[@formcontrolname='email']")
    private WebElement emaile;
    @FindBy(xpath = "//textarea[@formcontrolname='postAddress']")
    private WebElement location;
    @FindBy(xpath = "//textarea[@formcontrolname='realAddress']")
    private WebElement realAddress;
    @FindBy(xpath = "//h3[text()='Контактная информация']//following-sibling::div//textarea[@formcontrolname ='comment']")
    private WebElement noteCI;
    @FindBy(xpath = "//textarea[@formcontrolname='additionalAddress']")
    private WebElement additionalAddress;
    @FindBy(xpath = "//p-dropdown[@formcontrolname='managerId']")
    private WebElement managerId;
    @FindBy(xpath = "//p-dropdown[@formcontrolname = 'managerId']//input[@autocomplete = 'off' and @type ='text']")
    private WebElement chooseManager;
    @FindBy(xpath = "//li[@aria-label='Криворучко  Е. А.']")
    private WebElement managerNameClick;
    @FindBy(xpath = "//p-dropdown[@formcontrolname='correspondenceDeliveryId']")
    private WebElement correspondenceDeliveryId;
    @FindBy(xpath = "//p-dropdown[@formcontrolname = 'correspondenceDeliveryId']//li[@aria-label ='E-mail + почта']")
    private WebElement eMailPlusPost;
    @FindBy(xpath = "//textarea[@formcontrolname='codeWord']")
    private WebElement codeWord;
    @FindBy(xpath = "//h3[text()='Дополнительная информация']//following-sibling::div//textarea[@formcontrolname ='comment']")
    private WebElement noteAI;
    @FindBy(xpath = "//input[@ng-reflect-name = 'emailNoticeDisableBySubscr']")
    private WebElement emailNoticeDisableBySubscr;
    @FindBy(xpath = "//p-dropdown[@formcontrolname='noticeLang']")
    private WebElement noticeLang;
    @FindBy(xpath = "//p-dropdown[@formcontrolname='noticeLang']//li[@aria-label ='Английский']")
    private WebElement englishLanguage;


    public CreatePersonPage() {
        super();
    }

    public void sendNameSurnameMiddleName(String sendLastName, String sendFirstName, String sendMiddleName) {
        lastName.sendKeys(sendLastName);
        firstName.sendKeys(sendFirstName);
        middleName.sendKeys(sendMiddleName);
    }

    public void sex() {
        sexID.click();
        typeOfSex.click();
    }

    public void subscriberCategory() {
        categoryId.click();
        categoryIdStandard.click();
    }

    public void subscriberSubgroup() {
        subscrSubgroupId.click();
        subscrSubgroupIdNoConnect.click();
    }

    public void residenceRB() {
        residentId.click();
        residentIdNo.click();
    }

    public void countryName(String country) {
        countryId.click();
        countryIdSendText.sendKeys(country);
        clickNameCountry.click();
    }

    public void documentSubtype() {
        docTypeId.click();
        passportRB.click();
    }

    public void documentNumber(String passportNumber) {
        docNumber.sendKeys(passportNumber);
    }

    public void numberOfPersona(String personNumber) {
        personalNumber.sendKeys(personNumber);
    }

    public void dateOfBirth() {
        birthDay.click();
        clickTodayBirth.click();
    }

    public void placeOfBirth(String place) {
        birthPlace.sendKeys(place);
    }

    public void dateOfIssue() {
        issueDay.click();
        clickTodayIssue.click();
    }

    public void expirationDate() {
        expirationDay.click();
        clickTodayExpiration.click();
    }

    public void issuedBy(String issueName) {
        issuerName.sendKeys(issueName);
    }

    public void registeredAddress(String residenceAddres) {
        residenceAddress.sendKeys(residenceAddres);
    }

    public void noteIdentityDocument(String comments) {
        noteID.sendKeys(comments);
    }

    public void contactNumber(String numberContact) {
        contactPhone.sendKeys(numberContact);
    }

    public void mobileNumber(String numberMobile) {
        mobilePhone.sendKeys(numberMobile);
    }

    public void faxNumbers(String numberFax) {
        faxNumber.sendKeys(numberFax);
    }

    public void otherNumbers(String numberOther) {
        otherPhones.sendKeys(numberOther);
    }

    public void e_mail(String eMail) {
        emaile.sendKeys(eMail);
    }

    public void postAddress(String addressPost) {
        location.sendKeys(addressPost);
    }

    public void addressOfResidence(String loca) {
        realAddress.sendKeys(loca);
    }

    public void noteContactInformation(String notesCI) {
        noteCI.sendKeys(notesCI);
    }

    public void additionalAddressPerson(String addressAdditional) {
        additionalAddress.sendKeys(addressAdditional);
    }

    public void serviceManager(String nameManager) {
        managerId.click();
        chooseManager.sendKeys(nameManager);
        managerNameClick.click();
    }

    ///Migration base
    //driver.findElement(By.xpath("")).click();
    ///Subscriber code in the base
    //driver.findElement(By.xpath("")).click();
    public void correspondenceDeliveryMethod() {
        correspondenceDeliveryId.click();
        eMailPlusPost.click();
    }

    public void codeWordPerson(String personalCodeWord) {
        codeWord.sendKeys(personalCodeWord);
    }

    public void noteAdditionalInformation(String notesAI) {
        noteAI.sendKeys(notesAI);
    }

    public void unsubscribedFromMailingList() {
        emailNoticeDisableBySubscr.click();
    }

    public void notificationLang() {
        noticeLang.click();
        englishLanguage.click();
    }
}