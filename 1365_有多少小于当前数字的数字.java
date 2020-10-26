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
	/**
	 * vis[i] = j   j = nums数组中前i - 1个数的个数
	 * @param nums
	 * @return
	 */
    public int[] smallerNumbersThanCurrent(int[] nums) {
    	int len = nums.length;
    	int[] ans = new int[len];
    	int[] vis = new int[105];
    	//计算第i - 1个数的个数
    	for(int i = 0;i < len;i++) {
    		vis[nums[i] + 1]++;
    	}
    	//计算前i - 1个数的个数
    	for(int i = 1;i < 105;i++) {
    		vis[i] += vis[i - 1];
    	}
    	for(int i = 0;i < len;i++) {
    		ans[i] = vis[nums[i]];
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
