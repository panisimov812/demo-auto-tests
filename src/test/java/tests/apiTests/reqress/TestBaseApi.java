package tests.apiTests.reqress;

import config.Config;
import io.restassured.RestAssured;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

public class TestBaseApi {
    public final int STATUS_CODE_200 = 200;
    public final int STATUS_CODE_201 = 201;

    @BeforeAll
    static void setUp() {
        Config config = ConfigFactory.create(Config.class);

        RestAssured.baseURI = config.baseApiUrl();
    }
}
