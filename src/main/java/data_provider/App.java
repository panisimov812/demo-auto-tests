package data_provider;

import com.codeborne.selenide.Config;

public class App {

    public static String getSelenoidUrl(Object selenoidLogin, Object selenoidPassword) {
        return "https://" + selenoidLogin + ":" + selenoidPassword + "@selenoid.autotests.cloud/wd/hub";
    }


}
