# Count the Digits That Divide a Number (LeetCode 2520)

This repository contains a Java solution to the "Count the Digits That Divide a Number" problem from LeetCode.

---

## Problem Statement

Given an integer `num`, return the number of digits in `num` that divide `num`.

A digit `d` divides `num` if `num % d == 0`.

---

## Approach

- Convert the integer to a String to access its digits.
- Iterate through each character (digit).
- Convert each character to an integer.
- For each digit (excluding zero), check if the original number is divisible by the digit (using `%`).
- Count the digits that satisfy this condition.
- Return the count.


