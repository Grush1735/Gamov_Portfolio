package steps;

import io.cucumber.java.en.Then;
import pages.AddRemoveElementsPage;
import pages.Pages;

public class Add_RemoveElementSteps {

    @Then("I add an element")
    public void iAddAnElement() {
        page().addElement();
    }

    @Then("{int} Remove button is displayed")
    public void removeButtonIsDisplayed(int num) {
        page().assertRemoveButtonsCount(num);
    }

    @Then("I remove element № {int}")
    public void iRemoveElement(int num) {
        if (num == 1) page().removeFirstElement();
        if (num == 2) page().removeSecondElement();
    }

    private AddRemoveElementsPage page(){
        return Pages.addRemoveElements_page;
    }
}
