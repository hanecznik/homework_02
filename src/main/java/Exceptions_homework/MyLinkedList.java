package Exceptions_homework;

public class MyLinkedList<T> {

    private Node<T> head;
    private int size;

    // Node class
    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
            this.next = null;
        }
    }

    // add element to the end of the list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
        } else {
            Node<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        size++;
    }

    // get element from the list by index
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node<T> current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current.data;
    }

    // get list size
    public int size() {
        return size;
    }

    public static void main(String[] args) {
        MyLinkedList<String> stringList = new MyLinkedList<>();
        stringList.add("First");
        stringList.add("Second");
        System.out.println("Element at index 1: " + stringList.get(1));
        System.out.println("Size of list: " + stringList.size());

        MyLinkedList<Integer> intList = new MyLinkedList<>();
        intList.add(10);
        intList.add(20);
        System.out.println("Element at index 0: " + intList.get(0));
        System.out.println("Size of list: " + intList.size());
    }
}