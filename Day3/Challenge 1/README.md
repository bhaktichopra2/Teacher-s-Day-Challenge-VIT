# Remove Linked List Elements

## Problem Statement

Given the head of a singly linked list and an integer value `val`, remove all nodes from the linked list where the node's value equals `val`. Return the head of the modified linked list after all such nodes have been removed.

For example, if the input linked list is:

1 -> 2 -> 6 -> 3 -> 4 -> 5 -> 6
and `val = 6`, the output should be:

1 -> 2 -> 3 -> 4 -> 5## Approach

To efficiently remove nodes with the specified value, we use the **dummy node technique**:

- Create a dummy node which acts as a new temporary head pointing to the original list. This simplifies edge cases like when the head node itself needs to be removed.
- Use a pointer (`current`) starting at the dummy node to iterate through the list.
- For each node, check if the next node's value equals `val`.
  - If yes, bypass the next node by linking the current node to the one after next, effectively removing it.
  - If no, just move the current pointer forward.
- Continue until all nodes are processed.
- Return the `next` pointer of the dummy node, which points to the head of the modified list.

This approach ensures **all matching nodes are removed**, including the original head if needed, and runs in **O(n)** time where n is the number of nodes.
