package grammar.subject;

import org.openqa.selenium.By;
import webdriver.Selector;

public class Element {

    String name;
    Selector selector;

    public Element(String name) {
        this.name = name;
    }

    public Element with(Selector selector){
        this.selector = selector;
        return this;
    }

    @Override
    public String toString() {
        return name;
    }

    public By getSelector(){
        return selector.getSeleniumSelector();
    }
}
