## Problem Link : https://leetcode.com/problems/search-in-a-binary-search-tree/
The property of a BST which differentiates it from a Binary Tree is :
  - **Left Child's value < Root's value < Right Child's value**
  - **The above property must hold for all subtrees of the BST.**
  
### Pseudo Code :
  - If root.value < target.value, then target node(if exists) will be in right subtree.
  - If root.value > target.value, then target node(if exists) will be in left subtree.
  - If root.value = target.value, search successful.

### Time Complexity :
  - O(H), where "H" is the height of input BST.
  - Squeued trees are the worst case for this when "H" can be as large as "N", the number of nodes in the input BST.

### Space Complexity : 
  - O(1).
  - Squeued trees are the worst case for this when "H" can be as large as "N", the number of nodes in the input BST.
