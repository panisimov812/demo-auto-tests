package tests.apiTests.selenoid;

import com.codeborne.selenide.logevents.SelenideLogger;
import config.Config;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBaseApi {

    public final int STATUS_CODE_401 = 401;
    public final int STATUS_CODE_200 = 200;
    public final int TOTAL_20 = 20;
    public final String USER_NAME = "user1";
    public final String PASSWORD = "1234";

    @BeforeAll
    static public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Config config = ConfigFactory.create(Config.class);
        RestAssured.baseURI = config.selenoidApiUrl();
    }
}
