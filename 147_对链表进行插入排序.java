class Solution {
    public ListNode insertionSortList(ListNode head) {
    	ListNode temp = new ListNode();
    	temp.next = head;
    	if(head == null || head.next == null) return head;
    	head = head.next;
    	temp.next.next = null;
    	while(head != null) {
    		ListNode t = head.next;
    		ListNode tt = temp;
    		while(tt.next != null) {
    			if(tt.next.val > head.val) {
    				head.next = tt.next;
    				tt.next = head;
    				break;
    			}
    			tt = tt.next;
    		}
    		if(tt.next == null) {
    			tt.next = head;
    			head.next = null;
    		}
    		head = t;
    		
    	}
    	return temp.next;
    }
}