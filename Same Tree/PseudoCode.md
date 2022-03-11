## Probblem Link : https://leetcode.com/problems/same-tree/

### Pseudo Code :
  - If both roots are null, return true.
  - If both are not null, 
     - If they contain same values, recursively run the same algo on their left and right subtree. Return logical AND of it.
     - If they contain different values, return false.
  - If either is null and another is not null, return false.

### Time Complexity : 
  - O(N), as every node of both the trees is visited once.

### Space Complexity :
  - O(H) for auxillary recursion space.
  - In worst case, "H" can be as large as "N" for linear trees.

#### Notations :
  - "N" is the minimum of the number of nodes in both trees.
  - "H" is the minimum of the height of both trees.
