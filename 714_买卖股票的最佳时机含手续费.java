class Solution {
	/*
	 * 官方题解：贪心【原来贪心也可以这么高级】
	 * buy 为买入股票所需要的成本（股票的钱+手续费）
	 * 收入为卖掉股票赚的钱
	 * 
	 * 当手中没有股票时：如果今天的成本比昨天低，那么今天买
	 * 当手中有股票时：如果今天的收入比昨天高，那么今天卖，
	 *					但是明天更高怎么办，那么成本加上 明天股票的钱减今天股票的钱（相当于今天卖出买入同一只股票且没有手续费）
	 *    			   其他情况，不作操作。
	 *
	 * 简单说就是加上手续费找递增序列
	 */
    public int maxProfit(int[] prices, int fee) {
    	int buy = prices[0] + fee;
    	int ans = 0;
    	for(int i = 1;i < prices.length;i++) {
    		if(prices[i] < buy - fee) {
    			buy = prices[i] + fee;
    		}else if(prices[i] > buy) {
    			ans += prices[i] - buy;
    			buy = prices[i];
    		}
    	}
    	return ans;
    }
}