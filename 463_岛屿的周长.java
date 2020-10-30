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
		int[][] t = new int[][] {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		Solution s = new Solution();
		System.out.println(s.islandPerimeter(t));
	}
}
/**
 * 很常规的解法：连通块
 * 对于每一次递归，grid[tx][ty]为水则加一，为陆地则加上该陆地与水的周长
 * @author 王星宇
 * @date 2020年10月30日
 */
class Solution {
	int[] xx = {1,-1,0,0};
	int[] yy = {0,0,1,-1};
	int[][] book;
    public int islandPerimeter(int[][] grid) {
    	int ans = 0;
    	book = new int[grid.length][grid[0].length];
    	cr:for(int i = 0;i < grid.length;i++) {
    		for(int j = 0;j < grid[0].length;j++) {
    			if(grid[i][j] == 1) {
    				book[i][j] = 1;
    				ans = dfs(grid,i,j);
    				break cr;
    			}
    		}
    	}
    	return ans;
    }
    public int dfs(int[][] grid,int x,int y) {
    	int temp = 0;
    	for(int i = 0;i < 4;i++) {
    		int tx = x + xx[i];
    		int ty = y + yy[i];
    		if(tx >=0 && ty >= 0 && tx < grid.length && ty < grid[0].length&&book[tx][ty] == 0&&grid[tx][ty] == 1) {
    			book[tx][ty] = 1;
    			temp += dfs(grid,tx,ty);
    		}else {
    			if(!(tx >=0 && ty >= 0 && tx < grid.length && ty < grid[0].length) || grid[tx][ty] == 0) temp++;
    		}
    	}
    	return temp;
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
