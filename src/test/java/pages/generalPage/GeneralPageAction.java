package pages.generalPage;

public class GeneralPageAction extends GeneralPage{
    public GeneralPageAction() {
        super();
    }

    public void openPersonalMenu() {
        checkGeneralPageAndOpenSystemMenu.click();
    }


    public void clickLinkLogOut() {
        linkExit.click();
    }


}
