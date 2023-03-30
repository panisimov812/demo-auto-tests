package tests.textBoxTests.elementsPage;

import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.ElementsSteps.TextBoxSteps;
import tests.TestBase;


public class ElementsPageTests extends TestBase {
    TextBoxSteps textBoxSteps = new TextBoxSteps();
    @Test
    @Tag("test")
    @DisplayName("Successful fill elements form test")
    @Title("Positive test")
    void fillFormTest() {
        String fullName = "Name Lastname";
        String email = "test@email.ru";
        String currentAddress = "Street 1, 123123, h3";
        String permanentAddress = "Street 11, 1231, h13 flat 12";


        textBoxSteps.fillFullName(fullName);
        textBoxSteps.fillEmail(email);
        textBoxSteps.fillCurrentAddress(currentAddress);
        textBoxSteps.fillPermanentAddress(permanentAddress);
        textBoxSteps.clickSubmitBtn();
        textBoxSteps.formShouldHaveInfo(fullName,email,currentAddress,permanentAddress);
    }

    @Test
    @Tag("smoke")
    @DisplayName("Successful only name field elements form test")
    @Title("Positive test")
    void fillFormOnlyNameTest() {
        String fullName = "Name Lastname";

        textBoxSteps.fillFullName(fullName);
        textBoxSteps.clickSubmitBtn();
        textBoxSteps.formShouldHaveInfo(fullName);
    }

    @Test
    @Disabled
    @Tag("test1")
    @DisplayName("Unsuccessful fill elements form test, none email")
    @Title("Negative test")
    void errorEmailFormTest() {

        String email = "test@";

        textBoxSteps.fillEmail(email);
        textBoxSteps.clickSubmitBtn();
        textBoxSteps.shouldBeErrorEmailField();
    }
}
