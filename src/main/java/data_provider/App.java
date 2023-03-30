package data_provider;

public class App {

    public static String getSelenoidUrl(Object selenoidLogin, Object selenoidPassword) {
        return "https://" + selenoidLogin + ":" + selenoidPassword + "@selenoid.autotests.cloud/wd/hub";
    }


}
