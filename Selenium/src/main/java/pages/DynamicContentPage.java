package pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class DynamicContentPage extends BasePage {

    @FindBy(css = "div#content[class='large-12 columns']")
    private WebElement fieldWithDynamicContent;

    @FindBy(xpath = "(//div[@class='large-10 columns'])[1]")
    private WebElement textFieldFirst;

    @FindBy(xpath = "(//div[@class='large-10 columns'])[2]")
    private WebElement textFieldSecond;

    @FindBy(xpath = "(//div[@class='large-10 columns'])[3]")
    private WebElement textFieldThird;

    @Step("Check if the page has been opened")
    public DynamicContentPage checkPageIsDisplayed(){
        fieldWithDynamicContent.isDisplayed();
        return this;
    }

    @Step("Assert that in the first field some text is displayed")
    public DynamicContentPage assertLength_firstField(){
        assertNotEquals(0, textFieldFirst.getText().length());
        return this;
    }

    @Step("Assert that in the second field some text is displayed")
    public DynamicContentPage assertLength_secondField(){
        assertNotEquals(0, textFieldSecond.getText().length());
        return this;
    }

    @Step("Assert that in the third field some text is displayed")
    public DynamicContentPage assertLength_thirdField(){
        assertNotEquals(0, textFieldThird.getText().length());
        return this;
    }


}
