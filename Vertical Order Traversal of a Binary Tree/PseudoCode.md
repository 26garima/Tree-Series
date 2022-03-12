## Problem Link : https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/

- We can assign vertical lines of the form (x = a) to each of the nodes, with root positioned at line x = 0.
- For any node at line x = a, its left and right child will always be at line, x = a - 1 and x = a + 1 respectively.
- If a node it at level y, its children will always be at level (y + 1).

### Pseuco Code :
  - Make a Tuple of (node, vertical line of the node at which it is positioned and level of node).
  - Start with (root, 0, 0) as initial Tuple.
  - Maintain a map containing vertical lines as key and its value itself as a map of various levels and their respective node values.
  - Declare map in a way that it stores keys in sorted order as we want to start from leftmost vertical line.
  - Traverse the tree and fill the map accordingly in above step.
  - At last, traverse the map and store all the nodes belonging to same vertical line in a single list.

### Time Complexity :
  - O(N), as every node is traversed once.
  - O(log(N)), because we are using map such that its keys are always in sorted order.
  - Thus, overall time complexity is **O(N * log(N))**.
  
### Space Complexity : 
  - O(H) for tree traversal using any of the traversal techniques.
  - O(1) for tree traversal if Morris Traversal is used.
  - In worst case, "H" can be as large as "N" for linear trees.
  
#### Notations : 
  - "N" is the number of nodes in input tree.
  - "H" is the height of input tree.
