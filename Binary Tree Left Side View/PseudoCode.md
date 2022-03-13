### Pseudo Code :
  - At any particular level, we want the leftmost node of it. Due to this, we will be traversing left subtree, followed by right subtree.
  - Intilaise a list "result" containing all the nodes in left view.
  - Whenever result's size is equal to currLevel, we will add that particular node into result and move on to traversing this node's left subtreee, followed by its right subtree.

### Time Complexity :
  - O(N), as every node is visited exactly once in the traversal.

### Space Complexity :
  - O(H) for auxillary recursion space.
  - In worse case, "H" can be as large as "N" for linear trees.

#### Notations :
  - "N" is the number of nodes in iput tree.
  - "H" is the height of input tree.
