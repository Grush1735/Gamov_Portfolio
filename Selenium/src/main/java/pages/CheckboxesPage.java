package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class CheckboxesPage extends BasePage {

    @FindBy(css = "form#checkboxes input[type='checkbox']:nth-of-type(1)")
    private WebElement checkboxFirst;

    @FindBy(css = "form#checkboxes input[type='checkbox']:nth-of-type(1):checked")
    private WebElement checkboxFirstChecked;

    @FindBy(css = "form#checkboxes input[type='checkbox']:nth-of-type(2)")
    private WebElement checkboxSecond;

    @FindBy(css = "form#checkboxes input[type='checkbox']:nth-of-type(2):checked")
    private WebElement checkboxSecondChecked;

    public CheckboxesPage checkPageIsDisplayed(){
        checkboxFirst.isDisplayed();
        checkboxSecondChecked.isDisplayed();
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
        checkboxFirstChecked.isDisplayed();
        return this;
    }

    public CheckboxesPage assertSecondCheckboxIsNotChecked(){
        assertFalse(checkboxSecondChecked.isDisplayed());
        return this;
    }

}
