# 2894. Divisible and Non-divisible Sums Difference

## 📌 Problem Statement
You are given **positive integers** `n` and `m`.

We define two integers:
- **num1** = sum of all integers in the range `[1, n]` that are **NOT divisible** by `m`.
- **num2** = sum of all integers in the range `[1, n]` that **are divisible** by `m`.

You need to **return `num1 - num2`**.

---

## 🛠️ Approach
1. Initialize `num1 = 0` and `num2 = 0`.
2. Loop `i` from `1` to `n`:
   - If `i % m != 0`, add to **num1**.
   - Else, add to **num2**.
3. Return `num1 - num2`.

---

## ⏱️ Complexity
- **Time Complexity**: `O(n)` — one loop over the numbers from 1 to n.
- **Space Complexity**: `O(1)` — no extra memory apart from counters.

