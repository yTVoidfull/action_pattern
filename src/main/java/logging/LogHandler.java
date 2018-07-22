package logging;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.encoder.PatternLayoutEncoder;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.ConsoleAppender;
import ch.qos.logback.core.FileAppender;
import org.slf4j.LoggerFactory;

import static ch.qos.logback.classic.Level.INFO;


public class LogHandler {

    LoggerContext loggerContext = (LoggerContext) LoggerFactory.getILoggerFactory();
    PatternLayoutEncoder ple;
    private static final String LOGGER_NAME = "Execution - ";
    private static final String FILE_APPENDER_NAME = "Apendidus";
    private static final String CONSOLE_APPENDER_NAME = "Consolieur";
    private Logger logger;

    public LogHandler() {
        logger = (Logger) LoggerFactory.getLogger(LOGGER_NAME);
        logger.setLevel(INFO);
        logger.setAdditive(false);
        setLayoutEncoder();
        addConsoleAppender();
    }

    public void setLayoutEncoder(){
        ple = new PatternLayoutEncoder();
        ple.setPattern("%date %level [%thread] - %msg%n");
        ple.setContext(loggerContext);
        ple.start();
    }

    public void addConsoleAppender(){
        ConsoleAppender<ILoggingEvent> consoleAppender = new ConsoleAppender<ILoggingEvent>();
        consoleAppender.setName(CONSOLE_APPENDER_NAME);
        consoleAppender.setEncoder(ple);
        consoleAppender.setContext(loggerContext);
        consoleAppender.start();
        logger.addAppender(consoleAppender);
    }

    public void appendLogsTo(String fileName){
        logger.detachAppender(FILE_APPENDER_NAME);
        FileAppender<ILoggingEvent> fileAppender = new FileAppender<ILoggingEvent>();
        fileAppender.setName(FILE_APPENDER_NAME);
        fileAppender.setFile(fileName);
        fileAppender.setEncoder(ple);
        fileAppender.setContext(loggerContext);
        fileAppender.start();
        logger.addAppender(fileAppender);
    }

    public Logger getLogger() {
        return logger;
    }
}
