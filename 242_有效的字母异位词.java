class Solution {
	/**
	* 标记数据，标记s中字符的个数，然后在t中遍历看个数是否相等
	*/
    public boolean isAnagram(String s, String t) {
    	boolean ans = true;
    	int[] book = new int[26];
    	for(int i = 0;i < s.length();i++) {
    		book[s.charAt(i) - 'a']++;
    	}
    	for(int i = 0;i < t.length();i++) {
    		book[t.charAt(i) - 'a']--;
    		if(book[t.charAt(i) - 'a'] < 0) {
    			ans = false;
    			break;
    		}
    	}
    	if(ans)
	    	for(int i = 0;i < 26;i++)
	    		if(book[i] != 0) {
	    			ans = false;
	    			break;
	    		}
    	return ans;
    }
}