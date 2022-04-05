package steps;

import io.cucumber.java.en.Then;
import pages.DynamicContentPage;
import pages.Pages;

public class DynamicContentPageSteps {

    @Then("I check {int} Dynamic field have some text")
    public void iCheckDynamicFieldHaveSomeText(int num) {
        if (num == 1) Pages.dynamicContent_page.assertLength_firstField();
        if (num == 2) Pages.dynamicContent_page.assertLength_secondField();
        if (num == 3) Pages.dynamicContent_page.assertLength_thirdField();
    }

    private DynamicContentPage page(){
        return Pages.dynamicContent_page;
    }
}
