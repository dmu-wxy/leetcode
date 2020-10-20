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
	}
}
class Solution {
	/**
	 * ���ȣ�Ѱ�ҵ��м�ڵ�
	 * ��벿��������ͷ���Ϊ��һ���ڵ�ǰ��
	 * ǰ�벿�������ǰ��������ĵڶ����ڵ㿪ʼ��ÿ��һ������
	 * ���磺  1 2 3 4 5
	 * �м�ڵ㣺3   ��Ϊǰ�벿��2��3����벿��4��5
	 * ǰ�壬�γ�����1 5 4
	 * ÿ��һ������һ�����γ�����  1 5 2 4 3
	 * @param head
	 */
    public void reorderList(ListNode head) {
    	if(head == null||head.next == null||head.next.next == null) return;
        ListNode pre = head,mid = head,temp;
        while(pre != null && pre.next != null) {
        	mid = mid.next;
        	pre = pre.next.next;
        }
        temp = mid;
        mid = mid.next;
        temp.next = null;
        pre = head.next;
        head.next = null;
        while(mid != null) {
        	temp = mid.next;
        	mid.next = head.next;
        	head.next = mid;
        	mid = temp;
        }
        head = head.next;
        while(pre != null) {
	        temp = pre.next;
	        pre.next = head.next;
	        head.next = pre;
	        pre = temp;
	        head = head.next;
	        if(head.next == null) {
	        	head.next = pre;
	        	break;
	        }else {
	        	head = head.next;
	        }
        }
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
