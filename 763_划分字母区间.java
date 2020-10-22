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
	* ���ȴӺ�����������ÿһ���ַ���һ�γ������ַ����е�λ�ã��ֶε�λ��һ����������֮��
	* Ȼ���ǰ�����������ÿһ���ַ�
	*		���û�б�ǣ����Ҵ˴δ�ǰ�����Ҳû�г��ֹ������Ǹá���ĸ����������+1
	*		�����ǹ�������-1
	*		���������continue
	*	������Ϊ0��ʱ�򣬸ô�ΪҪ�ָ�ĵط�
	*/
    public List<Integer> partitionLabels(String S) {
    	List<Integer> ans = new ArrayList<>();
    	int len = S.length();
    	int[] vis = new int[len];//��ǴӺ���ǰÿ����ĸ��һ�γ��ֵ�λ��
    	int[] book = new int[26];//���26����ĸ���ֹ�û��
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
    	int cc = 0;//ǰi���ַ����滹�г��ֵ��ַ�����
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
