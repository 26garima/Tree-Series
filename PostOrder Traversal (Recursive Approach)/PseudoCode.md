## Problem Link : https://leetcode.com/problems/binary-tree-postorder-traversal/submissions/

PostOrder Traversal covers left subtree, followed by right subtree, which in turn is followed by root.

### Pseudo Code :
  - Recursively traverse the left subtree.
  - Recursively traverse the right subtree.
  - Print current node's value.
  
### Time Complexity : 
  - O(N), as every node in root is visited once.


### Space Complexity :
  - O(H), for auxillary recursion space.
  - In worst case, "H" can be as large as "N".

#### Notations :
  - "N" is the number of nodes in the tree.
  - "H" is the height of the tree.
