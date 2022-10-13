package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.time.Duration;

public class Driver {

    private Driver() {

    }

    static WebDriver driver;

    public static WebDriver getDriver() {
        if (driver == null) {
            switch (ConfigReader.getProperty("browser")) {
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                case "headless-chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }
    /*
    // testlerimizi calistirdigimizda her seferinde yeni driver oludturdugu icin
    // her test methodu icin yeni bir pencere (driver) aciyor
    // eger driver'a bir deger atanmamissa yani driver == null ise
    // bir kere driver'i calistir diyerek bir kere if icini calistiracak
    // ve driver artik bir kere calistigi icin ve deger atandigi icin null olmayacak
    // ve direk return edecek ve diger testlerimiz ayni pencere (driver) uzerinde calisacak
     */

    public static void closeDriver() {
        if (driver != null) { // driver'a değer atanmışsa kapat
            driver.close();
            driver = null; // Kapandıktan sonra sonraki açmaları garanti altına almak için driver'i tekrar null yaptık
        }
    }
    // if şartı kullanmadan eski hali ile kaldığında ve browser kapalı olduğunda yine  kapatmak istediğinde exceptıon fırlatır
    public static void quitDriver() {
        if (driver != null)
            driver.quit();
        driver = null;
    }
}