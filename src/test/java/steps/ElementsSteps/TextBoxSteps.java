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

    @Step("In field for permanent address write permanent address ({0})")
    public void fillPermanentAddress(String permanentAddress) {
        elementsPage.fillPermanentAddress(permanentAddress);
    }

    @Step("Click to submit button")
    public void clickSubmitBtn() {
        elementsPage.clickSubmitBtn();
    }

    @Step("Checking the completed form for availability - full name ({0})")
    public void completedFormShouldHaveFullName(String fullName) {
        elementsPage.completedFormShouldHaveFullName(fullName);
    }

    @Step("Checking the completed form for availability - current address ({0})")
    public void completedFormShouldHaveCurrentAddress(String currentAddress) {
        elementsPage.completedFormShouldHaveCurrentAddress(currentAddress);
    }

    @Step("Checking the completed form for availability - permanent address ({0})")
    public void completedFormShouldHavePermanentAddress(String permanentAddress) {
        elementsPage.completedFormShouldHavePermanentAddress(permanentAddress);
    }

    @Step("Checking the completed form for availability - full name({0}) and current address ({1})")
    public void completedFormShouldHaveInfo(String fullName, String currentAddress) {
        elementsPage.completedFormShouldHaveInfo(fullName, currentAddress);
    }

    @Step("Checking the completed form for availability - full name({0})," +
            " current address ({1}) and permanent address({2})")
    public void completedFormShouldHaveInfo(String fullName, String currentAddress, String permanentAddress) {
        elementsPage.completedFormShouldHaveInfo(fullName, currentAddress, permanentAddress);
    }

    @Step("Checking the completed form for availability - full name({0})," +
            "email({1}), current address ({2}) and permanent address({3})")
    public void completedFormShouldHaveInfo(String fullName, String email, String currentAddress, String permanentAddress) {
        elementsPage.completedFormShouldHaveInfo(fullName, email, currentAddress, permanentAddress);
    }

    @Step("Checking that empty email fields to border red")
    public void shouldBeErrorEmailField() {
        elementsPage.shouldBeErrorEmailField();
    }

    @Step("Checking that empty form do not show")
    public void emptyFormDoNotShow() {
        elementsPage.emptyFormDoNotShow();
    }
}
