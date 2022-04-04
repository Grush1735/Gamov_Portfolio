package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertNotEquals;

public class DynamicContentPage extends BasePage {

    @FindBy(css = "div#content[class='large-12 columns']")
    private WebElement fieldWithDynamicContent;

    @FindBy(xpath = "(//div[@class='large-10 columns'])[1]")
    private WebElement textFieldFirst;

    @FindBy(xpath = "(//div[@class='large-10 columns'])[2]")
    private WebElement textFieldSecond;

    @FindBy(xpath = "(//div[@class='large-10 columns'])[3]")
    private WebElement textFieldThird;

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
