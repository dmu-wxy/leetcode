class Solution {
	/**
	 * 动态规划
	 * @param cost
	 * @return
	 */
    public int minCostClimbingStairs(int[] cost) {
    	int len = cost.length;
    	//dp[i] 代表前i个台阶花费的最大体力值
    	int[] dp = new int[len + 1];
    	dp[1] = cost[0];
    	dp[2] = cost[1];
    	for(int i = 3;i <= len;i++) {
    		dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 1]);
    	}
//    	for(int i = 1;i <= len;i++) {
//    		System.out.print(dp[i] + " ");
//    	}
//    	System.out.println();
    	return Math.min(dp[len - 1], dp[len]);
    }
}