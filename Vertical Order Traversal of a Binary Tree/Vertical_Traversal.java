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
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        if(root == null)
            return result;
        
        TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();
        Queue<Tuple> q = new LinkedList<>();
        q.offer(new Tuple(root, 0 ,0));
        
        // Using Level Order Traversal to traverse entire tree
        while(!q.isEmpty()) {
            Tuple temp = q.poll();
            int currVertical = temp.vertical;
            int currLevel = temp.level;
            if(!map.containsKey(currVertical))
                map.put(currVertical, new TreeMap<Integer, PriorityQueue<Integer>>());
            if(!map.get(currVertical).containsKey(currLevel))
                map.get(currVertical).put(currLevel, new PriorityQueue<Integer>());
            map.get(currVertical).get(currLevel).add(temp.root.val);
            if(temp.root.left != null) 
                q.offer(new Tuple(temp.root.left, currVertical - 1, currLevel + 1));
            if(temp.root.right != null)
                q.offer(new Tuple(temp.root.right, currVertical + 1, currLevel + 1));
        }
        
        for(TreeMap<Integer, PriorityQueue<Integer>> levels : map.values()) {
            result.add(new ArrayList<Integer>());
            for(PriorityQueue<Integer> pq : levels.values()) {
                while(!pq.isEmpty()) {
                    result.get(result.size() - 1).add(pq.poll());
                }
            }
        }
        
        return result;
    }
}

class Tuple {
    TreeNode root;
    int vertical;
    int level;
    
    Tuple(TreeNode root, int vertical, int level) {
        this.root = root;
        this.vertical = vertical;
        this.level = level;
    }
}
