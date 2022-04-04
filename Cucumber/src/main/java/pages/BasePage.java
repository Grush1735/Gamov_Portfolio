package pages;

import extensions.Driver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    protected static final String URL = "http://the-internet.herokuapp.com";

    BasePage(){
        PageFactory.initElements(Driver.get(), this);
    }
}
