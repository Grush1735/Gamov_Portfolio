package steps;

import io.cucumber.java.en.Then;
import pages.CheckboxesPage;
import pages.Pages;

public class CheckboxesSteps {

    @Then("I assert checkbox {int} is checked")
    public void iAssertCheckboxIsChecked(int num) {
        if (num == 1) page().assertFirstCheckboxIsChecked();
        if (num == 2) page().assertSecondCheckboxIsChecked();
    }

    @Then("I assert checkbox {int} is not checked")
    public void iAssertCheckboxIsNotChecked(int num) {
        if (num == 1) page().assertFirstCheckboxIsNotChecked();
        if (num == 2) page().assertSecondCheckboxIsNotChecked();
    }

    @Then("I click checkbox {int}")
    public void iClickCheckbox(int num) {
        if (num == 1) page().clickFirstCheckbox();
        if (num == 2) page().clickSecondCheckbox();
    }

    private CheckboxesPage page(){
        return Pages.checkboxes_page;
    }
}
