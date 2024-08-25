package Exceptions_homework;

public class SimpleExceptionDemo {

    public static void main(String[] args) {

        // Verification "try-catch"

        System.out.println("=== 1 verification: try-catch ===");
        try {
            checkPerson("Ivan", 150);
        } catch (CustomExceptions.TooYoungException | CustomExceptions.TooOldException e) {
            System.err.println("Age is incorrect: " + e.getMessage());
        } catch (CustomExceptions.InvalidNameException e) {
            System.err.println("Incorrect name: " + e.getMessage());
        } finally {
            System.out.println("Check completed.");
        }


        // 2 verification: "throws"

        System.out.println("\n=== 2 verification: throws ===");
        try {
            validatePerson("Peter", 10);
        } catch (Exception e) {
            System.err.println("Exception occurred: " + e.getMessage());
        }
    }

    // Method of checking name & age
    static void checkPerson(String name, int age) throws CustomExceptions.TooYoungException, CustomExceptions.TooOldException, CustomExceptions.InvalidNameException {
        if (name == null || name.isEmpty()) {
            throw new CustomExceptions.InvalidNameException("Name can't be empyt!");
        }
        if (age < 18) {
            throw new CustomExceptions.TooYoungException("Person is too young!");
        }
        if (age > 100) {
            throw new CustomExceptions.TooOldException("Person is too old!");
        }

        System.out.println("Requirements have been covered.");
    }


    // Method propagating exceptions to the main method
    static void validatePerson(String name, int age) throws CustomExceptions.TooOldException, CustomExceptions.InvalidNameException, CustomExceptions.TooYoungException {
        checkPerson(name, age);
    }
}

