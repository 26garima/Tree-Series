## Problem Link : https://leetcode.com/problems/maximum-depth-of-binary-tree/

### Pseudo Code :
  - Store the height of left subtree in "L".
  - Store the height of right subtree in "R".
  - Actual Depth of tree is (1 + max(L, R)).

### Time Complexity : 
  - O(N), as every node is visited once.

### Space Compexity: 
  - O(H) for auxillary recursion space.
  - In worst case, "H" can be as largs as "N' for linear trees.

#### Notations :
  - "N" is the number of nodes in input tree.
  - "H" is the height of input tree.
