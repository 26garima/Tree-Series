## Problem Link : https://leetcode.com/problems/binary-tree-inorder-traversal/

Inorder Traversal covers left subtree, followed by root, which in turn is followed by right subtree.

### Pseudo Code :
  - Recursively traverse the left subtree.
  - Print current node's value.
  - Recursively traverse the right subtree.
  
### Time Complexity : 
  - O(N), as every node in root is visited once.

### Space Complexity :
  - O(H), for auxillary recursion space.
  - In worst case, "H" can be as large as "N".

#### Notations :
  - "N" is the number of nodes in the tree.
  - "H" is the height of the tree.

