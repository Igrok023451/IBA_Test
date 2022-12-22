package util.property;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.datatransfer.*;
import java.io.IOException;

public  class ActionsKeyboardMouse {

    public  void pasteTextToClipboardFromElementFromKeyboard(WebElement element, String text){
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        StringSelection stringSelection = new StringSelection(text);
        clipboard.setContents(stringSelection, null);
        element.sendKeys(Keys.CONTROL, "v");
    }
    public String getTextThatKeepInClipboard() throws IOException, UnsupportedFlavorException {
        String data = "The data is null";
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        Transferable t = clipboard.getContents( null );
        if ( t.isDataFlavorSupported(DataFlavor.stringFlavor) )
        {
            data = (String)t.getTransferData( DataFlavor.stringFlavor );
            return data;
        }
        return data;
    }

    public  void selectAllTextToElementFromKeyboard(WebElement element){
        element.sendKeys(Keys.CONTROL, "a");
    }
    public  void copyTextToElementFromKeyboard(WebElement element){
        element.sendKeys(Keys.CONTROL, "c");
    }
    public  void pasteTextToElementFromKeyboard(WebElement element){
        element.sendKeys(Keys.CONTROL, "v");
    }
    public  void cutTextToElementFromKeyboard(WebElement element){
        element.sendKeys(Keys.CONTROL, "x");
    }
    public  void pushDeleteToKeyboard(WebDriver delete){
        Actions action = new Actions(delete);
        action.sendKeys(Keys.DELETE).build().perform();
    }
    public  void pushBackspaceToKeyboard(WebDriver backspace){
        Actions action = new Actions(backspace);
        action.sendKeys(Keys.BACK_SPACE).build().perform();
    }
    public  void pushSpaceToKeyboard(WebDriver space){
        Actions action = new Actions(space);
        action.sendKeys(Keys.SPACE).build().perform();
    }
    public  void pushEnterToKeyboard(WebDriver enter){
        Actions action = new Actions(enter);
        action.sendKeys(Keys.ENTER).build().perform();
    }
}
