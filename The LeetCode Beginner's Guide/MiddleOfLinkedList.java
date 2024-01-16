
import java.util.*;

public class MiddleOfLinkedList {
    public static void main(String[] args) {

    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode middleNode(ListNode head) {
        ArrayList<ListNode> array = new ArrayList<>();

        int lenght = 0;

        while (head != null) {
            array.add(head)
            head = head.next;
            lenght++;
        }

        return array.get(lenght / 2);
    }

}
