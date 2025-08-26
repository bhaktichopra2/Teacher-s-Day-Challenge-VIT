# Number of Employees Who Met the Target (LeetCode Problem)

Java solution to count the number of employees who have worked at least a certain number of hours.

---

## Problem Statement

Given an array `hours` representing the number of hours each employee has worked, and an integer `target`, return the count of employees whose hours are **greater than or equal to** `target`.

---

## Approach

- Iterate through the `hours` array.
- For each employee, if their worked hours are at least `target`, increment a counter.
- Return the counter after traversing the array.

**Complexity:**  
- Time: O(n), where n is the number of employees.
- Space: O(1).
