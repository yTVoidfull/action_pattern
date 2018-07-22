package grammar.verb;

import grammar.subject.Element;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import webdriver.WebDriverFactory;

import static grammar.preposition.Preposition.to;


public class Move extends Verb{

    public static void to(Element element){
        log(Move.class, to, element);
        WebElement webElement = browser.find(element);
        new Actions(browser.getDriver())
                .moveToElement(webElement)
                .build()
                .perform();
    }

}
