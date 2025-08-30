# Young Physicist

Java solution for checking if a set of vectors applied to a body result in equilibrium.

---

## Problem Statement

Given `n` vectors with integer coordinates applied to a body at the origin (0, 0, 0), determine whether the body remains in equilibrium.

A body is in equilibrium if the sum of all vectors' components on each axis (x, y, z) is zero. Otherwise, the body is moving.

---

## Input Format

- The first line contains the integer `n` — the number of vectors (1 ≤ n ≤ 100).
- Each of the following `n` lines contains three integers — the x, y, and z coordinates of a force vector (−100 ≤ xi, yi, zi ≤ 100).

---

## Output Format

- Print `"YES"` if the body is in equilibrium.
- Print `"NO"` if the body is not in equilibrium.

---

## Approach

- Accumulate the sum of x, y, and z coordinates for all vectors.
- If all the sums are zero, print `"YES"`.
- Otherwise, print `"NO"`.

**Complexity:**  
- Time: O(n)
- Space: O(1)

