package Singleton;

import java.io.FileWriter;
import java.io.IOException;

// This class implements the Singleton pattern to ensure that only one instance of the Logger is created.
public class Logger {

    private static final Logger INSTANCE = new Logger();

    private FileWriter fileWriter;

    private Logger() {
        try {

            fileWriter = new FileWriter("log.txt", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//  getInstance method returns the single instance of the Logger.
    public static Logger getInstance() {
        return INSTANCE;
    }

//   writes the message to the log file.
    public void log(String message) {
        try {
            fileWriter.write(message + "\n");
            fileWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//  CLoses the file writer used by the Logger.
    public void close() {
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
