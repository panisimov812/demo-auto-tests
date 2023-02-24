package tests.textBoxTests.elements;

import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ElementsSteps.TextBoxSteps;
import tests.TestBase;


public class ElementsTests extends TestBase {
    TextBoxSteps textBoxSteps = new TextBoxSteps();
    @Test
    @DisplayName("Successful fill elements form test")
    @Title("Positive test")
    void fillFormTest() {
        String fullName = "Petr Anisimov";
        String email = "test@email.ru";
        String currentAddress = "Street 1, 123123, h3";
        String permanentAddress = "Street 11, 1231, h13 flat 12";


        textBoxSteps.fillFullName(fullName);
        textBoxSteps.fillEmail(email);
        textBoxSteps.fillCurrentAddress(currentAddress);
        textBoxSteps.fillPermanentAddress(permanentAddress);
        textBoxSteps.clickSubmitBtn();
        textBoxSteps.formShouldHaveAllInfo(fullName,email,currentAddress,permanentAddress);
    }
}
