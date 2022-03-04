import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.*;

public class TestSecond {

    private WebDriver driver;
    String URL = "http://the-internet.herokuapp.com";

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }


    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
    }



    @Test
    void AddRemoveElementTest(){
        driver.navigate().to(URL);
        driver.findElement(By.xpath("//a[contains(@href, 'add_remove_elements')]")).click();
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).isDisplayed();
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        driver.findElement(By.cssSelector(".added-manually:first-of-type")).isDisplayed();
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        driver.findElement(By.cssSelector(".added-manually:nth-of-type(2)")).isDisplayed();
        driver.findElement(By.cssSelector(".added-manually:nth-of-type(2)")).click();
        assertFalse(driver.findElement(By.cssSelector(".added-manually:nth-of-type(2)")).isDisplayed());
    }

    @Test
    void CheckboxesTest(){
        driver.navigate().to(URL);
        driver.findElement(By.cssSelector("a[href*=checkboxes]")).click();
        driver.findElement(By.cssSelector("form#checkboxes input[type='checkbox']:nth-of-type(1)")).isDisplayed();
        driver.findElement(By.cssSelector("form#checkboxes input[type='checkbox']:nth-of-type(2):checked")).isDisplayed();
        driver.findElement(By.cssSelector("form#checkboxes input[type='checkbox']:nth-of-type(1)")).click();
        driver.findElement(By.cssSelector("form#checkboxes input[type='checkbox']:nth-of-type(1):checked")).isDisplayed();
    }

    @Test
    void DynamicContentTest(){
        driver.navigate().to(URL);
        driver.findElement(By.cssSelector("a[href*=dynamic_content]")).click();
        driver.findElement(By.cssSelector("div#content[class='large-12 columns']")).isDisplayed();
        assertNotEquals(0, driver.findElement(By.xpath("(//div[@class='large-10 columns'])[1]")).getText().length());
        assertNotEquals(0, driver.findElement(By.xpath("(//div[@class='large-10 columns'])[2]")).getText().length());
        assertNotEquals(0, driver.findElement(By.xpath("(//div[@class='large-10 columns'])[3]")).getText().length());
    }

    @Test
    void LoginSuccessTest(){
        driver.navigate().to(URL);
        driver.findElement(By.cssSelector("a[href*=login]")).click();
        driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("#password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector(".radius")).click();
        assertTrue(driver.findElement(By.cssSelector("[class='flash success']")).isDisplayed());
    }

    @Test
    void LoginFailedTest(){
        driver.navigate().to(URL);
        driver.findElement(By.cssSelector("a[href*=login]")).click();
        driver.findElement(By.cssSelector("#username")).sendKeys("tomsmith");
        driver.findElement(By.cssSelector("#password")).sendKeys("NotSuperSecretPassword!");
        driver.findElement(By.cssSelector(".radius")).click();
        assertTrue(driver.findElement(By.cssSelector("[class='flash error']")).isDisplayed());
    }

    @AfterEach
    void TearDown(){
        driver.quit();
    }
}
