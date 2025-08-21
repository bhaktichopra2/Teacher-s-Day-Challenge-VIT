# Stones on the Table

## Problem Statement

There are `n` stones on the table in a row. Each stone is either **red (R)**, **green (G)**, or **blue (B)**.  
Your task is to determine the **minimum number of stones to remove** so that no two neighboring stones are of the same color.

Two stones are considered neighbors if there are no other stones between them.

### Input
- The first line contains an integer `n` (`1 ≤ n ≤ 50`) — the number of stones.
- The second line contains a string `s` of length `n` consisting of characters:
  - `R` — red stone
  - `G` — green stone
  - `B` — blue stone

### Output
- Print a single integer — the **minimum number of stones** to remove so that no two neighboring stones have the same color.

## Approach

1. **Initialize a removal counter** to 0.
2. **Iterate** from the first stone to the second-last stone:
   - Compare the current stone with the next one.
   - If the two stones have the same color, increment the removal counter.
3. **Output** the removal counter, which is the minimum stones to remove.

**Time Complexity:** O(n) — Single pass through the string.  
**Space Complexity:** O(1) — Constant extra space.
