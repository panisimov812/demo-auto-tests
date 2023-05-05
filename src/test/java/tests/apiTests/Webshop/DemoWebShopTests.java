package tests.apiTests.Webshop;

import com.codeborne.selenide.WebDriverRunner;

import io.qameta.allure.restassured.AllureRestAssured;
import org.junit.jupiter.api.*;
import org.openqa.selenium.Cookie;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

import static io.qameta.allure.Allure.step;
import static io.restassured.RestAssured.given;


public class DemoWebShopTests extends TestBaseForWebShopApi {

    @Test
    @Tag("demoshop")
    @DisplayName("Successful authorization to some demowebshop (API + UI)")
    void loginWithApiAndAllureListenerTest() {

        step("Get cookie by api and set it to browser", () -> {
            String authCookieValue = given()
                    .filter(new AllureRestAssured())
                    .contentType("application/x-www-form-urlencoded")
                    .formParam("Email", LOGIN)
                    .formParam("Password", PASSWORD)
                    .log().all()
                    .when()
                    .post("/login")
                    .then()
                    .log().all()
                    .statusCode(STATUS_CODE_302)
                    .extract().cookie(AUTHCOOKIENAME);


            step("Open minimal content, because cookie can be set when site is opened", () ->
                    open("/Themes/DefaultClean/Content/images/logo.png"));
            step("Set cookie to to browser", () -> {
                Cookie ck = new Cookie(AUTHCOOKIENAME, authCookieValue); //подставка кук
                WebDriverRunner.getWebDriver().manage().addCookie(ck);
            });

            open("/"); // открыл браузер
            step("verify success authorization", () ->
                    $(".account").shouldHave(text(LOGIN))); // проверил что логин произошел (нашел имейл)
        });
    }

}
