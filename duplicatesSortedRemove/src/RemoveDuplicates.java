public class RemoveDuplicates {
    public static void main(String args[]) {

    }



      public class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }
        ListNode current = head;
        // iterate through the linked list
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }

        }
        return head;

    }
}
