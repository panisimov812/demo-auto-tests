package steps;
import net.thucydides.core.annotations.Step;
import page_object.pages.ElementsPage;

public class ElementsSteps {

    ElementsPage elementsPage;

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
        elementsPage.fillCurrentAddress(permanentAddress);
    }

    @Step("Click to submit button")
    public void clickSubmitBtn() {
        elementsPage.clickSubmitBtn();
    }

}
