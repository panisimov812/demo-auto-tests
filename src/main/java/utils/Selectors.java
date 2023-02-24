package utils;

import org.openqa.selenium.By;

public class Selectors {

    public static By byId(String id) {
        return By.cssSelector("#" + id);
    }

//    public static By byClass(String classValue) {
//        return By.className("div[class='" + classValue + "']");
//    }

    public static By byCss(String css) {
        return By.cssSelector(css);
    }
}
