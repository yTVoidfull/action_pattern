package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    public WebDriver getDriver(){
        return new FirefoxDriver();
    }
}
