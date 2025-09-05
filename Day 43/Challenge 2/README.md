# Subtract the Product and Sum of Digits of an Integer

Java implementation for [Leetcode 1281](https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/).

---

## Problem Statement

Given an integer `n`, return the difference between the product of its digits and the sum of its digits.

---

## Input Format

- An integer `n`

---

## Output Format

- One integer: the result of `product of digits of n - sum of digits of n`.

---

## Approach

- Initialize `product` to 1 and `sum` to 0.
- Extract each digit of `n` using modulo and division.
- Multiply each digit into `product` and add it to `sum`.
- Return `product - sum`.

**Complexity:**  
- Time: O(d), where d is the number of digits in n  
- Space: O(1)

