package pages;

import extensions.Driver;
import extensions.User;
import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPage extends BasePage {

    private final String URI = "http://the-internet.herokuapp.com/login";
    User user = new User();

    @FindBy(css = "#username")
    private WebElement fieldUsername;

    @FindBy(css = "#password")
    private WebElement fieldPassword;

    @FindBy(css = ".radius")
    private WebElement buttonLogin;

    @FindBy(css = "[class='flash success']")
    private WebElement filedSuccessLogin;

    @FindBy(css = "[class='flash error']")
    private WebElement filedFailedLogin;

    @Step("Open Login page")
    public LoginPage open(){
        Driver.get().navigate().to(URI);
        return this;
    }

    @Step("Check if the page has been opened")
    public LoginPage checkPageIsDisplayed(){
        fieldUsername.isDisplayed();
        fieldPassword.isDisplayed();
        buttonLogin.isDisplayed();
        return this;
    }

    @Step("Enter the CORRECT username {user.correctUsername}")
    public LoginPage enterCorrectUsername(){
        fieldUsername.sendKeys(user.getCorrectUsername());
        return this;
    }

    @Step("Enter the CORRECT password {user.correctPassword}")
    public LoginPage enterCorrectPassword(){
        fieldPassword.sendKeys(user.getCorrectPassword());
        return this;
    }

    @Step("Enter the INCORRECT password {user.incorrectPassword}")
    public LoginPage enterIncorrectPassword(){
        fieldPassword.sendKeys(user.getIncorrectPassword());
        return this;
    }

    @Step("Click 'Login' button")
    public LoginPage clickLoginButton(){
        buttonLogin.click();
        return this;
    }

    @Step("Successfully login method with user {user.correctUsername} and {user.correctPassword}")
    public LoginPage successfulLogin(){
        enterCorrectUsername();
        enterCorrectPassword();
        clickLoginButton();
        return this;
    }

    @Step("Failed login method with user {user.correctUsername} and {user.incorrectPassword}")
    public LoginPage failedLogin(){
        enterCorrectUsername();
        enterIncorrectPassword();
        clickLoginButton();
        return this;
    }

    @Step("Assert the success modal window is displayed after success login")
    public LoginPage assertSuccessfulLogin(){
        assertTrue(filedSuccessLogin.isDisplayed());
        return this;
    }

    @Step("Assert the error modal window is displayed after failed login")
    public LoginPage assertFailedLogin(){
        assertTrue(filedFailedLogin.isDisplayed());
        return this;
    }
}
