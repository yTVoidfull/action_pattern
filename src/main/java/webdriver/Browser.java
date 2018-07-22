package webdriver;

import grammar.subject.Element;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Browser {
    
    WebDriver driver;

    public Browser(WebDriver driver) {
        this.driver = driver;
    }
    
    public WebElement find(Element element){
        return driver.findElement(element.getSelector());
    }

    public WebDriver getDriver() {
        return driver;
    }
}
