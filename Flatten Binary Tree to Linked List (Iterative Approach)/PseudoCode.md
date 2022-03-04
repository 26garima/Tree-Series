## Problem Link : https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
### Pseudo Code :
  - We can observe that elements in the resulting linked list are actually the preorder traversal of the tree.
  - Initialize an empty stack of Tree Node.
  - Push the root into stack, if root is not null.
  - Repeat the below steps till stack is not empty :
       - Pop an element from stack.
       - If left pointer of popped element is not null, push it into stack.
       - If right pointer of popped element is not null, push it into stack.
       - Make left pointer of popped element as null.
       - If stack is not empty, make right pointer of popped element point to topmost element in stack.

### Time Complexity :
  - O(H) where "H" is the height of the tree.
  - Squeued trees are the worst case for this algorithm where "H" will become equal to "N", the number of nodes in the input tree.
### Space Complexity :
  - O(H), due to auxillary space for recursion.
  - Squeued trees are the worst case for this algorithm where "H" will become equal to "N", the number of nodes in the input tree.
