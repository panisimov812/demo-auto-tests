package tests;

import com.codeborne.selenide.Configuration;
import config.Config;
import data_provider.App;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.executeJavaScript;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class TestBase {


    @BeforeAll
    static void setUp() {

        Config config = ConfigFactory.create(Config.class);
        Configuration.browserCapabilities = new ChromeOptions().addArguments("--remote-allow-origins=*");

        Configuration.baseUrl = config.baseUrl();
        Configuration.browserSize = config.browserSizeConfig();
        //switch on for selenoid remote and add login and pass
        //  Configuration.remote = App.getSelenoidUrl(config.selenoidLogin(),config.selenoidPassword());
        // SelenideLogger.addListener("AllureSelenide", new AllureSelenide());

        step("Open text-box form", () -> {
            open("/text-box");
            executeJavaScript("$('footer').remove()");
            executeJavaScript("$('#fixedban').remove()");
        });
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);
        Configuration.browserCapabilities = capabilities;
    }


}
