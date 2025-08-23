# Find First Palindromic String in the Array (LeetCode 2108)

Java implementation to solve the problem: Given an array of strings, find and return the first palindromic string in the array. If no such string exists, return an empty string `""`.

---

## Problem Statement

Given an array of strings `words`, return the first **palindromic** string in the array.  
If there is no such string, return an **empty string** `""`.

A string is **palindromic** if it reads the same forward and backward.

---

## Approach

- Traverse the array of strings.
- For each string, check if it is a palindrome:
  - Use two pointers (start and end) and compare characters while moving towards the center.
- Return the first palindromic string found.
- If no palindrome is found, return an empty string.

**Time Complexity:**  
- O(m * n), where m is the number of strings, and n is the average length of the strings.

