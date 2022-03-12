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
        
        // Corner Case when root itself is a leaf
        if(root.left == null && root.right == null) {
            result.add(root.val);
            return result;
        }
        
        result.add(root.val);
        addRigthBoundaryNodes(root.right);
        addLeaves(root);
        addLeftBoundaryNodes(root.left);
        return result;
    }
    
    public void addRigthBoundaryNodes(TreeNode root) {
        if(root == null)
            return; 
        
        while(root.left != null || root.right != null) {
            result.add(root.val);
            if(root.right != null) // if right exist, move to right and repeat
                root = root.right;
            else
                root = root.left; // if right doesn't exist, move to left and repeat
        }
    }
    
    public void addLeaves(TreeNode root) {
        if(root == null)
            return;
        
        // if root is a leaf, add it to result
        if(root.left == null && root.right == null)
            result.add(root.val);
        
        if(root.right != null) // traverse right subtree before left one to add nodes in right to left fashion
            addLeaves(root.right);
        if(root.left != null)
            addLeaves(root.left);
    }
    
    public void addLeftBoundaryNodes(TreeNode root) {
        if(root == null)
            return;
        
        Stack<TreeNode> st = new Stack<>();
        
        while(root.left != null || root.right != null) {
            st.push(root);
            if(root.left != null) // if left exists, move to left and repeat
                root = root.left;
            else 
                root = root.right; // if left doesn't exist, move to right and repeat
        }
        
        // Add Left Boundary nodes in reverse fashion
        while(!st.isEmpty()) {
            result.add(st.pop().val);
        }
    }
}
