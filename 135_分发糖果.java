class Solution {
	/**
	 * ̰��
	 * �ȴ������ұ�����������һ�����󣬼�1������Ϊ1
	 * �ٴ������������������һ��������֮ǰ������ǹ�Ҫ��ʱ����1�����򲻱�
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