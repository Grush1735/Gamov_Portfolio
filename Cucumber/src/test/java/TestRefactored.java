import org.junit.Test;
import pages.Pages;

public class TestRefactored {

    @Test
    void testAddRemoveElement(){
        Pages.mainPage.goToAddRemoveElementsPage()
                .checkPageIsDisplayed()
                .addElement()
                .assertRemoveButtonsCount(1)
                .addElement()
                .assertRemoveButtonsCount(2)
                .removeSecondElement()
                .assertRemoveButtonsCount(1);
    }

    @Test
    void CheckboxesTest(){
        Pages.mainPage.goToCheckboxesPage()
                .checkPageIsDisplayed()
                .clickFirstCheckbox()
                .assertFirstCheckboxIsChecked()
                .clickSecondCheckbox()
                .assertSecondCheckboxIsNotChecked();
        }

    @Test
    void DynamicContentTest(){
        Pages.mainPage.goToDynamicContentPage()
                .checkPageIsDisplayed()
                .assertLength_firstField()
                .assertLength_secondField()
                .assertLength_thirdField();
    }

    @Test
    void LoginSuccessTest(){
        Pages.login_page.open().checkPageIsDisplayed()
                .successfulLogin()
                .assertSuccessfulLogin();
    }

    @Test
    void LoginFailedTest(){
        Pages.login_page.open().checkPageIsDisplayed()
                .failedLogin()
                .assertFailedLogin();
    }
}
