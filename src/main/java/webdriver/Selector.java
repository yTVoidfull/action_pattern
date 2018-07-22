package webdriver;

import org.openqa.selenium.By;

public class Selector {

    String value;
    SelectorType type;

    public Selector( SelectorType type, String value) {
        this.value = value;
        this.type = type;
    }

    public By getSeleniumSelector() {
        switch (type){
            case CSS:
                return By.cssSelector(value);
            case NAME:
                return By.name(value);
            case XPATH:
                return By.xpath(value);
            case CLASS_NAME:
                return By.className(value);
        }
        return null;
    }
}
