## Problem Link : https://leetcode.com/problems/binary-tree-level-order-traversal/

## Pseudo Code :
  - Maintain Queue which stores elements in level order (top to bottom, left to right).
  - Push root in the Queue.
  - Repeat following steps till queue is non empty :
      - Delete en element from queue.
      - Push deleted element's left (if exists) in the queue.
      - Push deleted element's right (if exists) in the queue.

## Time Complexity :
  - O(N), as every node in the tree is visited once.
  - "N" is the number of nodes in input tree.
  
## Space Complexity : 
  - O(N) for storing result and O(M) for the queue.
  - "N" is the number of nodes in input tree and "M" is the maximum no of nodes in a particular level.
