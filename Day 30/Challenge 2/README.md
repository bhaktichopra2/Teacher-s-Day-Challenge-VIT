# Night at the Museum

This Java program solves the "Night at the Museum" problem, where you must print a string using an embosser device. The embosser has a rotating wheel with lowercase English letters. The goal is to compute the minimum number of rotations needed to print the given name.

---

## Problem Statement

Grigoriy works as a museum night guard. He uses an **embosser** to print names on a plastic tape. The embosser has a wheel with the lowercase English alphabet arranged in a circle. The pointer initially points to `'a'`.

To print a string:
- Each character is printed sequentially.
- You can rotate the wheel **one step at a time**, clockwise or counterclockwise, to move from the current character to the next.
- Find the **minimum number of rotations** needed to print the given string.

Only the pointer's current position matters when moving to a new character; you do not need to return to `'a'` at the end.

---


## Approach

- Start from `'a'`.
- For each character in the string, calculate the minimum distance to it from the current letter:
  - The alphabet is a circle (`26` letters).
  - Distance is `min(abs(current - next), 26 - abs(current - next))`
- Accumulate the rotations for all characters.

**Complexity:**  
- Time: O(n), where n is the length of the string.
- Space: O(1).

