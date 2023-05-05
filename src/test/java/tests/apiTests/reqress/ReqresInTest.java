package tests.apiTests.reqress;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import tests.apiTests.reqress.pojo.UserDTO;
import tests.apiTests.reqress.pojo.domain.User;
import tests.apiTests.reqress.pojo.domain.UserMapper;
import tests.apiTests.reqress.pojo.remote.UserDataRemote;

import static io.restassured.RestAssured.given;
import static io.restassured.http.ContentType.JSON;
import static org.hamcrest.Matchers.is;

public class ReqresInTest extends TestBaseApi {

    @Test
    @Tag("reqres_api_test")
    void createUserTest() {
        UserDTO user = new UserDTO();
        user.name = "Petr";
        user.job = "SDET";

        UserDTO response = given()
                .log().uri()
                .log().body()
                .contentType(JSON)
                .body(user)
                .when()
                .post("/api/users")
                .then()
                .log().status()
                .log().body()
                .statusCode(STATUS_CODE_201)
                .extract().as(UserDTO.class);
        Assertions.assertEquals(user.name, response.name);
    }

    @Test
    @DisplayName("Получение пользователя с id = 2")
    @Tag("reqres_api_test")
    void getUser() {
        UserDataRemote response = given()
                .log().uri()
                .log().body()
                .contentType(JSON)
                .when()
                .get("/api/users/2")
                .then()
                .log().status()
                .log().body()
                .statusCode(STATUS_CODE_200)
                .extract().as(UserDataRemote.class);

        User user = UserMapper.map(response.data);

        Assertions.assertEquals(user.contact.email, response.data.email);
    }

    @Test
    @Tag("reqres_api_test")
    void checkListUser() {
        given()
                .log().uri()
                .contentType(JSON)
                .get( "api/users?page=2")
                .then()
                .log().status()
                .log().body()
                .statusCode(STATUS_CODE_200)
                .body("per_page", is(6));
    }
}
