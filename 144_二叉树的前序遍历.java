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
		Solution s = new Solution();
	}
}
class Solution {
	private List<Integer> list = new ArrayList<>();
	/**
	 * »ÁÃ‚
	 * @param root
	 * @return
	 */
    public List<Integer> preorderTraversal(TreeNode root) {
    	if(root == null) return list;
    	list.add(root.val);
    	preorderTraversal(root.left);
    	preorderTraversal(root.right);
        return list;
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
