package steps;

import extensions.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.Pages;

public class Hooks {

    @Before
    public void setup() {
        Pages.mainPage.open();
    }

    @After
    public void teardown(){
        Driver.quit();
    }

}
