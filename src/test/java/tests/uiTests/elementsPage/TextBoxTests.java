package tests.uiTests.elementsPage;

import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import steps.ElementsSteps.TextBoxSteps;
import tests.uiTests.TestBase;


public class TextBoxTests extends TestBase {


    @Test
    @DisplayName("Successful completion all fields")
    @Title("Positive test")
    @Tag("test_elements_page")
    void fillAllFormTest() {
        String fullName = "Name Lastname";
        String email = "test@email.ru";
        String currentAddress = "Street 1, 123123, h3";
        String permanentAddress = "Street 11, 1231, h13 flat 12";

        textBoxSteps.fillFullName(fullName);
        textBoxSteps.fillEmail(email);
        textBoxSteps.fillCurrentAddress(currentAddress);
        textBoxSteps.fillPermanentAddress(permanentAddress);
        textBoxSteps.clickSubmitBtn();
        textBoxSteps.completedFormShouldHaveInfo(fullName, email, currentAddress, permanentAddress);
    }

    @Test
    @Tag("test_elements_page")
    @DisplayName("Successful completion of the field - full name and current address")
    @Title("Positive test")
    void fillOnlyFullNameAndCurrentAddressTest() {
        String fullName = "Name Lastname";
        String currentAddress = "Street 1, 123123, h3";

        textBoxSteps.fillFullName(fullName);
        textBoxSteps.fillCurrentAddress(currentAddress);
        textBoxSteps.clickSubmitBtn();
        textBoxSteps.completedFormShouldHaveInfo(fullName, currentAddress);
    }

    @Test
    @DisplayName("Successful completion of the field - full name,current and permanent address")
    @Title("Positive test")
    void fillOnlyFullNameAndCurrentAndPermanentAddressTest() {
        String fullName = "Name Lastname";
        String currentAddress = "Street 1, 123123, h3";
        String permanentAddress = "Street 11, 1231, h13 flat 12";

        textBoxSteps.fillFullName(fullName);
        textBoxSteps.fillCurrentAddress(currentAddress);
        textBoxSteps.fillPermanentAddress(permanentAddress);
        textBoxSteps.clickSubmitBtn();
        textBoxSteps.completedFormShouldHaveInfo(fullName, currentAddress, permanentAddress);
    }

    @Test
    @Tag("test_elements_page")
    @DisplayName("Successful completion of the field - full name")
    @Title("Positive test")
    void fillOnlyFullNameTest() {
        String fullName = "Name Lastname";

        textBoxSteps.fillFullName(fullName);
        textBoxSteps.clickSubmitBtn();
        textBoxSteps.completedFormShouldHaveFullName(fullName);
    }

    @Test
    @DisplayName("Successful completion of the field - current address")
    @Title("Positive test")
    void fillOnlyCurrentAddressTest() {
        String currentAddress = "Street 1, 123123, h3";

        textBoxSteps.fillCurrentAddress(currentAddress);
        textBoxSteps.clickSubmitBtn();
        textBoxSteps.completedFormShouldHaveCurrentAddress(currentAddress);
    }

    @Test
    @DisplayName("Successful completion of the field - permanent address")
    @Title("Positive test")
    void fillOnlyPermanentAddressTest() {
        String permanentAddress = "Street 11, 1231, h13 flat 12";

        textBoxSteps.fillPermanentAddress(permanentAddress);
        textBoxSteps.clickSubmitBtn();
        textBoxSteps.completedFormShouldHavePermanentAddress(permanentAddress);
    }

    @Test
    @DisplayName("Missing completed form after clicking")
    @Title("Negative test")
    void missingFormTest() {

        textBoxSteps.clickSubmitBtn();
        textBoxSteps.emptyFormDoNotShow();
    }

    @Test
    @DisplayName("Unsuccessful fill elements form test, none email")
    @Title("Negative test")
    public void errorEmailFormTest() {
        String email = "test@";

        textBoxSteps.fillEmail(email);
        textBoxSteps.clickSubmitBtn();
        textBoxSteps.shouldBeErrorEmailField();
    }
}
