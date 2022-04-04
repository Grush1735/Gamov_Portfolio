package steps;

import extensions.Driver;
import extensions.User;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.Pages;

import java.util.Objects;

public class LoginSteps {

    @Given("I am user with login {string}")
    public void iAmUserWithLogin(String login) {
        LoginPage.user.setLogin(login);
    }

    @Given("I am user with password {string}")
    public void iAmUserWithPassword(String password) {
        LoginPage.user.setPassword(password);
    }

    @When("I go to the Login page")
    public void iGoToTheLoginPage() {
        Pages.mainPage.goToLoginPage();
    }

    @When("I click login button")
    public void iClickLoginButton() {
        Pages.login_page.clickLoginButton();
    }

    @When("I enter my login to login field")
    public void iEnterMyLoginToLoginField() {
        Pages.login_page.enterLogin();
    }

    @When("I enter my password to password field")
    public void iEnterMyPasswordToPasswordField() {
        Pages.login_page.enterPassword();
    }

    @When("I enter my creds")
    public void iEnterMyCreds() {
        Pages.login_page.enterLogin();
        Pages.login_page.enterPassword();
    }

    @Then("I see notif {string}")
    public void iSeeNotif(String notif) {
        if (Objects.equals(notif, "Successfull login"))  Pages.login_page.assertSuccessfulLogin();
        if (Objects.equals(notif, "Failed login"))  Pages.login_page.assertFailedLogin();
    }

    @And("I close the browser")
    public void iCloseTheBrowser() {
        Driver.quit();
    }
}
