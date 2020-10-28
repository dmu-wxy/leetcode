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
		System.out.println(s.uniqueOccurrences(new int[] {1,2,2,1,1,3}));
	}
}
class Solution {
	/**
	 * 先标记数组中每个数出现的次数，然后看次数是否有重复的（再用一个标记数组）
	 * 【排序后用set容器效率貌似更高】
	 * @param arr
	 * @return
	 */
    public boolean uniqueOccurrences(int[] arr) {
    	int len = arr.length;
    	boolean ans = true;
    	int[] vis = new int[2000 + 5];
    	for(int i = 0;i < len;i++) {
    		vis[arr[i] + 1000]++;
    	}
    	int[] book = new int[len + 5];
    	for(int i = 0;i < 2005;i++) {
    		if(vis[i] == 0) {
    			continue;
    		}
    		if(book[vis[i]] != 0) {
    			ans = false;
    			break;
    		}
    		book[vis[i]] = 1;
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
