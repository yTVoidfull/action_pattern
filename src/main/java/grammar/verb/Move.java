package grammar.verb;

import grammar.subject.Element;
import static grammar.preposition.Preposition.to;


public class Move extends Verb{

    public static void to(Element element){
        log(Move.class, to, element);
    }

}
