# Best Time to Buy and Sell Stock - Solution

This Java program solves the classic "Best Time to Buy and Sell Stock" problem:

## Problem Description

Given an array `prices` where `prices[i]` is the price of a given stock on day `i`, find the maximum profit you can achieve. You may complete only one transaction (i.e., buy one and sell one share of the stock). If no profit is possible, return 0.

## Approach

- Iterate through the `prices` array.
- Keep track of the minimum price encountered so far.
- Calculate the profit for each day (`prices[i] - minPrice`).
- Update the maximum profit accordingly.

This solution uses a single pass with time complexity O(n).


