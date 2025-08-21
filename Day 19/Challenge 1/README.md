# Best Time to Buy and Sell Stock

## 📌 Problem Statement
Given an array `prices` where `prices[i]` is the price of a stock on the i-th day, find the maximum profit you can achieve by choosing a single day to buy and a different day to sell.

You can only complete **one transaction** (buy one and sell one share of the stock).

---

## 🛠️ Approach
We use a **two-pointer** technique:
- `l` (left) = Buy day
- `r` (right) = Sell day

Steps:
1. Start with `l = 0` and `r = 1`.
2. If `prices[l] < prices[r]`, calculate profit and update max profit if necessary.
3. If `prices[l] >= prices[r]`, move `l` to `r` (new potential buy day).
4. Repeat until the end of array.

This ensures **O(n)** time complexity and **O(1)** extra space.

