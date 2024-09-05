package Exceptions_homework;

public class MySimpleResource implements AutoCloseable {

    @Override
    public void close() {
        System.out.println("Resource has been closed.");
    }

    public void useResource() throws CustomExceptions.EmptyFieldException {
        throw new CustomExceptions.EmptyFieldException("Field can't be empty!");
    }
}