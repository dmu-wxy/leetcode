/**
 * 依据所有箭一定射在某一个气球的最右端，其中最左一箭一定射在右端最靠左的气球的右端
 * 
 * @author 王星宇
 * @date 2020年11月23日
 */
class Solution {
    public int findMinArrowShots(int[][] points) {
    	int len = points.length;
    	if(len == 0) return 0;
    	Arrays.sort(points, new MyComparator());
    	int ans = 1;
    	int right = points[0][1];  //第一箭射在右端最靠左的气球的右端
    	for(int i = 0;i < len;i++) {
    		//如果气球的左端小于刚才射的位置，该气球已经射爆
    		if(points[i][0] <= right) {
    			continue;
    		}
    		ans++;
    		right = points[i][1];
    	}
    	return ans;
    }
    class MyComparator implements Comparator<int[]>{
        @Override
        public int compare(int[] o1, int[] o2) {
            if(o1[1] > o2[1]) { 
                return 1;
            }else if(o1[1] < o2[1]) {
                return -1;
            }else {
                return 0;
            }
        }
        
    }
}