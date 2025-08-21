# Nearly Lucky Number

## Problem Statement

Petya loves lucky numbers. A lucky number is any positive integer that contains only the digits 4 and 7 (for example, 4, 47, or 744).
Petya also defines a number as nearly lucky if the count of lucky digits (4 and 7) in its decimal representation is itself a lucky number (4 or 7).
Given a number n, determine if it is a nearly lucky number.

## Approach

1. **Process the input as a string:**  
   Since the number may be very large (up to 10^18), read it as a string to avoid integer overflow.

2. **Count lucky digits:**  
   Initialize a counter and iterate through every character in the string.  
   Increment the counter whenever you encounter a digit `'4'` or `'7'`.

3. **Check nearly lucky criteria:**  
   If the total count of lucky digits is either `4` or `7`, print `"YES"` (it's a nearly lucky number).  
   Otherwise, print `"NO"`.

**Complexity:**  
- Time: O(k), where k is the number of digits in the input (up to 18).
- Space: O(1).

**Summary:**  
The solution simply counts the lucky digits and checks if the count itself is a lucky number (either 4 or 7). This is efficient and handles large inputs by operating on the string representation.
