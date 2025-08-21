# Helpful Maths

## Problem Statement

You are given a string representing the sum of (1, 2, and 3) in any order, separated by plus signs (e.g., `"3+2+1"` or `"1+3+2"`). Your task is to rearrange the digits in **increasing order** and print the result in the same format (numbers separated by plus signs).

## Approach

- **Remove the plus signs** from the input string, keeping only the digits.
- **Convert** the digits to a char array.
- **Sort** the char array (since the only possible digits are 1, 2, and 3).
- **Build** the sorted string, inserting a plus sign between each number.
- **Print** the result.

All sorting and string manipulations use built-in Java methods for simplicity and efficiency.

**Time Complexity:** O(n log n), where n is the number of digits (though n is typically small).
