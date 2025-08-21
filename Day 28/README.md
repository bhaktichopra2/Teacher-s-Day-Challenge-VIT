# Maximum Number of Words Found in Sentences

This is a Java solution to compute the maximum number of words in any sentence within a given array of sentences.

---

## Problem Statement

Given an array of sentences (each sentence is a string of words separated by single spaces), determine the maximum number of words that appear in any single sentence.

---

## Approach

- For each sentence in the array:
  1. Split the sentence by spaces to get the words.
  2. Count the number of words.
  3. Track and update the maximum count observed.

**Complexity:**  
- Time: O(n * k), where n is the number of sentences, and k is the average number of words per sentence.
- Space: O(k), for splitting words.

