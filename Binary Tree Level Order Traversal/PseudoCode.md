## Problem Link : https://leetcode.com/problems/binary-tree-level-order-traversal/

### Pseudo Code :
  - Maintain Queue which stores elements in level order (top to bottom, left to right).
  - Push root in the Queue.
  - Repeat following steps till queue is non empty :
      - Delete en element from queue.
      - Push deleted element's left (if exists) in the queue.
      - Push deleted element's right (if exists) in the queue.

### Time Complexity :
  - O(N), as every node in the tree is visited once.
  
### Space Complexity : 
  - O(M) for queue.
  - Worst case for this is "Perfect Binary Tree", where M can be approximately half of N.
  - Best case for this is Linear (squeued) tree, where M will be 1.

#### Notations :
   - "N" is number of nodes in input tree.
   - "M" is the maximum no of nodes in a particular level.
   - A **Perfect Binary Tree** is a type of binary tree in which every internal node has exactly two child nodes and all the leaf nodes are at the same level.
