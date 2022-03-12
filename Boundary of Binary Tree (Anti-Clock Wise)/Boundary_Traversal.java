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
    public List<Integer> boundaryOfBinaryTree(TreeNode root) {
        if(root == null)
            return result;
      
        // Corner case when root itself is a leaf node
        if(root.left == null && root.right == null) {
            result.add(root.val);
            return result;
        }
        
        result.add(root.val);
        addLeftBoundaryNodes(root.left);
        addLeaves(root);
        addRightBoundaryNodes(root.right);
        return result;
    }
    
    public void addLeftBoundaryNodes(TreeNode root) {
        if(root == null)
            return;
        
        while(root.left != null || root.right != null) {
            result.add(root.val);
            if(root.left != null) // if left exists in left subtree, move to left and repeat
                root = root.left;
            else
                root = root.right; // if left doesn't in left subtree, move to right and repeat
        }
    }
    
    public void addLeaves(TreeNode root) {
        if(root == null)
            return;
         
        // if root is leaf, add it to the result
        if(root.left == null && root.right == null) 
            result.add(root.val); 
        
        addLeaves(root.left);
        addLeaves(root.right);
    }
    
    public void addRightBoundaryNodes(TreeNode root) {
        if(root == null)
            return;
        
        Stack<TreeNode> st = new Stack<>();
        
        while(root.left != null || root.right != null) {
            st.push(root);
            if(root.right != null) // if right exists in right subtree, move to right and repeat
                root = root.right;
            else
                root = root.left; // if right doesn't exist in right subtree, move to left and repeat
        }
        
        // Add Right Boundary nodes in reverse order
        while(!st.isEmpty()) { 
            result.add(st.pop().val);
        }
    }
}
