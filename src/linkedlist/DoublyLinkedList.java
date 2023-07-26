package linkedlist;

import java.util.Objects;

public class DoublyLinkedList {
    // Node class for doubly linked list
    private static class Node {
        int data;
        Node prev;
        Node next;

        Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // Check if the list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get the size of the list
    public int size() {
        return size;
    }

    // Add a new element at the end of the list
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Add a new element at the beginning of the list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Remove the first element from the list
    public void removeFirst() {
        if (isEmpty()) {
            return;
        }
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null; // The list is now empty
        }
        size--;
    }

    // Remove the last element from the list
    public void removeLast() {
        if (isEmpty()) {
            return;
        }
        tail = tail.prev;
        if (tail != null) {
            tail.next = null;
        } else {
            head = null; // The list is now empty
        }
        size--;
    }

    // Display the elements of the list in forward order
    public void displayForward() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Display the elements of the list in reverse order
    public void displayBackward() {
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addLast(10);
        list.addLast(20);
        list.addLast(30);
        list.addFirst(5);

        System.out.println("Forward order:");
        list.displayForward(); // Output: 5 10 20 30

        System.out.println("Reverse order:");
        list.displayBackward(); // Output: 30 20 10 5

        list.removeFirst();
        list.removeLast();

        System.out.println("After removing first and last elements:");
        list.displayForward(); // Output: 10 20
    }
}
