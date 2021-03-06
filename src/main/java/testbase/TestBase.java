package testbase;

import grammar.verb.Verb;
import logging.LogHandler;
import org.joda.time.DateTime;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import webdriver.Browser;
import webdriver.WebDriverFactory;

import java.lang.reflect.Method;

public class TestBase {

    protected LogHandler logHandler = new LogHandler();
    public static final String time = DateTime.now().toString();
    protected WebDriverFactory driverFactory = new WebDriverFactory();


    @BeforeSuite
    public void registerActionLogger(){
        Verb.use(logHandler.getLogger());
        Verb.use(new Browser(driverFactory.getDriver()));
    }

    @BeforeMethod
    public void setUpLogFile(Method method){
        String testName = method.getName();
        logHandler.appendLogsTo("target/logs/"+time+"/"+this.getClass().getSimpleName()+"/"+testName+".txt");
        logHandler.getLogger().info("=====================STARTING TEST - "+ testName.toUpperCase()+ "=============");
    }
}
