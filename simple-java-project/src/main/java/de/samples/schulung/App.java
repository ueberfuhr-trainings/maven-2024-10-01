package de.samples.schulung;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 */
public class App {

    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        //System.out.println("Hello World!");
        logger.debug(() -> "Hello World!");
        Person person = new Person("Max");
        logger.debug(person::sayHello);
    }
}
