## Problem Link : https://leetcode.com/problems/symmetric-tree/

### Pseudo Code :
  - While traversing a tree and it's mirror image using any traversal, whenever original tree is at it's left subtree, it's symmetric tree must be at its right subtree.
  - To maintain symmetricity, left node's value should be equal to right node's value.
  - The above property must hold for all subtrees.
    
### Time Complexity :
  - O(N), as every node is visited exactly once.
  
### Space Complexity : 
  - O(H) for auxillary recursion space.
  - In worst case, "H" can be as large as "N" for linear trees.
  
#### Notations :  
  - "N" is number of nodes in input tree.
  - "H" is the height of the tree.
