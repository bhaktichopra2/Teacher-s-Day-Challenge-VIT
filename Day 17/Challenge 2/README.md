# Word 

## Problem Statement

You are given a single word consisting of uppercase and lowercase Latin letters.  
Your task is to **convert all letters** in the word to either lower or upper case based on the following rule:

- If the number of lowercase letters is **greater than or equal** to the number of uppercase letters, convert the entire word to lowercase.
- Otherwise, convert the entire word to uppercase.

---

## Input

- A single word `s` (`1 ≤ |s| ≤ 100`), consisting of uppercase and lowercase English letters.

---

## Output

- Print the word in either:
  - all lowercase letters (if lowercase count ≥ uppercase count), or
  - all uppercase letters (if uppercase count > lowercase count).

---

## Approach

1. **Read the Input Word.**
2. Initialize two counters:  
   - `l` for lowercase letters,  
   - `u` for uppercase letters.
3. Loop through each character:
   - If the character is lowercase (`Character.isLowerCase(ch)`), increment `l`.
   - Otherwise, increment `u`.
4. Compare counts:
   - If `l >= u`, output the word in lowercase (`s.toLowerCase()`).
   - Else, output the word in uppercase (`s.toUpperCase()`).

**Time Complexity:** O(n) — where n is the length of the word.  
**Space Complexity:** O(1) — aside from the input string.
