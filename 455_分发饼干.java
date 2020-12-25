class Solution {

    public int findContentChildren(int[] g, int[] s) {
    	int lenG = g.length;
    	int lenS = s.length;
    	Arrays.sort(g);
    	Arrays.sort(s);
    	int ans = 0;
    	int i = 0,j = 0;
    	while(i < lenG && j < lenS) {
    		if(g[i] <= s[j]) {
    			ans++;
    			j++;
    			i++;
    		}else {
    			j++;
    		}
    	}
    	return ans;
    }
}