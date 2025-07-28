# Same Tree

## Problem Statement

Given the roots of two binary trees `p` and `q`, write a function to check if they are the same or not.

Two binary trees are considered the same if they are **structurally identical** and the nodes have the **same value**.

## Approach

The solution uses a **recursive traversal** of both trees simultaneously.

- If both current nodes are `null`, they are the same at this position.
- If only one is `null`, trees aren't the same.
- If node values differ, trees aren't the same.
- Otherwise, recursively check the left subtree and the right subtree.

This ensures:
- Both the structure is checked.
- And the node values are equal at every corresponding position.

The recursion halts as soon as any mismatch is found, which optimizes runtime in cases where trees differ early.

## Time Complexity

- The algorithm visits each node exactly once.
- Time complexity: **O(n)**, where *n* is the number of nodes in the smaller tree (assuming trees sizes are similar).


