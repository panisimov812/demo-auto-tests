package page_object.pages;

import org.openqa.selenium.By;

import utils.Selectors;

import static com.codeborne.selenide.Selenide.$;


public class ElementsPage {

    private final By FULL_NAME_INPUT = Selectors.byId("userName");
    private final By EMAIL_INPUT = Selectors.byId("userEmail");
    private final By CURRENT_ADDRESS_INPUT = Selectors.byId("currentAddress");
    private final By PERMANENT_ADDRESS_INPUT = Selectors.byId("permanentAddress");
    private final By SUBMIT_BTN = Selectors.byId("submit");

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


}
