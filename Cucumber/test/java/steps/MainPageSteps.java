package steps;

import io.cucumber.java.en.When;
import pages.Pages;

import java.util.Objects;

public class MainPageSteps {

    @When("I go to the {string}")
    public void iGoToThe(String page) {
        if (Objects.equals(page, "Login page")) Pages.mainPage.goToLoginPage().checkPageIsDisplayed();
        if (Objects.equals(page, "Checkboxes page")) Pages.mainPage.goToCheckboxesPage().checkPageIsDisplayed();
        if (Objects.equals(page, "Dynamic Content page")) Pages.mainPage.goToDynamicContentPage().checkPageIsDisplayed();
        if (Objects.equals(page, "Add_Remove Elements page")) Pages.mainPage.goToAddRemoveElementsPage().checkPageIsDisplayed();
    }
}
