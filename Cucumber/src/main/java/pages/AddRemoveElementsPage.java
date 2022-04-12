package pages;

import extensions.Element;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class AddRemoveElementsPage extends BasePage {

    private Element buttonAddElementButton = new Element(How.XPATH, ".//button[@onclick='addElement()']");
    private Element buttonRemoveElementFirst = new Element(How.CSS, ".added-manually:first-of-type");
    private Element buttonRemoveElementSecond = new Element(How.CSS, ".added-manually:nth-of-type(2)");
    private Element buttonRemoveElement = new Element(How.CSS, ".added-manually");
    private List<WebElement> buttonsRemoveElement() { return buttonRemoveElement.findElements(By.cssSelector(".added-manually")); };

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
        assertEquals(buttonsRemoveElement().size(), n);
        return this;
    }
}
