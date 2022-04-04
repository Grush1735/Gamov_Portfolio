package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddRemoveElementsPage extends BasePage {

    @FindBy(how = How.XPATH, using = ".//button[@onclick='addElement()']")
    private WebElement buttonAddElementButton;

    @FindBy(how = How.CSS, using = ".added-manually:first-of-type")
    private WebElement buttonRemoveElementFirst;

    @FindBy(how = How.CSS, using = ".added-manually:nth-of-type(2)")
    private WebElement buttonRemoveElementSecond;

    @FindBy(how = How.CSS, using = ".added-manually")
    private List<WebElement> buttonsRemoveElement;

    public AddRemoveElementsPage checkPageIsDisplayed(){
        assertTrue(buttonAddElementButton.isDisplayed());
        return this;
    }

    public AddRemoveElementsPage addElement(){
        buttonAddElementButton.click();
        return this;
    }

    public AddRemoveElementsPage removeFirstElement(){
        buttonRemoveElementFirst.click();
        return this;
    }

    public AddRemoveElementsPage removeSecondElement(){
        buttonRemoveElementSecond.click();
        return this;
    }

    public AddRemoveElementsPage assertRemoveButtonsCount(int n){
        assertEquals(buttonsRemoveElement.size(), n);
        return this;
    }
}
