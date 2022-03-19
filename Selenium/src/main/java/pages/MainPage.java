package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import extensions.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {

    @FindBy(xpath = "//a[contains(@href, 'add_remove_elements')]")
    private WebElement buttonAddRemoveElements;

    @FindBy(css = "a[href*=checkboxes]")
    private WebElement buttonCheckboxes;

    @FindBy(css = "a[href*=dynamic_content]")
    private WebElement buttonDynamicContent;

    @FindBy(css = "a[href*=login]")
    private WebElement buttonLoginPage;

    public void open(){
        Driver.get().navigate().to(URL);
    }

    public AddRemoveElementsPage goToAddRemoveElementsPage(){
        buttonAddRemoveElements.click();
        return Pages.addRemoveElements_page;
    }

    public CheckboxesPage goToCheckboxesPage(){
        buttonCheckboxes.click();
        return Pages.checkboxes_page;
    }

    public DynamicContentPage goToDynamicContentPage(){
        buttonDynamicContent.click();
        return Pages.dynamicContent_page;
    }

    public LoginPage goToLoginPage(){
        buttonLoginPage.click();
        return Pages.login_page;
    }

}
