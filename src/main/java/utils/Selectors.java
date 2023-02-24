package utils;

import org.openqa.selenium.By;

public class Selectors {

    public static By byId(String id) {
        return By.cssSelector("#" + id);

    }

}
