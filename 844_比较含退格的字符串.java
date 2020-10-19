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
		System.out.println(new Solution().backspaceCompare("ab#c", "ad#c"));
		System.out.println(new Solution().backspaceCompare("ab##", "c#d#"));
		System.out.println(new Solution().backspaceCompare("a##c", "#a#c"));
		System.out.println(new Solution().backspaceCompare("a#c", "b"));
		System.out.println(new Solution().backspaceCompare("a#c#", ""));
	}
}

class Solution {
	/**
	 * 从后往前依次比较，遇到退格则向前移动响应位数
	 * @param S
	 * @param T
	 * @return
	 */
    public boolean backspaceCompare(String S, String T) {
        int lens = S.length() - 1,lent = T.length() - 1;
        boolean ans = true;
        while(lens >= 0 || lent >= 0) {
        	int cc = 0;
        	//去除退格
        	while(lens >= 0 && (S.charAt(lens) == '#'|| cc > 0)) {
        		if(S.charAt(lens) == '#') {
        			cc++;
        		}else {
        			cc--;
        		}
        		lens--;
        	}
        	cc = 0;
        	while(lent >= 0 && (T.charAt(lent) == '#'|| cc > 0)) {
        		if(T.charAt(lent) == '#') {
        			cc++;
        		}else {
        			cc--;
        		}
        		lent--;
        	}
        	//比较
        	//System.out.println(lens + " " + lent);
        	if(lens < 0 && lent < 0) {ans = true;break;}
        	if(!(lens >= 0 && lent >= 0)) {ans = false;break;}
        	//System.out.println(S.charAt(lens) + " " + T.charAt(lent));
        	if(S.charAt(lens) != T.charAt(lent)) {ans = false;break;}
        	lens--;lent--;
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
