package grammar.verb;

import ch.qos.logback.classic.Logger;

public abstract class Verb {

    protected static Logger log;

    public static void use(Logger logger){
        log = logger;
    }

    public static <T extends Verb> void log(Class<T> verb, Object... arguments){
        StringBuilder sb = new StringBuilder();
        sb.append(verb.getSimpleName());
        for(Object o : arguments){
            sb.append(" ").append(o);
        }
        log.info(sb.toString());
    }

}
