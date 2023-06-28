package linkedlist;

public class ConvertBinaryNumberIntoInteger {
    public static class ListNode {
        int value;
        ListNode next;
        ListNode(int value) {
            this.value = value;
        }
        ListNode(int value,ListNode next) {
            this.value = value;
            this.next = next;
        }
    }
    public static int getDecimalValue(ListNode head) {
        int bin = 0;
        while (head!=null) {
            bin = bin * 2 + head.value;
            head = head.next;
        }
        return bin;
    }

    public static void main(String[] args) {
       ListNode listNode = new ListNode(1);
        ListNode listNode1 = new ListNode(0);
        ListNode listNode2 = new ListNode(1);
        listNode.next = listNode1;
        listNode1.next = listNode2;
       int binary = getDecimalValue(listNode);
        System.out.println(binary);

    }
}
