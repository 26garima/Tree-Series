## Problem Link : https://leetcode.com/problems/diameter-of-binary-tree/

Brute force approach is for every node, find the sum of height of its left and right subtree and return the maximum of all sums. Time Complexity of this approach will be O(N^2). 

Instead, I will be tweaking the function to find height of the tree to find the maximum of sum of left and rihgt subtrees of a node.

### Pseudo Code :
  - Store height of left subtree in "L".
  - Store height of right subtree in "R".
  - Find sum of "L" and "R". If this sum is greater than present diameter, update diameter to this sum.
  - Return height of current node.

### Time complexity : 
  - O(N), as every node is visited once.
  
### Space complexity : 
  - O(H) for auxillary recursion space.
  - In worst case, "H" can be as large as "N" for linear trees.

#### Notations : 
  - "N" is the number of nodes in input tree.
  - "H" is the height of the input tree.
