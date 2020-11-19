/**
* 借用另一个数组暂存
*/
class Solution {
    public void moveZeroes(int[] nums) {
    	int len = nums.length;
    	int[] temp = new int[len];
    	int step = 0;
    	for(int i = 0;i < len;i++) {
    		if(nums[i] == 0) continue;
    		else {
    			temp[step] = nums[i];
    			nums[step] = temp[step++];
    		}
    	}
    	for(int i = step;i < len;i++) {
    		nums[i] = 0;
    	}
    }	
}