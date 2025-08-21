# Reverse Linked List 

## Problem Statement

Given the head of a singly linked list, reverse the list and return the new head.

## Approach

- **Initialize**:
  - `prev` as `null`
  - `current` as `head`
  - `next` as `null`
- **Iterate** through the list:
  - Store the next node: `next = current.next`
  - Reverse the current node's link: `current.next = prev`
  - Move `prev` and `current` one step forward
- **Continue** until `current` is `null`
- Return `prev` (the new head of the reversed list)

This is an **iterative** constant-space approach (O(n) time, O(1) extra space).
