package Exceptions_homework;

import java.util.*;

public class SimpleExceptionDemo {

    // Collections - different types of exceptions

    static List<CustomExceptions.TooYoungException> tooYoungList = new ArrayList<>();
    static Set<CustomExceptions.TooOldException> tooOldSet = new HashSet<>();
    static Map<String, CustomExceptions.InvalidNameException> invalidNameMap = new HashMap<>();
    static Queue<CustomExceptions.EmptyFieldException> emptyFieldQueue = new LinkedList<>();
    static Deque<CustomExceptions.InvalidAgeException> invalidAgeDeque = new ArrayDeque<>();

    public static void main(String[] args) {

            // example of using a Collection

            tooYoungList.add(new CustomExceptions.TooYoungException("Person is too young!"));
            tooOldSet.add(new CustomExceptions.TooOldException("Person is too old!"));
            invalidNameMap.put("Invalid Name", new CustomExceptions.InvalidNameException("Name can't be empty!"));
            emptyFieldQueue.add(new CustomExceptions.EmptyFieldException("Field cannot be empty."));
            invalidAgeDeque.add(new CustomExceptions.InvalidAgeException("Invalid age."));

            // example of displaying elements from a Collection

            System.out.println("Too Young List: " + tooYoungList.get(0).getMessage());
            System.out.println("Too Old Set: " + tooOldSet.iterator().next().getMessage());
            System.out.println("Invalid Name Map: " + invalidNameMap.get("Invalid Name").getMessage());
            System.out.println("Empty Field Queue: " + emptyFieldQueue.peek().getMessage());
            System.out.println("Invalid Age Deque: " + invalidAgeDeque.peek().getMessage());
        }


//        // Verification "try-catch"
//
//        System.out.println("=== 1 verification: try-catch ===");
//        try {
//            checkPerson("Ivan", 150);
//        } catch (CustomExceptions.TooYoungException | CustomExceptions.TooOldException e) {
//            System.err.println("Age is incorrect: " + e.getMessage());
//        } catch (CustomExceptions.InvalidNameException e) {
//            System.err.println("Incorrect name: " + e.getMessage());
//        } finally {
//            System.out.println("Check completed.");
//        }
//
//
//        // 2 verification: "throws"
//
//        System.out.println("\n=== 2 verification: throws ===");
//        try {
//            validatePerson("Peter", 10);
//        } catch (Exception e) {
//            System.err.println("Exception occurred: " + e.getMessage());
//        }
//    }

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

