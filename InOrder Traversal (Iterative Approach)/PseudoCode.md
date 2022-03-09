## Problem Link : https://leetcode.com/problems/binary-tree-inorder-traversal/

Inorder traversal covers left subtree, followed by root, which in turn is followed by right subtree.

### Pseudo Code :
  - Maintain a stack and make current node point to root.
  - Repeat following steps till stack is non empty :
    - If current node is not null, push it into stack and make current node point to it's left.
    - If current node is null, pop from stack, add popped element into result and make current node point to popped element's right.

### Time Complexity :
  - O(N), as every node is visited once.

### Sapce Complexity :
  - O(H), as stack can grow maximum to the height of tree.
  - In worst case, "H" can be as large as "N" for left squeued trees.
  - In best case, stack's length will always be 1 for right squeued trees.

#### Notations :
   - "N" is the number of nodes in tree.
   - "H" is the height of tree.
