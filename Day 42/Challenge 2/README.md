# Kyoya and Photobooks

Java solution to calculate the number of distinct photobooks that can be created by inserting one additional photo (a lowercase letter) at any position in an existing photobook.

---

## Problem Statement

Given a string `photo` consisting of lowercase English letters, representing a photobook, find how many distinct photobooks can be created by inserting **one** extra photo (any lowercase letter) at **any** position in the book (including before the first character and after the last character).

---

## Input Format

- A single string: `photo` (`1 ≤ photo.length() ≤ 20`), containing only lowercase English letters.

---

## Output Format

- A single integer: the number of distinct photobooks that can be created with one extra insertion.

---

## Approach

- There are `length + 1` insertion positions in the string.
- Each position allows adding any of 26 lowercase letters: `26 * (length + 1)` possibilities.
- Inserting the same photo as one already present at a position may create duplicate photobooks. Each original character creates a duplicate that must be subtracted.
- Final answer: `26 * (length + 1) - length`.

**Complexity:**  
- Time: O(1)  
- Space: O(1)
