## Problem Link : https://leetcode.com/problems/balanced-binary-tree/

Brute force approach involves finding the difference between height of left and right subtrees for every node, which will result in O(N^2) time complexity.

Instead, I will be modifying the funciton which calculates the height of the tree in such a way that if the tree is balanced, the function will return its height or else "-1". This way time complexity reduces from O(N^2) to O(N).

### Pseudo Code :
  - Store the hright of left subtree in "L".
  - Store the height of right subtree in "R".
  - If absolute difference of "L" and "R" is greater than 1 (implying the tree is not balanced), return -1.
  - If "L" and/or "R" is already -1, it means either or both of the subtrees of current node is not balanced. In this case also, return -1 to propagate the information to current node's parent.
  - If neither of above two conditions are met, it means tree with current node as parent is balanced. In this case, return height of tree (1 + max(L, R)).

### Time Complexity :
  - O(N), as every node is visited only once.

### Space Complexity :
  - O(H), for auxillary recursion space.
  - In worst case, "H" can be as large as "N" for linear trees.

#### Notations :
  - "N" is the number of nodes in the input tree.
  - "H" is the height of the tree.
