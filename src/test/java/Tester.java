import grammar.subject.Element;
import grammar.verb.Click;
import grammar.verb.Move;
import grammar.verb.Open;
import grammar.verb.Write;
import org.testng.annotations.Test;
import pages.HomePage;
import testbase.TestBase;

import static pages.HomePage.searchBox;

public class Tester extends TestBase {


    @Test
    public void anyTest() {
        Open.theFollowing(new HomePage());
        Click.on(searchBox);
        Write.into(searchBox).theFollowing("hello");
    }

    @Test
    public void secondTest(){
        Element el = new Element("Elementidis");
        Click.on(el);
        Move.to(el);
    }
}
