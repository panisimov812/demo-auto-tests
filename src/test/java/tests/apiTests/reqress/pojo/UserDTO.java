package tests.apiTests.reqress.pojo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) // говорим классу jackson что если есть неотмеченные
                                            // поля, их можно игнорировать
public class UserDTO {
    public String job;
    public String name;
    public String email;
    public String password;

}
