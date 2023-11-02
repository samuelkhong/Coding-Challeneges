public class Solution {
    public boolean hasCycle(ListNode head) {

        // input: ListNode head
        // strings? 
        // chars?
        // null? 

        // return the node? 
        // integer?
        // boolean if travelled before
        // listNode boolean visited?

        // Listnode n = [3,2,0 -4] return false
        // system.out.println(hasCycle(n), false) (false, false)

        /*
            hasCycle(ListNode) {
                iterate until we reach null
                set of listnodes memory pos
                loop {
                    check if listnode memory pos is in set
                    if so return true;

                    add new listnode onto set
                    
                }



                while (n.next != null) {

                }
                return false;
            }

        */

        Set<ListNode> set = new HashSet();

        while (head != null) {
            if (set.contains(head)) {
                return true;
            }
            set.add(head);
            head = head.next;

        }
        return false;
        
    }
}