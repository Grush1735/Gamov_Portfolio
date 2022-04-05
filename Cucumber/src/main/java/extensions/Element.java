package extensions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.How;

import java.util.List;

public class Element {

    private By by;

    public Element(How type, String locator){
        switch (type){
            case ID: this.by = By.id(locator); break;
            case NAME: this.by = By.name(locator); break;
            case XPATH: this.by = By.xpath(locator); break;
            case LINK_TEXT: this.by = By.linkText(locator); break;
            default : this.by = By.cssSelector(locator); break;
        }
    }

    public void sendKeys(String s){
        get().sendKeys(s);
    }

    public boolean isDisplayed(){
        return get().isDisplayed();
    }

    public void click(){
        get().click();
    }

    public String getText() {
        return get().getText();
    }

    private WebElement get(){
        return Driver.get().findElement(by);
    }

    public List<WebElement> findElements(By by) {
        return Driver.get().findElements(by);
    }
}
