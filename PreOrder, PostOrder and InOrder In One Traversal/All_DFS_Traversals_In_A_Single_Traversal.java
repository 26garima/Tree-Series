import java.util.*;
import java.io.*;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        data = val;
        left = null;
        right = null;
    }
}

class Pair {
    TreeNode node;
    int count;
    Pair(TreeNode node, int count) {
        this.node = node;
        this.count = count;
    }
}

class MainClass {
    static List<Integer> pre = new ArrayList<>();
    static List<Integer> in = new ArrayList<>();
    static List<Integer> post = new ArrayList<>();
    public static void main(String args[]) throws IOException{
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        allTraversals(root);
        System.out.print("PreOrder Traversal : ");
        for(int i = 0; i < pre.size(); i++) {
            System.out.print(pre.get(i) + " ");
        }
        System.out.println();

        System.out.print("InOrder Traversal : ");
        for(int i = 0; i < in.size(); i++) {
            System.out.print(in.get(i) + " ");
        }
        System.out.println();

        System.out.print("PostOrder Traversal : ");
        for(int i = 0; i < post.size(); i++) {
            System.out.print(post.get(i) + " ");
        }
    }

    public static void allTraversals(TreeNode root) {
        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,1));
        while(!st.isEmpty()) {
            Pair temp = st.pop();
            if(temp.count == 1) {
                temp.count++;
                pre.add(temp.node.data);
                st.push(temp);
                if(temp.node.left != null) {
                    st.push(new Pair(temp.node.left, 1));
                }
            } else if(temp.count == 2) {
                temp.count++;
                st.push(temp);
                in.add(temp.node.data);
                if(temp.node.right != null) {
                    st.push(new Pair(temp.node.right, 1));
                }
            } else {
                post.add(temp.node.data);
            }
        }
    }
}

/* ------------ Output ------------
PreOrder Traversal : 1 2 4 5 3 6 7 
InOrder Traversal : 4 2 5 1 6 3 7 
PostOrder Traversal : 4 5 2 6 7 3 1 
*/
