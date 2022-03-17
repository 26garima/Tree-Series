class Solution {
    int result = Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        getMaxPathSum(root);
        return result;
    }
    
    public int getMaxPathSum(TreeNode root) {
        if(root == null)
            return 0;
        
        int leftSum = Math.max(0, getMaxPathSum(root.left));
        int rightSum = Math.max(0, getMaxPathSum(root.right));
        
        result = Math.max(result, root.val + leftSum + rightSum);
        
        return root.val + Math.max(leftSum, rightSum);
    }
}
