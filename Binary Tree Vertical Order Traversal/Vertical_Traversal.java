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
    public List<List<Integer>> verticalOrder(TreeNode root) {
        if(root == null)
            return result;
        
        TreeMap<Integer, List<Integer>> map = new TreeMap<>();
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        
        // Level Order Traversal
        while(!q.isEmpty()) {
            Pair p = q.poll();
            if(!map.containsKey(p.vertical)) 
                map.put(p.vertical, new ArrayList<Integer>());
            map.get(p.vertical).add(p.root.val);
            
            if(p.root.left != null) {
                q.offer(new Pair(p.root.left, p.vertical - 1));
            }
            if(p.root.right != null) {
                q.offer(new Pair(p.root.right, p.vertical + 1));
            }
        }
        
        for(List<Integer> li : map.values()) {
            result.add(new ArrayList<Integer>());
            for(int x : li)
                result.get(result.size() - 1).add(x);
        }
        
        return result;
    }
}

class Pair {
    TreeNode root;
    int vertical;
    
    Pair(TreeNode root, int vertical) {
        this.root = root;
        this.vertical = vertical;
    }
}
