//  RECURSIVE APPROACH
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null)
            return null;
        if(root.val < val)
            return searchBST(root.right, val);
        if(root.val > val) 
            return searchBST(root.left, val);
        return root;
    }
}


// ITERATIVE APPROACH
class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        while(root != null) {
            if(root.val < val)
                root = root.right;
            else if(root.val > val)
                root = root.left;
            else
                break;
        }
        return root;
    }
}
