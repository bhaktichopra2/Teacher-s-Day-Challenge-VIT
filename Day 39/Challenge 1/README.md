# Number of Changing Keys

Java implementation for counting key changes in a string, treating case-insensitive letters as the same key.

---

## Problem Statement

Given a string `s` typed by a user, count the number of times the user had to change the key, where changing a key means typing a different letter than the last key typed. Case does not matter ('a' and 'A' are considered the same key).

---

## Input Format

- A string `s` containing uppercase and/or lowercase letters.

---

## Output Format

- Print a single integer: the number of key changes needed for the input string.

---

## Approach

- Convert the string to lowercase to ensure case insensitivity.
- Loop through the string, comparing each character to the next.
- Increment a counter each time the letter changes.
- Return the count.

**Complexity:**  
- Time: O(n)  
- Space: O(1)  

