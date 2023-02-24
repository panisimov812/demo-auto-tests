package tests.elements;

import net.thucydides.core.annotations.Title;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import steps.ElementsSteps;
import tests.TestBase;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.executeJavaScript;
import static io.qameta.allure.Allure.step;

public class ElementsTests extends TestBase {
    ElementsSteps elementsSteps = new ElementsSteps();
    @Test
    @DisplayName("Successful fill elements form test")
    @Title("Fill all info")
    void fillFormTest() {
        String fullName = "Petr Anisimov";
        String email = "test@email.ru";
        String currentAddress = "Street 1, 123123, h3";
        String permanentAddress = "Street 11, 1231, h13 flat 12";

        step("Open registration form", () -> {
            open("/text-box");
            // $("#userName-label").shouldHave(text("Full Name"));
            executeJavaScript("$('footer').remove()");
            executeJavaScript("$('#fixedban').remove()");
        });
        elementsSteps.fillFullName(fullName);
        elementsSteps.fillEmail(email);
        elementsSteps.fillCurrentAddress(currentAddress);
        elementsSteps.fillPermanentAddress(permanentAddress);
        elementsSteps.clickSubmitBtn();
    }
}
