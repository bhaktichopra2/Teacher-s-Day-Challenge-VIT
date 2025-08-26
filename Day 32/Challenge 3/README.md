# Panoramix's Prediction (Codeforces Problem)

This Java program determines if a given pair of numbers `(n, m)` represents two consecutive prime numbers, with `n` being the smaller prime.

---

## Problem Statement

You are given two positive integers `n` and `m`, where `n` is guaranteed to be prime and `m > n`.

- Print `"YES"` if `m` is the next prime bigger than `n`.
- Print `"NO"` otherwise.

---

## Approach

- Store all prime numbers up to 50 in an array.
- Find the index of `n` in the array.
- Check if the next element is `m`.

**Complexity:**  
- Time: O(size of prime array)
- Space: O(size of prime array)
