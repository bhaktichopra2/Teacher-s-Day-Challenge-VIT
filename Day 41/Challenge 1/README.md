# Find Words Containing Character

Java solution for finding indices of words in an array that contain a specific character.

---

## Problem Statement

Given a 0-indexed array of strings `words` and a character `x`, return an array of indices representing the words that contain the character `x`.

---

## Input Format

- An array of strings `words`.
- A character `x`.

---

## Output Format

- Return a list of integers — the indices of words that contain the character `x`.
- The order of indices in the result can be arbitrary.

---

## Approach

- Iterate through each word in the array.
- For each word, check if it contains the character `x` using the built-in `indexOf` method.
- If yes, add the index of that word to the result list.
- Return the result list containing indices.

**Complexity:**  
- Time: O(n * m), where n is the number of words and m is the average length of each word.  
- Space: O(k), where k is the number of words containing `x`.

