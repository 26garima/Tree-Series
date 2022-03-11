## Problem Link : https://leetcode.com/problems/binary-tree-zigzag-level-order-traversal/

Here the approach is similar to that of finding "Level Order Traversal" except for the fact that in here, we will also be switching direction after one level is completed.

### Pseudo Code :
  - Initially "direction" will point to "L",  implying starting direction as left to right.
  - Maintain Queue which stores elements in level order (top to bottom, left to right).
  - Push root in the Queue.
  - Repeat following steps till queue is non empty :
    - Delete en element from queue.
    - Push deleted element's left (if exists) in the queue.
    - Push deleted element's right (if exists) in the queue.
    - If direction is "L", add elements in same order and switch direction to "R".
    - If direction is "R", add elements in reverse order and switch direction to "L".

### Time Complexity : 
  - O(N), as every node is visited once.
  
### Space Complexity :
  - O(M) for queue.
  - Worst case for this is "Perfect Binary Tree", where M can be approximately half of N.
  - Best case for this is Linear (squeued) tree, where M will be 1.

#### Notations :
  - "N" is number of nodes in input tree.
  - "M" is the maximum no of nodes in a particular level.
  - A Perfect Binary Tree is a type of binary tree in which every internal node has exactly two child nodes and all the leaf nodes are at the same level
