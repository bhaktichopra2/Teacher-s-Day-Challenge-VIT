# Domino Piling

This project contains a solution for the "Domino Piling" problem, a classic mathematical puzzle often found on competitive programming sites.

---

## Problem Statement

You are given a rectangular board with dimensions **M x N** squares. You also have an unlimited supply of standard **2 x 1** domino pieces.

The goal is to place as many dominoes as possible onto the board, following these rules:
1.  Each domino must completely cover two squares.
2.  No two dominoes can overlap.
3.  Each domino must lie entirely within the board.

Find the maximum number of dominoes that can be placed on the board.

### Input

* A single line containing two integers, **M** and **N** (1 ≤ M ≤ N ≤ 16), representing the dimensions of the board.

### Output

* Print a single integer representing the maximum number of dominoes that can be placed.

---

## Approach

The solution to this problem is a simple mathematical calculation.

1.  **Calculate Total Area:** The total number of squares on the board is **M * N**.
2.  **Domino Coverage:** Each domino piece covers exactly **2** squares.
3.  **Find Maximum Dominoes:** To find the maximum number of dominoes that can fit, we can divide the total area of the board by the area of a single domino.

Since we can't place half a domino, we use integer division to automatically handle cases where the total area is an odd number.

The formula is simply:
**`max_dominoes = (M * N) / 2`**