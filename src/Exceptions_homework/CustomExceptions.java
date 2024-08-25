package Exceptions_homework;

public class CustomExceptions {

    // CE#1: TooYoungException
    public static class TooYoungException extends Exception {
        public TooYoungException(String message) {
            super(message);
        }
    }

    // CE#2: TooOldException
    public static class TooOldException extends Exception {
        public TooOldException(String message) {
            super(message);
        }
    }

    // CE#3: InvalidNameException
    public static class InvalidNameException extends Exception {
        public InvalidNameException(String message) {
            super(message);
        }
    }

    // CE#4: EmptyFieldException
    public static class EmptyFieldException extends RuntimeException {
        public EmptyFieldException(String message) {
            super(message);
        }
    }

    // CE#5: InvalidAgeException
    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }
}
