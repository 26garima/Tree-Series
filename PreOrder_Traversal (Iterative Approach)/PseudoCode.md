## Problem Link : https://leetcode.com/problems/binary-tree-preorder-traversal/

Preorder traversal covers root, followed by left subtree, which in turn is followed by right subtree.

### Pseudo Code :
  - Maintain a stack and push root into it.
  - Repeat the following steps till stack is non empty :
     - Pop from stack and add this node's val in result.
     - Push popped node's right (if exists) into stack.
     - Push popped node's left (if exists) into stack.

### Time Complexity :
  - O(N), as every node is visited once.

### Space Complexity :
  - O(H), as stack can grow maximum to the height of tree.
  - In worst case, "H" can be as large as "N" for linear (squeued) trees.

#### Notations :
   - "N" is number of nodes in input tree.
   - "H" is the height of input tree.
