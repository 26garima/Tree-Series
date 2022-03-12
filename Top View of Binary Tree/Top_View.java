import java.util.*;
import java.io.*;

class Pair {
    TreeNode node;
    int vertex;
    Pair(TreeNode node, int vertex) {
        this.node = node;
        this.vertex = vertex;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int data) {
        this.val = data;
        left = null;
        right = null;
    }
}

class TopView {
    static ArrayList<Integer> res = new ArrayList<>();
    public static void main(String args[]) throws IOException{
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        res = getTopView(root);
        for(int x : res) {
            System.out.println(x);
        }
    }

    public static ArrayList<Integer> getTopView(TreeNode root) {
        if(root == null)
            return res;
        
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(root, 0));
        
        TreeMap<Integer, Integer> map = new TreeMap<>();
        
        // Level order Traversal
        while(!q.isEmpty()) {
            Pair temp = q.poll();
            if(!map.containsKey(temp.vertex)) {
                map.put(temp.vertex, temp.node.val);
            }
            if(temp.node.left != null)
                q.offer(new Pair(temp.node.left, temp.vertex-1));
            if(temp.node.right != null)
                q.offer(new Pair(temp.node.right, temp.vertex+1));
        }
        
        for(int x : map.values())
            res.add(x);
        
        return res;
	}
}

/* ------- TESTCASES ----------
    [1,2,3,4,5,6,7,8,9,null,null,null,null,null,null,null,null,null,null]
    [1,2,3,null,null,null,null]
    [1,3,null,null,2,null,null]
    []
    [1]
    [1,2,3]
    [1,2,3,4,null,5,6,null,7]
    [2,7,5,2,6,null,9,null,null,5,11,4]
*/
