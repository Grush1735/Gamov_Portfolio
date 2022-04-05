package pages;

import extensions.Element;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static org.junit.Assert.assertNotEquals;

public class DynamicContentPage extends BasePage {

    private Element fieldWithDynamicContent = new Element(How.CSS, "div#content[class='large-12 columns']");
    private Element textFieldFirst = new Element(How.XPATH, "(//div[@class='large-10 columns'])[1]");
    private Element textFieldSecond = new Element(How.XPATH, "(//div[@class='large-10 columns'])[2]");
    private Element textFieldThird = new Element(How.XPATH, "(//div[@class='large-10 columns'])[3]");



    public DynamicContentPage checkPageIsDisplayed(){
        fieldWithDynamicContent.isDisplayed();
        return this;
    }

    public DynamicContentPage assertLength_firstField(){
        assertNotEquals(0, textFieldFirst.getText().length());
        return this;
    }

    public DynamicContentPage assertLength_secondField(){
        assertNotEquals(0, textFieldSecond.getText().length());
        return this;
    }

    public DynamicContentPage assertLength_thirdField(){
        assertNotEquals(0, textFieldThird.getText().length());
        return this;
    }


}
