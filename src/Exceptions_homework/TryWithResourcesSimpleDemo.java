package Exceptions_homework;

public class TryWithResourcesSimpleDemo {
        public static void main(String[] args) {
            try (MySimpleResource resource = new MySimpleResource()) {
                resource.useResource();
            } catch (CustomExceptions.EmptyFieldException e) {
                System.err.println("Exception appeared: " + e.getMessage());
            }
        }
}
