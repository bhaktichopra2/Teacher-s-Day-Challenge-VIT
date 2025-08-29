# Difference Between Element Sum and Digit Sum of an Array

Java implementation to find the absolute difference between the sum of array elements and the sum of all digits in those elements.

---

## Problem Statement

Given an array of positive integers `nums`, calculate:
- **Element sum:** The sum of all elements in `nums`.
- **Digit sum:** The sum of all digits (not necessarily distinct) in each element of `nums`.

Return the **absolute difference** between element sum and digit sum.

**Definition:**  
The absolute difference between two integers `x` and `y` is `|x - y|`.

---

## Example

**Input:**  
`nums = [1, 15, 6, 3]`

**Output:**  
`9`

**Explanation:**  
- Element sum: `1 + 15 + 6 + 3 = 25`
- Digit sum: `1 + 1 + 5 + 6 + 3 = 16`
- Absolute difference: `|25 - 16| = 9`

---

## Approach

- Loop through the array to sum all elements.
- For each element, repeatedly extract the last digit and add it to the digit sum.
- Finally, return the absolute difference between element sum and digit sum.

**Complexity:**  
- Time: O(n * k), where n is the number of elements in `nums`, and k is the average number of digits per number.
- Space: O(1)

