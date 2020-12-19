class Solution {
	/** 数学问题，找规律
	 * [
		  [1,2,3],
		  [4,5,6],
		  [7,8,9]
		]
		[
		  [7,4,1],
		  [8,5,2],
		  [9,6,3]
		]
	 * @param matrix
	 */
    public void rotate(int[][] matrix) {
    	int len = matrix.length;
    	int s = 0,e = len - 1;
    	while(s < e) {
    		for(int i = 0;i < e - s;i++) {
    			int temp = matrix[s][s + i];
    			matrix[s][s + i] = matrix[e - i][s];
    			matrix[e - i][s] = matrix[e][e - i];
    			matrix[e][e - i] = matrix[s + i][e];
    			matrix[s + i][e] = temp;
    		}
    		s++;
    		e--;
    	}
    }
}