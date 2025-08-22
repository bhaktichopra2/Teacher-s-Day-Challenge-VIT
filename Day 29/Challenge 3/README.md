# Arrival of the General

This Java program solves the "General" problem, which calculates the minimum number of adjacent swaps needed to move the tallest soldier to the front and the shortest soldier to the end of a line.

---

## Problem Statement

A squad of `n` soldiers is lined up in arbitrary order. The goal is to rearrange the line so the **first** soldier has the maximum height and the **last** soldier has the minimum height. Other soldiers’ positions do not matter.

In one move, you can swap any two neighboring soldiers.  
Find the **minimum number of swaps** required to achieve this line-up.

---

## Approach

1. Iterate through the array to find:
   - The **first occurrence** of the maximum height (leftmost max).
   - The **last occurrence** of the minimum height (rightmost min).
2. To move the tallest soldier to the front, it takes `maxIndex` swaps.
3. To move the shortest soldier to the end, it takes `(n - 1 - minIndex)` swaps.
4. If the tallest is ahead of the shortest, subtract one from the total swaps (as moving the tallest forward shifts the shortest back one position).
5. Print the total number of swaps.

**Complexity:**  
- Time: O(n) (one pass over the list)
- Space: O(n) (for storing heights)
