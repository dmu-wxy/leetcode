/**
 * 递归  ，计算当前树的节点个数
 * 如果节点是null，返回0
 * 计算最左，最右路径的深度
 * 	如果相等则返回 2 ^ n - 1
 * 	否则返回  左子树节点个数 + 右子树节点个数 + 1
 * 
 * @author 王星宇
 * @date 2020年11月24日
 */
class Solution {
    public int countNodes(TreeNode root) {
    	if(root == null) return 0;
    	int count = 0;
    	TreeNode temp1 = root,temp2 = root;
    	while(temp1 != null && temp2 != null) {
    		temp1 = temp1.left;
    		temp2 = temp2.right;
    		count++;
    	}
    	if(temp1 == null && temp2 == null) return (int)Math.pow(2, (double)count) - 1;
    	else {
    		return countNodes(root.left) + countNodes(root.right) + 1;
    	}
    }
}