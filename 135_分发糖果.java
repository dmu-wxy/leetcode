class Solution {
	/**
	 * 贪心
	 * 先从左往右遍历，当比左一个数大，加1，否则，为1
	 * 再从右往左遍历，当比右一个数大且之前分配的糖果要少时，加1，否则不变
	 * @param ratings
	 * @return
	 */
    public int candy(int[] ratings) {
    	int ans = 0;
    	int len = ratings.length;
    	if(len == 0) return ans;
    	int[] candyNums = new int[len];
    	for(int i = 0;i < len;i++) {
    		if(i == 0) {
    			candyNums[i] = 1;
    		}else if(ratings[i] > ratings[i - 1]) {
    			candyNums[i] = candyNums[i - 1] + 1;
    		}else {
    			candyNums[i] = 1;
    		}
    		ans += candyNums[i];
    	}
    	for(int i = len - 1;i >= 0;i--) {
    		int temp = candyNums[i];
    		if(i == len - 1) {
    		}else if(ratings[i] > ratings[i + 1] && candyNums[i] < candyNums[i + 1] + 1) {
    			candyNums[i] = candyNums[i + 1] + 1;
    		}
    		ans += candyNums[i] - temp;
    	}
    	for(int i = 0;i < len;i++) {
    		System.out.print(candyNums[i] + " ");
    	}
    	System.out.println();
    	return ans;
    }
}