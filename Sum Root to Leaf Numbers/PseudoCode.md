## Problem Link : https://leetcode.com/problems/sum-root-to-leaf-numbers/

### Pseudo Code :
  - Initialize "currentSum" to 0.
  - Traverse the tree in top to bottom, left to right fashion.
  - While calling recursion on left and right subtree, currentSum will be update to (currentSum * 10 + currentNode's value).
  - While returning back, value of sum at a node will be summation of left and right subtree sum.

### Time Complexity : 
  - O(N), as every node is traversed once.
  
### Space Complexity :
  - O(H) for auxillary recusrion space.
  
#### Notations :
  - "N" is the number of nodes in input tree.
  - "H" is the height of input tree.
