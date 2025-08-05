# Valid Parentheses

## Problem Statement

Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.

An input string is considered **valid** if:

- Open brackets are closed by the **same type** of brackets.
- Open brackets are closed in the **correct order**.
- Every close bracket has a corresponding open bracket of the **same type**.

---

## Examples

- Input: `"()"`  
  Output: `true`

- Input: `"()[]{}"`  
  Output: `true`

- Input: `"(]"`  
  Output: `false`

- Input: `"([)]"`  
  Output: `false`

- Input: `"{[]}"`  
  Output: `true`

---

## Approach

1. **Use a Stack:**  
   - Push every opening bracket onto the stack.
   - When a closing bracket is encountered, check whether it corresponds to the last opened bracket from the stack.

2. **Mapping Brackets:**  
   - Use a hashmap to map each closing bracket to its corresponding opening bracket.
   - When you pop from the stack, verify that the popped opening bracket matches the expected one from this map.

3. **Validation Logic:**  
   - If at any point a closing bracket does not match the opening bracket on top of the stack, return `false`.
   - After processing all characters, if the stack is empty, return `true`.
   - If not empty, return `false` (some brackets were not closed).

---

## Time Complexity

- **O(n)** where n is the length of the string `s`, since each character is processed once.


