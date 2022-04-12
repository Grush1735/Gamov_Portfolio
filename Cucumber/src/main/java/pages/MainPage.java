package pages;

import extensions.Driver;
import extensions.Element;
import org.openqa.selenium.support.How;

public class MainPage extends BasePage {

    private Element buttonAddRemoveElements = new Element(How.XPATH, "//a[contains(@href, 'add_remove_elements')]");
    private Element buttonCheckboxes = new Element(How.CSS, "a[href*=checkboxes]");
    private Element buttonDynamicContent = new Element(How.CSS, "a[href*=dynamic_content]");
    private Element buttonLoginPage = new Element(How.CSS, "a[href*=login]");

    public MainPage open(){
        Driver.get().get(URL);
        return this;
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
