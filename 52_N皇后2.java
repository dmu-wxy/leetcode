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
		System.out.println(new Solution().totalNQueens(4));
	}
}

class Solution {
	private int[][] map;
	private int len;
	private int ans;
	private int[] b;//列
	private int[] c;//主对角线  \
	private int[] d;//副对角线 /
    public int totalNQueens(int n) {
    	map = new int[n][n];
    	b = new int[n];
    	c = new int[2 * n];
    	d = new int[2 * n];
    	len = n;
    	ans = 0;
    	dfs(0);
    	return ans;
    }	
    public void dfs(int def) {
    	if(def == len) {
    		//System.out.println("sss");
    		ans++;
    	}
    	for(int i = 0;i < len;i++) {
    		if(b[i] == 0&&c[len - def + i] == 0&&d[def + i] == 0) {
    			b[i] = 1;c[len - def + i] = 1;d[def + i] = 1;
    			dfs(def + 1);
    			b[i] = 0;c[len - def + i] = 0;d[def + i] = 0;
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
