/**
 * Definition for binary tree
 * class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) {
 *      val = x;
 *      left=null;
 *      right=null;
 *     }
 * }
 */

public class Solution {
    ArrayList<Integer> res = new ArrayList();
    public ArrayList<Integer> solve(TreeNode root, int B) {
        getPath(root, B);
        return res;
    }

    public TreeNode getPath(TreeNode root, int B) {
        if(root == null)
            return null;

        res.add(root.val);

        if(root.val == B) {
            return root;
        }

        TreeNode l = getPath(root.left, B);
        if(l != null) {
            return l;
        }
        TreeNode r = getPath(root.right, B);
        if(r != null)
            return r;
        
        if(l == null && r == null) { 
            res.remove(res.size() - 1);
            return null;
        }
        return l;
    }
}
