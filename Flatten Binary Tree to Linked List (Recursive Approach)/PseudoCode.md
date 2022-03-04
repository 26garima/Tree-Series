## Problem Link : https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

### Pseudo Code :
  - We can observe that elements in the resulting linked list are actually the preorder traversal of the tree.
  - Keep an initial pointer pointing to "null".
  - Recursively traverse the right subtree.
  - Recursively traverse the left subtree.
  - Make the current Node's right point to initial pointer and left point to null.
  - Assign initial pointer to current Node. 
  
### Time Complexity :
  - O(H) where "H" is the height of the tree.
  - Squeued trees are the worse case for this algorithm where "H" will become equal to "N", the number of node in the input tree.
  
### Space Complexity :
  - O(H), due to auxillary space for recursion. 
  - Squeued trees are the worse case for this algorithm where "H" will become equal to "N", the number of node in the input tree.
