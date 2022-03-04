## Problem Link : https://leetcode.com/problems/binary-tree-inorder-traversal/

  Morris Traversal uses the concept of "Threaded Binary Tree".
### Pseudo Code :
  - If current Node's left subtree is null, add current Node to the result and move to its right subtree.
  - Else, make the right pointer of rightmost node of left subtree point to current Node and move to left subtree.
  - Repeat the above steps for all subtrees.
  - After moving to left subtree in step 2, the right pointer of it's rightmost child shall be pointing to current Node (because of the threaded link we created in Step 2). In this particular case, we will remove this threaded link and move to the right subtree of current Node.

### Time Complexity : 
  - O(H) where "H" is the height of the tree. Squeued trees are the worst case for this algorithm where "H" will be equal to "N", the number of nodes in the tree.
    
### Space Complexity : 
  - O(1) becasue after traversing the left subtree, instead of recursively backtracking to the parent, we are directly moving to the root via the "threaded links".
