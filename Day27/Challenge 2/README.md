# Check if the Sentence Is Pangram (LeetCode 1832)

A Java solution to check whether a given sentence is a pangram, that is, if it contains every letter of the English alphabet at least once.

---

## Problem Statement

A **pangram** is a sentence where every letter of the English alphabet appears at least once.

Given a string `sentence` containing only lowercase English letters, return `true` if `sentence` is a pangram, or `false` otherwise.

---

## Approach

- Iterate through the sentence, adding each character to a HashSet.
- If the size of the set is 26 (i.e., all English letters are present), return `true`.
- Otherwise, return `false`.

**Time Complexity:**  
- O(n) where n is the length of the input sentence.

