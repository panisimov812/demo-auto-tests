package page_object.pages;

import org.openqa.selenium.By;

import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.Selectors;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;


public class ElementsPage {
    private final By FULL_NAME_INPUT = Selectors.byId("userName");
    private final By EMAIL_INPUT = Selectors.byId("userEmail");
    private final By CURRENT_ADDRESS_INPUT = Selectors.byId("currentAddress");
    private final By PERMANENT_ADDRESS_INPUT = Selectors.byId("permanentAddress");
    private final By SUBMIT_BTN = Selectors.byId("submit");
    private final By COMPLETE_FORM = Selectors.byClass("border col-md-12 col-sm-12");
    private final By ERROR_EMAIL_FIELD = Selectors.byClass("mr-sm-2 field-error form-control");

    public void fillFullName(String fullName) {
        $(FULL_NAME_INPUT).setValue(fullName);
    }

    public void fillEmail(String email) {
        $(EMAIL_INPUT).setValue(email);
    }

    public void fillCurrentAddress(String currentAddress) {
        $(CURRENT_ADDRESS_INPUT).setValue(currentAddress);
    }

    public void fillPermanentAddress(String permanentAddress) {
        $(PERMANENT_ADDRESS_INPUT).setValue(permanentAddress);
    }

    public void clickSubmitBtn() {
        $(SUBMIT_BTN).click();
    }

    public void completedFormShouldHaveFullName(String fullName) {
        $(COMPLETE_FORM).shouldHave(text(fullName));
    }

    public void completedFormShouldHaveCurrentAddress(String currentAddress) {
        $(COMPLETE_FORM).shouldHave(text(currentAddress));
    }

    public void completedFormShouldHaveInfo(String fullName, String currentAddress) {
        $(COMPLETE_FORM).shouldHave(text(fullName), text(currentAddress));
    }

    public void completedFormShouldHaveInfo(String fullName, String currentAddress, String permanentAddress) {
        $(COMPLETE_FORM).shouldHave(text(fullName), text(currentAddress), text(permanentAddress));
    }

    public void completedFormShouldHaveInfo(String fullName, String email, String currentAddress, String permanentAddress) {
        $(COMPLETE_FORM).shouldHave(text(fullName), text(email), text(currentAddress), text(permanentAddress));
    }

    public void shouldBeErrorEmailField() {
        $(ERROR_EMAIL_FIELD).shouldBe(visible);
    }

    public void completedFormShouldHavePermanentAddress(String permanentAddress) {
        $(COMPLETE_FORM).shouldHave(text(permanentAddress));
    }

    public void emptyFormDoNotShow() {
        $(COMPLETE_FORM).shouldNotBe(visible);
    }
}