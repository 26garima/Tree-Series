## Problem Link : https://www.interviewbit.com/problems/path-to-given-node/

### Pseudo Code :
  - If current node's value is not equal to given node, add this node into result and recursively traverse it's left and right subtrees.
  - If current node's value is equal to given node, add the node into list and return itself to parent, without traversing the subtrees.
  - For any node, if both subtrees return null, remove this node from list and return null to parent.
  - For any node, if either of it's subtrees return a non null value, return this non null value to parent.

### Time Complexity :
  - O(N), as every node is visited exactly once.
 
### Space Complexity :
  - O(H) for auxillary recursion space.
  - In worst case, "H" can be as large as "N" for linear trees.
  
#### Notations :
- "N" is number of nodes in tree.
- "H" is height of the tree.
