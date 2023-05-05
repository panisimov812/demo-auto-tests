package tests.apiTests.selenoid;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;

import static io.restassured.RestAssured.get;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SelenoidTests extends TestBaseApi {

    @Test
    @Tag("selenoid_api_test")
    void checkTotal() {
        given()
                .when()
                .get("https://selenoid.autotests.cloud/status")
                .then()
                .body("total", is(TOTAL_20));
    }

    @Test
    @Tag("selenoid_api_test")
    void checkWithOutGivenTotal() {
        get("https://selenoid.autotests.cloud/status")
                .then()
                .body("total", is(TOTAL_20));
    }

    @Test
    @Tag("selenoid_api_test")
    void checkWithLogTotal() {
        given()
                .log().all()
                .when()
                .get("https://selenoid.autotests.cloud/status")
                .then()
                .log().all() // получим body
                .body("total", is(TOTAL_20));
    }

    @Test
    @Tag("selenoid_api_test")
    void checkWithSomeLogTotal() {
        given()
                .log().uri()
                .log().body()
                .when()
                .get("https://selenoid.autotests.cloud/status")
                .then()
                .log().status()
                .log().body()
                .body("total", is(TOTAL_20));
    }

    @Test
    @Tag("selenoid_api_test")
    void checkWithChrome() {
        get("https://selenoid.autotests.cloud/status")
                .then()
                .body("browsers.chrome", hasKey("100.0"));
    }

    @Test
    @Tag("selenoid_api_test")
    void checkTotalGoodPractice() {
        Integer actualTotal = get("https://selenoid.autotests.cloud/status")
                .then()
                .extract().path("total"); //взяли из запроса только то что нужно

        System.out.println(actualTotal);
        Integer expectedTotal = 20;
        assertEquals(expectedTotal, actualTotal);
    }

    @Test
    @Tag("selenoid_api_test")
    void checkWithStatusTotal() {
        get("https://selenoid.autotests.cloud/status")
                .then()
                .statusCode(STATUS_CODE_200)
                .body("total", is(TOTAL_20));
    }

    @Test
    @Tag("selenoid_api_test")
    void check401StatusTotal() {
        get("https://selenoid.autotests.cloud/wd/hub/status")
                .then()
                .statusCode(STATUS_CODE_401);
    }

    @Test
    @Tag("selenoid_api_test")
    void check200StatusWithAuthInUrlTotal() {
        get("https://user1:1234@selenoid.autotests.cloud/wd/hub/status")
                .then()
                .statusCode(STATUS_CODE_200);
    }

    @Test
    @Tag("selenoid_api_test")
    void check200StatusWithAuthTotal() {
        given().auth().basic(USER_NAME, PASSWORD)
                .get("https://user1:1234@selenoid.autotests.cloud/wd/hub/status")
                .then()
                .statusCode(STATUS_CODE_200);
    }
}
