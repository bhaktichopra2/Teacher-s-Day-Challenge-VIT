# Invert Binary Tree

## Problem Statement

Given the root of a binary tree, invert the tree and return its root.

Inverting a binary tree means swapping the left and right children of all nodes in the tree.

---

## Approach

1. **Recursion**:  
   - If the current node is `null`, return `null`.
   - Swap the left and right children of the current node.
   - Recursively call the inversion on the left and right children (which are swapped).
   - Return the node after inversion.

2. **Why recursion?**  
   - Because we apply the same swapping operation on every node.
   - Recursion naturally traverses all nodes in the tree.

---

## Complexity Analysis

- **Time Complexity**: O(n), where n is the number of nodes in the tree.  
  We visit each node exactly once.

- **Space Complexity**: O(h), where h is the height of the tree, due to recursion stack space.
  In the worst case (skewed tree), h could be n.
