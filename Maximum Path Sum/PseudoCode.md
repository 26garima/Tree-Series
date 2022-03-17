## Problem Link : https://leetcode.com/problems/binary-tree-maximum-path-sum/

### Pseudo Code :
  - Considering every node as the turning point in the path, maximum path sum for that node will be sum of its value, its left subtree's and right subtree's sum (provided neither left nor right subtree's sum is less than 0).
  - Thus, "Maximum Path Sum" of entire tree will be maximum of the above calculated value for each node.
  - From any node, we can either include it's left or right subtree in the path, thus we will return **(root.val + Math.max(left subtree sum, right subtree sum)** from the function.

### Time Complexity :
  - O(N) as every node is visited only once.

### Space Complexity :
  - O(H) for auxillary recursion space.
  - In worst case, "H" can be as large as "N" for linear trees.
  
### Notations :
  - "N" is the number of nodes in the tree.
  - "H" is the height of the tree.
