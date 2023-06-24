package linkedlist;


public class LinkedListDemo {

    public static void main(String[] args) {
        Node a = new Node(6);
        Node b = new Node(7);
        Node c = new Node(8);
        Node d = new Node(9);
        Node e = new Node(10);
        // create linkList
        a.next = b;//6->7 8 9 10
        b.next = c;// 6->7-> 8 9 10
        c.next = d;// 6->7->8-> 9 10
        d.next = e;// 6->7->8->9->10

       Node temp = a;
       while (temp != null) {
           System.out.print(temp.data+" ");
           temp = temp.next;
       }

    }
}
