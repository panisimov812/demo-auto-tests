package data_provider;

public class App {

    //TODO реализовать передачу кредов через функцию, или интерфейсом с прпертей
    public static String getSelenoidUrl(Object selenoidLogin, Object selenoidPassword) {
        return "https://" + selenoidLogin + ":" + selenoidPassword + "@selenoid.autotests.cloud/wd/hub";
    }


}
