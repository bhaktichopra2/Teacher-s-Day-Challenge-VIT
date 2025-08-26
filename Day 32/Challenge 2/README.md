# Lucky Division (Codeforces Problem)

This Java program checks if a number is "almost lucky", i.e., divisible by any "lucky number"—numbers composed solely of digits 4 and 7.

---

## Problem Statement

A lucky number: Has only digits 4 and 7.

A number is "almost lucky" if it is divisible by *any* lucky number.

- Print `"YES"` if so, `"NO"` otherwise.

---

## Approach

- Store all lucky numbers up to 1000 in an array.
- Loop and check if `n` is divisible by any lucky number.

**Complexity:**  
- Time: O(size of lucky number array)
- Space: O(size of lucky number array)

