# Maximum Depth of Binary Tree (Java)

## Problem Statement

Given the root of a binary tree, return its maximum depth. The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

## Approach

1. **If the tree is empty** (`root == null`), return 0.
2. **Recursively compute the maximum depth** of both left and right subtrees.
3. The maximum depth of the tree is `1 + max(leftDepth, rightDepth)`.
   - The +1 accounts for the current root node.

This is a classic **recursive depth-first search (DFS)** approach.

