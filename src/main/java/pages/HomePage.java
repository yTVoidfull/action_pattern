package pages;

import grammar.subject.Element;
import webdriver.Selector;

import static webdriver.SelectorType.XPATH;

public class HomePage extends BasePage {

    public static Element searchBox = new Element("Search box")
            .with(new Selector(XPATH, "//input[@id='lst-ib']"));

    public String getUrl() {
        return baseUrl;
    }
}
