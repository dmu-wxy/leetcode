class Solution {
	/*
	 * 双指针，用map储存模式串和句子单词的匹配
	 */
    public boolean wordPattern(String pattern, String s) {
    	boolean ans = true;
    	int i = 0;
    	char[] patterns = pattern.toCharArray();
    	Map<Character,String> map = new HashMap<>();
    	String[] words = s.split(" ");
    	if(patterns.length != words.length) return false;
    	for(String word : words) {
    		if(map.containsKey(patterns[i])) {
    			if(!word.equals(map.get(patterns[i]))) {
    				ans = false;
    				break;
    			}
    			i++;
    		}else if(map.containsValue(word)){
    			ans = false;
    			break;
    		}else {
    			map.put(patterns[i], word);
    			i++;
    		}
    	}
    	return ans;
    }
}