package config;

@org.aeonbits.owner.Config.Sources("classpath:config/credentials.properties")
public interface Config extends org.aeonbits.owner.Config {

    String baseUrl();

    String browserSizeConfig();

    String selenoidLogin();
    String selenoidPassword();

}
