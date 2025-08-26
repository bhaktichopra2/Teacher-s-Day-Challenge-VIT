# Park Lighting (Codeforces Problem)

Determine the minimum number of lanterns needed to light all squares in a rectangular park of size `n` rows and `m` columns.

---

## Problem Statement

Given a rectangular grid with `n` rows and `m` columns, each square must be lit. A lantern placed between squares lights two adjacent squares, or only one if placed on the border.

You need to find, for each test case, the minimum number of lanterns required.

---

## Approach

- Each lantern lights two squares (or one at the border).
- Total squares = n * m
- Minimum lanterns needed = (n * m + 1) // 2

**Complexity:**  
- Time: O(1) per test case
- Space: O(1)

