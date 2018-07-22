package grammar.verb;

import grammar.subject.Element;

import static grammar.preposition.Preposition.on;

public class Click extends Verb {

    public static void on(Element element){
        log(Click.class, on, element);
    }

}
