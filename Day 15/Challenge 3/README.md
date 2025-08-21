# Beautiful Matrix

## Problem Statement
You are given a 5 × 5 matrix containing exactly one 1 (the rest are zeroes).
You can make the matrix more "beautiful" by moving the 1 to the center cell (intersection of the 3rd row and 3rd column).

    You are allowed to perform two kinds of moves any number of times:

    Swap two neighboring rows.

    Swap two neighboring columns.

**Your task: Find the minimum number of moves needed to bring the 1 to the center cell.**

## Approach

1. **Locate the Position of 1:**  
   Iterate through the 5×5 matrix to find the coordinates (row and column) of the single cell containing `1`.

2. **Calculate Distance to Center:**  
   The center cell is at position (2, 2) (using zero-based indexing).  
   The minimum number of moves to bring `1` to the center is calculated as:
    moves = abs(current_row - 2) + abs(current_col - 2)
- Each move can shift the `1` one step vertically (by swapping rows) or horizontally (by swapping columns).

3. **Return the Result:**  
Output the value of `moves`, which gives the minimum number of swaps required.

**Complexity:**  
- Time: O(1), the matrix is always 5×5.
- Space: O(1).

