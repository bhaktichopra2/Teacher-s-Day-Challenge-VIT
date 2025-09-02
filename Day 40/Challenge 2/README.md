# Kefa and First Steps

Java solution for finding the length of the longest non-decreasing subsegment in a sequence.

---

## Problem Statement

Given a sequence of daily earnings over `n` days, determine the length of the longest continuous subsegment of days where the earnings do not decrease (each day's earnings is greater than or equal to the previous day's).

---

## Input Format

- The first line contains an integer `n` (number of days, 1 ≤ n ≤ 100000).
- The second line contains `n` space-separated integers, representing earnings on each day (1 ≤ earnings ≤ 10^9).

---

## Output Format

- Print a single integer, the length of the longest non-decreasing subsegment.

---

## Approach

- Store earnings in a list.
- Traverse the list, counting the length of current non-decreasing sequence.
- If a decrease is found, reset the counter.
- Update the maximum length encountered.

**Complexity:**  
- Time: O(n)  
- Space: O(n)  

ile:
