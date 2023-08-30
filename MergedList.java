
public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next;
      }

    public class MergedList {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            // create a new listNode to store merged list
            ListNode merged = new ListNode(); // holds the head of the merged list
            ListNode mergedPtr = merged;
            ListNode previous = merged;
            ListNode list1Ptr = list1;
            ListNode list2Ptr = list2;

            if (list1 == null && list2 == null) {
                return null;

            }


            while (list1Ptr != null || list2Ptr != null) {


                // if at the end of list2 but not list1
                if (list1Ptr != null && list2Ptr == null) {
                    //add list1 val to merged list
                    mergedPtr.val = list1Ptr.val;
                    previous = mergedPtr;

                    // update ptrs to next
                    list1Ptr = list1Ptr.next;
                    mergedPtr.next = new ListNode();
                    mergedPtr = mergedPtr.next;
                }
                else if (list1Ptr == null && list2Ptr != null) {
                    mergedPtr.val = list2Ptr.val;
                    previous = mergedPtr;

                    // update listnode next values and set ptrs
                    list2Ptr = list2Ptr.next;
                    mergedPtr.next = new ListNode();
                    mergedPtr = mergedPtr.next;
                }

                // if list 1 and 2 have a value. Compare values. Add the smaller value if vals are equals choose list 1
                else {
                    if (list1Ptr.val <= list2Ptr.val) {
                        mergedPtr.val = list1Ptr.val;
                        previous = mergedPtr;

                        // update listnode next values and set ptrs
                        list1Ptr = list1Ptr.next;
                        mergedPtr.next = new ListNode();
                        mergedPtr = mergedPtr.next;
                    }
                    // if list2.val is smaller than list1.va;
                    else {
                        mergedPtr.val = list2Ptr.val;
                        previous = mergedPtr;

                        // update listnode next values and set ptrs
                        list2Ptr = list2Ptr.next;
                        mergedPtr.next = new ListNode();
                        mergedPtr = mergedPtr.next;

                    }

                }

            }
            previous.next = null;
            return merged;


        }
      }
}
