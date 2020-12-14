/**
 * 使用hashMap，key为每个出现的字母和其出现次数 value为这类单词的list
 * eat、tea、ate ----- key: a1e1t1  value: [eat][tea][ate]
 */
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    	Map<String,ArrayList<String>> ans = new HashMap<>();
    	for(String str : strs) {
    		int len = str.length();
    		int[] count = new int[26];
    		for(int i = 0;i < len;i++) {
    			count[str.charAt(i) - 'a']++;
    		}
    		StringBuffer key = new StringBuffer();
    		for(int i = 0;i < 26;i++) {
    			if(count[i] != 0) {
    				key.append((char)('a' + i));
    				key.append(count[i]);
    			}
    		}
    		String k = key.toString();
    		ArrayList<String> list = ans.getOrDefault(k, new ArrayList<String>());
    		list.add(str);
    		ans.put(k, list);
    	}
    	return new ArrayList<List<String>>(ans.values());
    }
}