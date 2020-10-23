package leetCode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class test {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(1);
		ListNode l2 = new ListNode(2);
		ListNode l3 = new ListNode(2);
		ListNode l4 = new ListNode(1);
		l1.next = l2;l2.next = l3;l3.next = l4;
		Solution s = new Solution();
		System.out.println(s.isPalindrome(l1));
	}
}
class Solution {
	/**
	 * 先找到链表中点，然后将后半链表前插到一个新的链表头
	 * 最后两个链表比较
	 * @param head
	 * @return
	 */
    public boolean isPalindrome(ListNode head) {
    	if(head == null) return true;
    	if(head.next == null) return true;
    	boolean ans = true;
    	ListNode temp = new ListNode();
    	temp.next = null;
    	ListNode pre = head,end = head;
    	while(end != null) {
    		end = end.next;
    		if(end != null) {
    			end = end.next;
    		}
    		if(end == null) break;
    		pre = pre.next;
    	}
    	end = pre.next;
    	pre.next = null;
    	pre = end;
    	while(pre != null) {
    		end = end.next;
    		pre.next = temp.next;
    		temp.next = pre;
    		pre = end;
    	}
    	temp = temp.next;
    	while(temp != null) {
    		if(temp.val != head.val) {
    			ans = false;
    			break;
    		}
    		temp = temp.next;
    		head = head.next;
    	}
    	return ans;
    }
}







class step{
	int def;
	TreeNode tree;
	step(int def,TreeNode tree){
		this.def = def;
		this.tree = tree;
	}
}
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
