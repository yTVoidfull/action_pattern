package grammar.verb;

import grammar.subject.Element;

import static grammar.preposition.Preposition.into;
import static grammar.preposition.Preposition.theFollowing;

public class Write extends Verb {

    Element element;

    public Write(Element element) {
        this.element = element;
    }

    public static Write into(Element element){
        return new Write(element);
    }

    public void theFollowing(String text){
        log(Write.class, text, into, element);
        browser.find(element).sendKeys(text);
    }
}
