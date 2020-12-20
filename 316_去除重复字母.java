class Solution {
	/**
	 * 关键字符：紧跟重复字符的比重复字符小的不重复字符
	 * 方法：找到关键字符，循环删掉关键字符前的重复字符
	 * @param s
	 * @return
	 */
    public String removeDuplicateLetters(String s) {
    	int len = s.length();
    	int[] book = new int[26];
    	boolean[] vis = new boolean[26];
    	StringBuffer ans = new StringBuffer();
    	for(int i = 0;i < len;i++) {
    		book[s.charAt(i) - 'a']++;
    	}
    	for(int i = 0;i < len;i++) {
    		char temp = s.charAt(i);
    		if(!vis[temp - 'a']) {
	    		while(ans.length() > 0 && ans.charAt(ans.length() - 1) > temp) {
	    			//找到关键字符，并循环删去前面的重复字符
	    			if(book[ans.charAt(ans.length() - 1) - 'a'] > 0) {
	    				vis[ans.charAt(ans.length() - 1) - 'a'] = false;
	    				ans.deleteCharAt(ans.length() - 1);
	    			}else {
	    				break;
	    			}
	    		}
	    		vis[temp - 'a'] = true;
	    		ans.append(temp);
    		}
    		book[temp - 'a']--;
    	}
    	return ans.toString();
    }
}