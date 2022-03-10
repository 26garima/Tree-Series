## Problem Link : https://leetcode.com/problems/binary-tree-postorder-traversal/

PostOrder Traversal covers left subtree, followed by right subtree, which in turn is followed by the root.

### Pseudo Code :
  - Maintain a stack and curr pointer, pointing to root of tree.
  - Push curr pointer's value into stack and update it to its left pointer.
  - Repeat avove step as long as left pointer(curr) is not null.
  - As soon as, curr is null (means the left subtree doesn't exist for the stack's topmost node), make curr point to stack's topmost element right pointer and repeat above steps.
  - If right poiner is also null, it implies that the topmost element's both subtrees are covered. In this case, pop an element stack and add it to result.
  
### Time Complexity :
  - O(N), as every node is visited once.

### Space Complexity :
  - O(H)
  - In worst case, "H" can be as large as "N" for linear trees.
  - In best case, "H" can be approximately "log(N)" for "Perfect Binary Trees" but still the space complexity will be same as O(N) due to the space taken up by stack "s2".

#### Notations :
  - "N" is the number of nodes in input tree.
  - "H" is the height of the tree.
  - A Perfect Binary Tree is a type of binary tree in which every internal node has exactly two child nodes and all the leaf nodes are at the same level.
