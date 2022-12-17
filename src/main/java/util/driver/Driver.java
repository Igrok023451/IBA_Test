package util.driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

import static util.property.PropertyReader.getInstance;

public class Driver {
    private static WebDriver driver;
    private Driver(){};

    public static WebDriver getDriver() {
        switch (getInstance().getValue("browser")) {
            case "chrome": {
                if (driver == null) {
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                }
            }
            case "microsoftEdge": {
                if (driver == null) {
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                }
            }
            default: WebDriverManager.chromedriver().setup();
        }
        return driver;
    }

    public static void settingDriver() {
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }
}
