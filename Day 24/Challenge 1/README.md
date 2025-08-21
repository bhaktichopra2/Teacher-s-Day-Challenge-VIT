# First Unique Character in a String

This Java program provides a solution to LeetCode problem [387. First Unique Character in a String](https://leetcode.com/problems/first-unique-character-in-a-string/).

---

## Problem Statement

Given a string `s`, find the **first** non-repeating character in it and return its index.  
If it does **not** exist, return `-1`.



## Approach

- For each character in the string, check if it's unique by comparing it to every other character.
- Return the index of the first unique character found.
- If no unique character exists, return `-1`.

*Note:*  
The provided approach uses a nested loop, resulting in O(n^2) time complexity.

