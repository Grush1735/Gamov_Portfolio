import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestSettings {

    private WebDriver driver;
    String URL = "http://the-internet.herokuapp.com/login";

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupTest() {
        driver = new ChromeDriver();
    }

    @Test
    void loginTest(){
        driver.navigate().to(URL);
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("NotSuperSecretPassword!");
        driver.findElement(By.className("radius")).click();
        assertTrue(driver.findElement(By.xpath(".//*[@class='flash error']")).isDisplayed());
    }

    @AfterEach
    void TearDown(){
        driver.quit();
    }
}
