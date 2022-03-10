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
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root == null)
            return result;
        
        Stack<TreeNode> st = new Stack<>();
        TreeNode curr = root;
        st.push(curr);
        curr = curr.left;
        while(!st.isEmpty()) {
            if(curr != null) {
                st.push(curr);
                curr = curr.left;
            } else {
                TreeNode temp = st.peek().right;
                if(temp == null) {
                    temp = st.peek();
                    st.pop();
                    result.add(temp.val);
                    while(!st.isEmpty() && temp == st.peek().right) {
                        temp = st.peek();
                        st.pop();
                        result.add(temp.val);
                    }
                } else {
                    curr = temp;
                }
            }
        }
        return result;
    }
}
