## Problem Link : https://leetcode.com/problems/binary-tree-vertical-order-traversal/

- We can assign vertical lines of the form (x = a) to each of the nodes, with root positioned at line x = 0.
- For any node at line x = a, its left and right child will always be at line, x = a - 1 and x = a + 1 respectively.

### Pseudo Code: 
  - Make a Pair of node and its value of "a" for x = a.
  - Start with (root, 0) as initial Pair.
  - Maintain a map containing "a" as key and all ndoes with vertical line of form x = a as the values.
  - Declare map in a way that it stores keys in sorted order as we have to traverse tree column by column from leftmost line.
  - Traverse the tree using either Level order or PreOrder Traversal and fill the map declared above accordingly.
  - At last, traverse the map and store all the nodes belonging to same vertical line in a single list.
  
 ### **NOTE :** 
  - PostOrder and InOrder traversal won't work here because we want to traverse from top to bottom, left to right. 
  - In case of PostOrder, of all the nodes belonging to same vertical line, the ones at the bottom will always be traversed first, violating the top to bottom constraint.
  - Inorder also violates the top to bottom constraint due to same reason as above.


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
