# Teachers Day Challenge - LeetCode 1295: Find Numbers with Even Number of Digits

## Problem Statement

Given an array of integers `nums`, return how many of them contain an **even number** of digits.

## Examples

- Input: `nums = [12, 345, 2, 6, 7896]`  
  Output: `2`  
  Explanation:  
  - 12 has 2 digits (even)  
  - 345 has 3 digits (odd)  
  - 2 has 1 digit (odd)  
  - 6 has 1 digit (odd)  
  - 7896 has 4 digits (even)  
  Only 12 and 7896 contain an even number of digits.

- Input: `nums = [555, 901, 482, 1771]`  
  Output: `1`  
  Explanation: Only 1771 has an even number of digits.

## Approach

To solve this problem, we iterate through each number in the array and check the number of digits by converting the number to a string. If the length of this string is even, we increment our count.

### Steps:
1. Initialize a counter to zero.
2. Loop over each number in the array.
3. Convert the number to a string.
4. Check if the length of the string is even.
5. Increment the counter if it is.
6. Return the counter at the end.

This approach runs in **O(n)** time, where n is the length of the array.
