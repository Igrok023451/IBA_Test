package pages.generalPage;

import org.testng.Assert;

public class GeneralPageVerify extends GeneralPageAction{
    public GeneralPageVerify() {
        super();
    }

    public void verifyThatPassToGeneralPage(String expected) {
        Assert.assertEquals(expected, checkGeneralPageAndOpenSystemMenu.getAttribute("class"), "You can't enter in the web site");
    }

}
