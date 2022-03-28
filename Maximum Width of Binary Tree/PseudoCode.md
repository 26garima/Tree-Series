## Problem Link : https://leetcode.com/problems/maximum-width-of-binary-tree/

### Pseudo Code :
  - If a node exists at location x, it's left & right subchild will be at (2x+1) and (2x+2) respectively, provided x starts from 0.
  - Start with considering node at location 0.
  - Perform Level order traversal of the tree to find the difference between the location of first and last node at a particular level.
  - **Maximum width** will be the maximum of all the differences obtained in above step for various levels.

### Time Complexity :
  - O(N) to perform level order traversal of tree.
  
### Space Complexity :
  - O(M) for queue.
  - Worst case for this is "Perfect Binary Tree", where M can be approximately half of N.
  - Best case for this is Linear trees for which M will be 1.
  
#### Notations :
  - "N" is the number of nodes in input tree.
  - "M" is the maximum no of nodes in a particular level.
  - A ***Perfect Binary Tree** is a type of binary tree in which every internal node has exactly two child nodes and all the leaf nodes are at the same level.
