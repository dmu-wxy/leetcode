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
	 * ˫ָ�룬ǰһ��ָ�����ƶ�k�����ú�����ָ��ͬʱ�ƶ�
	 * ��ǰһ��ָ�����һ��Ϊnull��ʱ�򣬺�һ��ָ�����һ������Ҫɾ���Ľڵ�
	 * ��ǰһ��ָ������Ϊnullʱ����Ҫɾ���Ľڵ�Ϊ��һ��������head.next;
	 * @param head
	 * @param n
	 * @return
	 */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = head,end = head;
        int i;
        for(i = 0;i < n;i++) end = end.next;
        if(end == null) return pre.next;
        while(end.next != null) {
        	pre = pre.next;
        	end = end.next;
        }
        pre.next = pre.next.next;
        return head;
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
