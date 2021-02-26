class Solution {
    public List<Integer> findNumOfValidWords(String[] words, String[] puzzles) {
    	List<Integer> anss = new ArrayList<>();
    	Map<Integer,Integer> map = new HashMap<>();
    	for(String word : words) {
    		int temp = 0;
    		for(int i = 0;i < word.length();i++) {
    			temp |= (1 << (word.charAt(i) - 'a'));
    		}
    		if(Integer.bitCount(temp) <= 7) {
    			map.put(temp, map.getOrDefault(temp, 0) + 1);
    		}
    	}
    	for(String puzzle : puzzles) {
    		int ans = 0;
    		int temp = 0;
    		for(int i = 1;i < puzzle.length();i++) {
    			temp |= (1 << (puzzle.charAt(i) - 'a'));
    		}
    		int tt = temp;
    		do {
    			int ttt = tt | (1 << (puzzle.charAt(0) - 'a'));
    			if(map.containsKey(ttt)) {
    				ans += map.get(ttt);
    			}
    			tt = (tt - 1) & temp;
    		}while(tt != temp);
    		anss.add(ans);
    	}
    	return anss;
    }
}