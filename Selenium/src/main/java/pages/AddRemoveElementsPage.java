package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddRemoveElementsPage extends BasePage {

    @FindBy(how = How.XPATH, using = ".//button[@onclick='addElement()']")
    private WebElement buttonAddElementButton;

    @FindBy(how = How.CSS, using = ".added-manually:first-of-type")
    private WebElement buttonRemoveElementFirst;

    @FindBy(how = How.CSS, using = ".added-manually:nth-of-type(2)")
    private WebElement buttonRemoveElementSecond;

    @FindBy(how = How.CSS, using = ".added-manually")
    private List<WebElement> buttonsRemoveElement;

    @Step("Check if the page has been opened")
    public AddRemoveElementsPage checkPageIsDisplayed(){
        assertTrue(buttonAddElementButton.isDisplayed());
        return this;
    }

    @Step("Click the button and add the element")
    public AddRemoveElementsPage addElement(){
        buttonAddElementButton.click();
        return this;
    }

    @Step("Click the button and remove the first element")
    public AddRemoveElementsPage removeFirstElement(){
        buttonRemoveElementFirst.click();
        return this;
    }

    @Step("Click the button and remove the second element")
    public AddRemoveElementsPage removeSecondElement(){
        buttonRemoveElementSecond.click();
        return this;
    }

    @Step("Assert that number of the 'remove' buttons are {n}")
    public AddRemoveElementsPage assertRemoveButtonsCount(int n){
        assertEquals(buttonsRemoveElement.size(), n);
        return this;
    }
}
