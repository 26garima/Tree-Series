## Problem Link : https://leetcode.com/problems/binary-tree-preorder-traversal/

Preorder Traversal covers root, followed by left subtree, which in turn is followed by right subtree.

### Pseudo Code :
  - Print current node's value.
  - Recursively traverse the left subtree.
  - Recursively traverse the right subtree.
  
### Time Complexity : 
  - O(N), as every node in root is visited once.
  - "N" is the number of nodes in the tree.

### Space Complexity :
  - O(H), for auxillary recursion space.
  - "H" is the height of the tree. In worst case, "H" can be as large as "N" (number of nodes in input tree).
