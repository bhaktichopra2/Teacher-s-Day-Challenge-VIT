# Ultra-Fast Mathematician

This Java program solves the "Shapur's Contest" problem. Given two binary numbers (strings of 0s and 1s) of equal length, the program computes their digit-wise binary difference.

---

## Problem Statement

Given two numbers of equal length made up of only the digits `0` and `1`, create a new binary string where:
- The i-th digit is `1` if the i-th digits of the input strings differ,
- Otherwise, it is `0`.

Do not omit any leading zeroes, and assume both numbers have the same length (up to 100 digits).

---

## Approach

- Read both binary strings as input.
- For each position in the strings:
  - Compare the digits. If they are equal, output `0`; otherwise, output `1`.
- Concatenate the results to form the answer.
- Print the final string.

**Complexity:**  
- Time: O(n), where n is the length of the binary strings.
- Space: O(n).
