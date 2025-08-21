# Chess Game Winner (Anton vs Danik) - Codeforces

A Java program to determine the winner in a series of chess games between Anton and Danik, using the result string provided in the input.

---

## Problem Statement

There are `n` games of chess played between two players: Anton and Danik.  
You are given a string `s` of length `n` consisting only of the characters `'A'` and `'D'`:
- `'A'` means Anton won that game.
- `'D'` means Danik won that game.

**Task:**  
Determine who won more games. If both won an equal number, print `"Friendship"`.

---

## Approach

- Initialize two counters: `antonWins` and `danikWins`.
- Iterate through the result string:
    - If the character is `'A'`, increment `antonWins`.
    - If the character is `'D'`, increment `danikWins`.
- After the loop, compare the counts:
    - If Anton has more wins, output `"Anton"`.
    - If Danik has more wins, output `"Danik"`.
    - If both have the same number, output `"Friendship"`.

**Time Complexity:**  
- O(n) – Single pass through the string.
