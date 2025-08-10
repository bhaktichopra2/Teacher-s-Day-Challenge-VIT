# Spiral Matrix 

## Problem Statement

Given an `m x n` matrix, return all elements of the matrix in **spiral order**.

Spiral order means starting at the top-left element and repeatedly moving:
1. From **left to right** across the top row.
2. Downwards along the right column.
3. From **right to left** across the bottom row (if unvisited).
4. Upwards along the left column (if unvisited).

Repeat this process until all elements are visited.

## Approach

1. **Define boundaries:**  
   - Use four variables to keep track of the current unvisited edges:  
     - `rowBegin` (top boundary),  
     - `rowEnd` (bottom boundary),  
     - `colBegin` (left boundary),  
     - `colEnd` (right boundary).

2. **Iteratively traverse the matrix layer by layer in spiral order:**  
   - While `rowBegin <= rowEnd` and `colBegin <= colEnd`, do:
     - Traverse left to right across the top row (`rowBegin`), then move the top boundary down (`rowBegin++`).
     - Traverse top to bottom along the rightmost column (`colEnd`), then move the right boundary left (`colEnd--`).
     - If there are remaining rows: Traverse right to left across the bottom row (`rowEnd`), then move the bottom boundary up (`rowEnd--`).
     - If there are remaining columns: Traverse bottom to top along the leftmost column (`colBegin`), then move the left boundary right (`colBegin++`)[2][3].

3. **Repeat the process for inner layers:**  
   After every full cycle, reduce the boundaries inwards to process the next layer.

4. **Continue until all elements are visited:**  
   Add each traversed element to the result list in order.

**Complexity:**  
- Time complexity: O(m * n) for an m x n matrix (every element is visited exactly once)[2].
- Space complexity: O(1) auxiliary space (excluding the result list).

---

This approach ensures all elements are visited in clockwise spiral order by continually shrinking the four boundaries after each traversal step[2][3].
