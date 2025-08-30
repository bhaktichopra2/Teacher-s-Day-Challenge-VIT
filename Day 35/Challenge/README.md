# I_love_%username%

Java solution for counting amazing performances in competitive programming contests.

---

## Problem Statement

Given the scores of a coder over multiple contests in chronological order, count how many times the coder breaks their record for the highest or lowest score (ignoring the first contest):

- A performance is *amazing* if the score is strictly greater than every previous score (a new best), or strictly less than every previous score (a new worst).

---

## Input Format

- The first line contains an integer `n` (1 ≤ n ≤ 1000), the number of contests.
- The second line contains `n` space-separated non-negative integers representing the scores earned in each contest, given in chronological order. Each score does not exceed 10,000.

---

## Output Format

- Print a single integer — the number of amazing performances.

---

## Approach

- Track the current best and worst scores as contests progress.
- For each contest after the first:
    - If the score is strictly greater than the current best, increment the amazing count and update the best.
    - If the score is strictly less than the current worst, increment the amazing count and update the worst.
- Print the total count of amazing performances.

**Complexity:**  
- Time: O(n)  
- Space: O(1)  

