// Comments for understnding of the program in future
package org.p1;

class Logger {
    // Step 1: Create a private static instance of the class (initially null)
    private static Logger instance = null;

    // Step 2: Make the constructor private to prevent direct instantiation
    private Logger() {
        // Constructor is private to restrict direct object creation
        System.out.println("Logger instance created.");
    }

    // Step 3: Provide a public static method to get the single instance
    public static Logger getInstance() {
        if (instance == null) {
            // Step 4: If no instance exists, create one
            instance = new Logger(); // Lazy initialization
        }
        // Step 5: Return the existing or newly created instance
        return instance;
    }

    public void log(String message) {
        System.out.println("LOG: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        // First call to getInstance: Creates the Logger instance
        Logger logger1 = Logger.getInstance();  // "Logger instance created" is printed
        logger1.log("This is the first log message.");

        // Second call to getInstance: Returns the same instance
        Logger logger2 = Logger.getInstance();
        logger2.log("This is the second log message.");

        // Verifying that both references point to the same instance
        System.out.println("Are logger1 and logger2 the same instance? " + (logger1 == logger2));
    }
}
