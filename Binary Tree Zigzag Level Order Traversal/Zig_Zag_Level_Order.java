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
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        if(root == null)
            return result;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        char direction = 'L';
        
        while(!q.isEmpty()) {
            int size = q.size();
            List<TreeNode> li = new ArrayList<>();
            result.add(new ArrayList<Integer>());
            for(int i = 0; i < size; i++) {
                TreeNode temp = q.poll();
                li.add(temp);
                if(temp.left != null)
                    q.offer(temp.left);
                if(temp.right != null)
                    q.offer(temp.right);
            }
            
            if(direction == 'L') {
                for(TreeNode node : li) {
                    result.get(result.size() - 1).add(node.val);
                }
                direction = 'R';
            } else {
                for(int i = li.size()-1; i >= 0; i--) {
                    result.get(result.size() - 1).add(li.get(i).val);
                }
                direction = 'L';
            }
        }
        
        return result;
    }
}
