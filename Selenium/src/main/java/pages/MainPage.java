package pages;

import com.fasterxml.jackson.databind.ser.Serializers;
import extensions.Driver;
import io.qameta.allure.Step;
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

    @Step("Open main page")
    public void open(){
        Driver.get().navigate().to(URL);
    }

    @Step("Open Add/Remove Elements page")
    public AddRemoveElementsPage goToAddRemoveElementsPage(){
        buttonAddRemoveElements.click();
        return Pages.addRemoveElements_page;
    }

    @Step("Open Checkboxes page")
    public CheckboxesPage goToCheckboxesPage(){
        buttonCheckboxes.click();
        return Pages.checkboxes_page;
    }

    @Step("Open Dynamic Content page")
    public DynamicContentPage goToDynamicContentPage(){
        buttonDynamicContent.click();
        return Pages.dynamicContent_page;
    }

    @Step("Open Login page")
    public LoginPage goToLoginPage(){
        buttonLoginPage.click();
        return Pages.login_page;
    }

}
