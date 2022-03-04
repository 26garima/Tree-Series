class Solution {
    TreeNode nextRight = null;
    
    public void flatten(TreeNode root) {
        if(root == null)
            return;
        flatten(root.right);
        flatten(root.left);
        root.right = nextRight;
        root.left = null;
        nextRight = root;
    }
}
