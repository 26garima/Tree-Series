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
    public int widthOfBinaryTree(TreeNode root) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root,0));
        int result = Integer.MIN_VALUE;
        
        while(!q.isEmpty()) {
            int size = q.size();
            int firstValue = 0;
            int lastValue = 0;
            int minValue = 0;
            for(int i = 0; i < size; i++) {
                Pair t = q.poll();
                if(i == 0) {
                    minValue = t.value;
                }
                if(i == 0) {
                    firstValue = t.value - minValue;
                }
                if(i == size - 1) {
                    lastValue = t.value - minValue;
                }
                if(t.node.left != null)
                    q.offer(new Pair(t.node.left, 2*(t.value - minValue)+1));
                if(t.node.right != null) 
                    q.offer(new Pair(t.node.right, 2*(t.value - minValue)+2));
            }
            result = Math.max(result, lastValue - firstValue + 1);
        }
        return result;
    }
}

class Pair {
    TreeNode node;
    int value;
    
    Pair(TreeNode node, int value) {
        this.node = node;
        this.value = value;
    }
}
