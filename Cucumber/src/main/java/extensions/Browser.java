package extensions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
//  Browser factory
    public static WebDriver get(){
        try {
            switch (System.getProperty("browser")) {
                case "headless-chrome":
                    return getHeadlessChrome();
//              case "firefox": return getHeadlessFirefox();
//              case "edge": return getHeadlessEdge();
                default:
                    return getChrome();
            }
        } catch (Exception e) {
            return getChrome();
        }
    }


    private static ChromeDriver getChrome(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    private static ChromeDriver getHeadlessChrome(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");
        return new ChromeDriver(options);
    }
}
