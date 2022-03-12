## Problem Link : https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

- We can assign vertical lines to each of the nodes, with root positioned at line 0.
- For any node at vertical line x, its left child will be at line (x - 1) and its right child will be at line (x + 1).
- If a node it at level y, its children will always be at level (y + 1).

### Pseuco Code :
  - Make a Tuple of node, vertical line node is positioned at and level of node.
  - Start with (root, 0, 0) as initial Tuple.
  - Maintain a map containing vertical line as key and its value itself will be map of various levels in a particular vertical line.

### Time Complexity :

### Space Complexity : 

#### Notations : 
  - "N" is the number of nodes in input tree.
  - "H" is the height of input tree.
