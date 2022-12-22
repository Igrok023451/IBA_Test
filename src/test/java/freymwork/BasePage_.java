package freymwork;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pages.SecurityCertificatePage;
import util.property.ActionsKeyboardMouse;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class BasePage_ {
   public static WebDriver driver;


    public static void main(String[] args) throws IOException, UnsupportedFlavorException {
        ActionsKeyboardMouse as = new ActionsKeyboardMouse();
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.get("https://test-billing.mtis.by/mtis-web-billing/#/");
        driver.findElement(By.xpath("//button[@aria-expanded = 'false']")).click();
        driver.findElement(By.xpath("//p[@id='final-paragraph']/a")).click();
        WebElement userName = driver.findElement(By.xpath("//input[@formcontrolname ='username']"));
        userName.sendKeys("admin");
        as.selectAllTextToElementFromKeyboard(userName);
        as.copyTextToElementFromKeyboard(userName);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        Transferable t = clipboard.getContents( null );
        if ( t.isDataFlavorSupported(DataFlavor.stringFlavor) )
        {
            String data = (String)t.getTransferData( DataFlavor.stringFlavor );
            System.out.println( "Clipboard contents: " + data );
        }
    }
}