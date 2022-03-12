- In Clock Wise boundary traversal we cover right boundary, followed by all leaves and then left bounday in reverse order.
- To find Right Boundary nodes, we need to keep moving to the right as long as possible in right subtree. If right doesn't exist, we move to left pointer as long as these nodes are not leaves.
- To find Left Boundary nodes, we need to keep moving to the left as long as possible in left subtree. If left doesn't exist, we move to right pointer as long as these nodes are not leaves.

### Pseudo Code :
  - Add Right Boundary nodes.
  - Add all leaves using any of the traversal techniques, provided we traverse the right leaf, followed by left leaf.
  - Add Left Boundary nodes, but in reverse order.

### Time Complexity :
  - O)H) to find Right Boundary nodes.
  - O(N) to find all leaf nodes.
  - O(H) to find Left Boundary nodes.
  - Thus overall time complexity is **O(N)**.

### Space Complexity :
  - O(H) for auxillary recursion space in finding right boundary nodes, leaf nodes and left boundary nodes.
  - O(H) to store all the left boundary nodes so that they can be reversed at the end.
  - In worse case, "H" can be as large as "N".

#### Notations :
  - "N" is the number of nodes in the input tree.
  - "H" is the height of input tree.
