# isBST
Check if a binary tree is a binary search tree

1. true: last_printed<=t.data (leftMax<=t.data<=rightMin) 
   null
   In Order traversal the tree and compare on the go 
   use a static value to record last_printed, then last_printed=t.data

2. true: leftMax<=t.data<rightMin
   null
   if not leftMax<=t.data<rightMin    return false;
   !isBST(t.left,leftMax,t.data) return false;
   !isBST(t.right,t.data,rightMin) return false;
   return true

Both of Methods:
Time O, we have to touch all the nodes
Space O(lgn) since we use recursion
