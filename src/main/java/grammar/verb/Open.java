package grammar.verb;

import pages.BasePage;

import static grammar.preposition.Preposition.theFollowing;

public class Open extends Verb {

    public static void theFollowing(BasePage page){
        log(Open.class, page);
        browser.getDriver().navigate().to(page.getUrl());
    }
}
