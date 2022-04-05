package pages;

import extensions.Element;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckboxesPage extends BasePage {

    private Element checkboxFirst = new Element(How.CSS, "form#checkboxes input[type='checkbox']:nth-of-type(1)");
    private Element checkboxFirstChecked = new Element(How.CSS, "form#checkboxes input[type='checkbox']:nth-of-type(1):checked");
    private Element checkboxSecond = new Element(How.CSS, "form#checkboxes input[type='checkbox']:nth-of-type(2)");
    private Element checkboxSecondChecked = new Element(How.CSS, "form#checkboxes input[type='checkbox']:nth-of-type(2):checked");

    public CheckboxesPage checkPageIsDisplayed(){
        assertTrue(checkboxFirst.isDisplayed());
        assertTrue(checkboxSecondChecked.isDisplayed());
        return this;
    }

    public CheckboxesPage clickFirstCheckbox(){
        checkboxFirst.click();
        return this;
    }

    public CheckboxesPage clickSecondCheckbox(){
        checkboxSecond.click();
        return this;
    }

    public CheckboxesPage assertFirstCheckboxIsChecked(){
        assertTrue(checkboxFirstChecked.isDisplayed());
        return this;
    }

    public CheckboxesPage assertSecondCheckboxIsChecked() {
        assertTrue(checkboxSecondChecked.isDisplayed());
        return this;
    }

    public CheckboxesPage assertFirstCheckboxIsNotChecked(){
        assertFalse(checkboxFirstChecked.isDisplayed());
        return this;
    }

    public CheckboxesPage assertSecondCheckboxIsNotChecked(){
        assertFalse(checkboxSecondChecked.isDisplayed());
        return this;
    }
}
