/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    List<Integer> result = new ArrayList<>();
    public List<Integer> rightSideView(TreeNode root) {
        if(root == null)
            return result;
        
        findRightView(root , 0);
        return result;       
    }
    
    public void findRightView(TreeNode root, int currLevel) {
        if(root == null)
            return;
        
        if(result.size() == currLevel)
            result.add(root.val);
        
        findRightView(root.right, currLevel + 1);
        findRightView(root.left, currLevel + 1);
    }
}
