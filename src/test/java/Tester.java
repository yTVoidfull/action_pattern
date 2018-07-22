import grammar.subject.Element;
import grammar.verb.Click;
import grammar.verb.Move;
import org.testng.annotations.Test;
import testbase.TestBase;
import webdriver.Selector;

import java.lang.reflect.Method;

import static webdriver.SelectorType.CSS;

public class Tester extends TestBase {


    @Test
    public void anyTest() {
        Element el = new Element("Elementados").with(new Selector(CSS, ".element"));
        Move.to(el);
        Click.on(el);
    }

    @Test
    public void secondTest(){
        Element el = new Element("Elementidis");
        Click.on(el);
        Move.to(el);
    }
}
