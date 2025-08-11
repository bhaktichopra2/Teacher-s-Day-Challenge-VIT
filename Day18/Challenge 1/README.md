# Number of Islands

This project contains a Python solution for LeetCode problem 200: "Number of Islands". The solution uses a Depth-First Search (DFS) algorithm to efficiently count the distinct landmasses in a 2D grid.

---
## Problem Statement

You are given an `m x n` 2D binary grid which represents a map of `'1'`s (land) and `'0'`s (water). The goal is to return the total number of islands.

An **island** is defined as a group of connected `'1'`s (horizontally or vertically) that is surrounded by water. You can assume all four edges of the grid are surrounded by water.

---

## Approach: Depth-First Search (DFS)

The most effective way to solve this problem is to treat the grid as a graph and traverse it. The chosen approach uses a Depth-First Search (DFS) to explore and "sink" each island it finds, ensuring that each island is counted only once.

The algorithm consists of two main parts:

1.  **Main Loop (The Scanner):**
    * The primary function iterates through every cell of the grid from top-left to bottom-right.
    * If a cell contains a `'1'`, it signifies that we have found a new, undiscovered island.
    * When a new island is found, the island `count` is incremented.
    * Crucially, a DFS traversal is immediately started from that cell to find and neutralize all parts of that island.

2.  **DFS Helper Function (The Explorer/Sinker):**
    * This recursive function is the core of the exploration. When called on a land cell `(i, j)`, it does the following:
        * **Base Case:** It first checks if the current coordinates are out of bounds or if the cell contains water (`'0'`) or has already been visited (`'#'`). If any of these are true, the recursion for that path stops.
        * **Mark as Visited:** It "sinks" the current land cell by changing its value from `'1'` to a different character (like `'#'` or `'0'`). This is the key step that prevents recounting the same land cell.
        * **Explore Neighbors:** It then recursively calls itself for all four adjacent neighbors (up, down, left, and right), effectively spreading out to find and sink the entire connected landmass.

By the time the initial DFS call finishes, the entire island has been "sunk" and will be ignored by the main loop, guaranteeing an accurate count.

---
### Complexity Analysis

* **Time Complexity:** **O(M \* N)**, where M is the number of rows and N is the number of columns. Each cell in the grid is visited exactly once.
* **Space Complexity:** **O(M \* N)** in the worst case. This is the space used by the recursion stack. In the worst-case scenario (a grid full of land), the DFS could go M\*N levels deep.