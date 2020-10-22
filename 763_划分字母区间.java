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
		List<Integer> ans = s.partitionLabels("ababcbacadefegdehijhklij");
		for(Integer temp : ans) {
			System.out.println(temp);
		}
	}
}
class Solution {
	/**
	* 首先从后面遍历，标记每一个字符第一次出现在字符串中的位置，分段的位置一定出现在其之后
	* 然后从前面遍历，对于每一个字符
	*		如果没有标记，而且此次从前面遍历也没有出现过，则标记该“字母”，并计数+1
	*		如果标记过，计数-1
	*		其他情况，continue
	*	当计数为0的时候，该处为要分割的地方
	*/
    public List<Integer> partitionLabels(String S) {
    	List<Integer> ans = new ArrayList<>();
    	int len = S.length();
    	int[] vis = new int[len];//标记从后往前每个字母第一次出现的位置
    	int[] book = new int[26];//标记26个字母出现过没有
    	for(int i = 0;i < 26;i++) book[i] = 0;
    	for(int j = 0;j < len;j++) vis[j] = 0;
    	for(int i = len - 1;i >= 0;i--) {
    		if(book[S.charAt(i) - 'a'] == 0) {
    			book[S.charAt(i) - 'a'] = 1;
    			vis[i] = 1;
    		}
    	}
    	int ll = 0;
    	for(int i = 0;i < 26;i++) book[i] = 0;
    	int cc = 0;//前i个字符后面还有出现的字符个数
    	for(int i = 0;i < len;i++) {
    		//System.out.println(cc);
    		if(book[S.charAt(i) - 'a'] == 0 && vis[i] == 0) {
    			cc++;
    			book[S.charAt(i) - 'a'] = 1;vis[i] = 1;
    		}else if(vis[i] == 1) {
    			if(book[S.charAt(i) - 'a'] == 0) {
    				book[S.charAt(i) - 'a'] = 1;
    			}
    			else if(cc > 0)cc--;
    		}
    		if(cc == 0) {
    			int temp = i + 1 - ll;
    			ans.add(temp);
    			ll += temp;
    		}
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
