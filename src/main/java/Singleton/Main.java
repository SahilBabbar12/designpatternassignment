package Singleton;

public class Main {

    public static void main(String[] args) {

        // Get an instance of the Logger class
        Logger logger = Logger.getInstance();

        // Use the logger to log a message
        logger.log("Hello, world!");

        logger.close();

    }

}
