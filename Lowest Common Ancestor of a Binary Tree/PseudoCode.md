## Problem Link : https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-tree/

### Pseudo Code :
  - If current node itself is either of the values (p or q), return current node to it's parent.
  - For any node, if any of left or right subtree returns null and other a non null value, return the non null value to the parent.
  - For any node, if left and right subtrees return non null values, current node is the LCA.
  - For any node, if both left and right subtrees return null, return null to parent.
 
### Time Complexity :
  - O(N) as every node is visited exactly once.
 
### Space Complexity :
  - O(H) for auxillary recursion space.
  - In worst case, "H" can be as large as "N" for linear trees.
  
#### Notations :
  - "N" is the number of nodes in input tree.
  - "H" is height of the tree.
