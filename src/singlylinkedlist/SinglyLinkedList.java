package singlylinkedlist;

public class SinglyLinkedList {

    // Node class representing each element in the list
    private static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // Add a new element at the end of the list
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Display the elements of the list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Merge two sorted linked lists into a single sorted list
    public static SinglyLinkedList mergeSortedLists(SinglyLinkedList list1, SinglyLinkedList list2) {
        SinglyLinkedList mergedList = new SinglyLinkedList();
        Node current1 = list1.head;
        Node current2 = list2.head;

        while (current1 != null && current2 != null) {
            if (current1.data <= current2.data) {
                mergedList.add(current1.data);
                current1 = current1.next;
            } else {
                mergedList.add(current2.data);
                current2 = current2.next;
            }
        }

        while (current1 != null) {
            mergedList.add(current1.data);
            current1 = current1.next;
        }

        while (current2 != null) {
            mergedList.add(current2.data);
            current2 = current2.next;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        SinglyLinkedList list1 = new SinglyLinkedList();
        list1.add(10);
        list1.add(30);
        list1.add(50);

        SinglyLinkedList list2 = new SinglyLinkedList();
        list2.add(20);
        list2.add(40);
        list2.add(60);

        System.out.println("Linked List 1 elements:");
        list1.display(); // Output: 10 30 50

        System.out.println("Linked List 2 elements:");
        list2.display(); // Output: 20 40 60

        SinglyLinkedList mergedList = mergeSortedLists(list1, list2);

        System.out.println("Merged Sorted List elements:");
        mergedList.display(); // Output: 10 20 30 40 50 60
    }
}

