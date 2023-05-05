package tests.apiTests.Webshop;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import config.Config;
import io.qameta.allure.selenide.AllureSelenide;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

import static com.codeborne.selenide.Selenide.closeWebDriver;

public class TestBaseForWebShopApi {

    public final int STATUS_CODE_302 = 302;
    public final String LOGIN = "petr@test.test";
    public final String PASSWORD = "petr@test.test";
    public final String AUTHCOOKIENAME = "NOPCOMMERCE.AUTH";

    @BeforeAll
    static public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Config config = ConfigFactory.create(Config.class);
        RestAssured.baseURI = config.baseWebShopUrl();
        Configuration.baseUrl = config.baseWebShopUrl();
    }

    @AfterEach
    void afterEach(){
        closeWebDriver();
    }
}
