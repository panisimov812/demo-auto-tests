package config;

@org.aeonbits.owner.Config.Sources("classpath:config/credentials.properties")
public interface Config extends org.aeonbits.owner.Config {
    String baseUiUrl();
    String baseApiUrl();
    String selenoidApiUrl();
    String browserSizeConfig();
    String baseWebShopUrl();
    String selenoidLogin();
    String selenoidPassword();
}
