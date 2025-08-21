# Twins

## 📌 Problem Description
You are given `n` coins, each with a certain value.  
Your goal is to determine the **minimum number of coins** you need to take so that the **sum of their values** is **strictly greater than half of the total value** of all coins.

This problem is known as the **Twins problem** (Codeforces 160A).

---

## 🛠️ Approach

1. **Read Input**:
   - An integer `n` representing the number of coins.
   - Then `n` integers representing each coin's value.

2. **Calculate Total Sum**:
   - Compute the sum of all coin values.

3. **Sort Coins Descending**:
   - Sort values in **decreasing order** so that we can pick the highest value coins first.

4. **Greedy Selection**:
   - Initialize `sum = 0` and `count = 0`.
   - Iterate over the sorted coins:
     - Add the current coin's value to `sum`, increment `count`.
     - Stop once `sum > total / 2`.

5. **Output**:
   - Print `count`, the minimum coins required.

