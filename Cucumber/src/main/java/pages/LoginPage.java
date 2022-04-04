package pages;

import extensions.Driver;
import extensions.User;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertTrue;

public class LoginPage extends BasePage {

    private final String URI = "http://the-internet.herokuapp.com/login";
    public static User user = new User();

    @FindBy(how = How.CSS, using = "#username")
    private WebElement fieldUsername;

    @FindBy(css = "#password")
    private WebElement fieldPassword;

    @FindBy(css = ".radius")
    private WebElement buttonLogin;

    @FindBy(css = "[class='flash success']")
    private WebElement filedSuccessLogin;

    @FindBy(css = "[class='flash error']")
    private WebElement filedFailedLogin;

    public LoginPage open(){
        Driver.get().navigate().to(URI);
        return this;
    }

    public LoginPage checkPageIsDisplayed(){
        fieldUsername.isDisplayed();
        fieldPassword.isDisplayed();
        buttonLogin.isDisplayed();
        return this;
    }

    public LoginPage enterCorrectLogin(){
        fieldUsername.sendKeys(user.getCorrectLogin());
        return this;
    }

    public LoginPage enterLogin(){
        fieldUsername.sendKeys(user.getLogin());
        return this;
    }

    public LoginPage enterCorrectPassword(){
        fieldPassword.sendKeys(user.getCorrectPassword());
        return this;
    }

    public LoginPage enterIncorrectPassword(){
        fieldPassword.sendKeys(user.getIncorrectPassword());
        return this;
    }

    public LoginPage enterPassword(){
        fieldPassword.sendKeys(user.getPassword());
        return this;
    }

    public LoginPage clickLoginButton(){
        buttonLogin.click();
        return this;
    }

    public LoginPage successfulLogin(){
        enterCorrectLogin();
        enterCorrectPassword();
        clickLoginButton();
        return this;
    }

    public LoginPage failedLogin(){
        enterCorrectLogin();
        enterIncorrectPassword();
        clickLoginButton();
        return this;
    }

    public LoginPage enterCreds(){
        enterLogin();
        enterPassword();
        clickLoginButton();
        return this;
    }

    public LoginPage assertSuccessfulLogin(){
        assertTrue(filedSuccessLogin.isDisplayed());
        return this;
    }

    public LoginPage assertFailedLogin(){
        assertTrue(filedFailedLogin.isDisplayed());
        return this;
    }
}
