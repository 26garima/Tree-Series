## Problem Link : https://leetcode.com/problems/binary-tree-postorder-traversal/

PostOrder Traversal covers left subtree, followed by right subtree, which in turn is followed by the root.

### Pseudo Code :
  - Maintain two stacks s1 and s2.
  - Push root into s1.
  - Repeat the following steps till s1 is non empty :
     - Pop an element form s1.
     - Push popped element's left and right (if they exist) into s1.
     - Push popped element from s1 into s2.
  - Now s2 contains the elements in the order : node, it's right, it's left (which is reverse of postorder).
  - Keep popping elements from s2 and add them to **result** one by one.

### Time Complexity : 
  - O(N), as every node is visited once.

### Space Complexity :
  - O(N) for stack "s2" and o(H) for stack "s1". This overall O(N).
  - In worst case, "H" can be as large as "N" for linear trees.
  - In best case, "H" can be approximately "log(N)" for "Perfect Binary Trees" but still the space complexity will be same as O(N) due to the space taken up by stack "s2".

#### Notations :
  - "N" is the number of nodes in input tree.
  - "H" is the height of the tree.
  - A **Perfect Binary Tree** is a type of binary tree in which every internal node has exactly two child nodes and all the leaf nodes are at the same level.
