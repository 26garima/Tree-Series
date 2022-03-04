## Problem Link : https://leetcode.com/problems/flatten-binary-tree-to-linked-list/

Morris Traversal uses the concept of "Threaded Binary Tree".

### Pseudo Code :
  - We can observe that elements in resulting linked list are the preorder traversal of input tree.
  - Start with current node as root.
  - If current node's left pointer is not null,
      - Make the right pointer of left subtree's rightmost child point to current node's right.
      - Make current node's left pointer as null.
      - Make current node's right pointer point to it's left child.
  - Move to the right subtree of current node and repeat the above steps.
### Time Complexity :
  - O(H) where "H" is the height of the tree. 
  - Squeued trees are the worst case for this algorithm where "H" will be equal to "N", the number of nodes in the tree.
### Space Complexity :
  - O(1) becasue after modifying the left subtree, instead of recursively backtracking to the parent, we are directly moving to the root's right via the "threaded links".
