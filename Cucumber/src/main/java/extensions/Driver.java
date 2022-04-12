package extensions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static WebDriver driver;

    public static WebDriver get(){
        if (driver == null){
            driver = Browser.get();
        }
        return driver;
    }

    public static void quit(){
        driver.quit();
        driver = null;
    }

    public static void close(){
        driver.close();
    }
}
