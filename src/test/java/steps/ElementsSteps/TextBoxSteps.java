package steps.ElementsSteps;

import net.thucydides.core.annotations.Step;
import page_object.pages.ElementsPage;

public class TextBoxSteps {

    ElementsPage elementsPage = new ElementsPage();

    @Step("In field for full name write full name ({0})")
    public void fillFullName(String fullName) {
        elementsPage.fillFullName(fullName);
    }

    @Step("In field for email write email ({0})")
    public void fillEmail(String email) {
        elementsPage.fillEmail(email);
    }

    @Step("In field for current address write current address ({0})")
    public void fillCurrentAddress(String currentAddress) {
        elementsPage.fillCurrentAddress(currentAddress);
    }

    @Step("In field for current address write current address ({0})")
    public void fillPermanentAddress(String permanentAddress) {
        elementsPage.fillPermanentAddress(permanentAddress);
    }

    @Step("Click to submit button")
    public void clickSubmitBtn() {
        elementsPage.clickSubmitBtn();
    }

    @Step("Checking the content of a correctly completed form")
    public void formShouldHaveAllInfo(String fullName, String email, String currentAddress, String permanentAddress) {
        elementsPage.formShouldHaveAllInfo(fullName, email, currentAddress, permanentAddress);
    }

    @Step
    public void shouldBeErrorEmailField(){
        elementsPage.shouldBeErrorEmailField();
    }
}
