# B. Petya and Countryside 

Java solution for the Codeforces problem **"Petya and Countryside"**, where you find the section of a 1×n garden that, when watered, will result in the largest possible area being irrigated.

---

## Problem Statement

Petya’s grandmother has a 1×n garden divided into n square sections, each with a distinct height. Artificial rain can only be created above **one** section (due to cost). Water flows from this section to its neighbors if their height does not exceed the current section's height, continuing left/right until blocked by a taller section.

**Goal:**  
Find the section where watering yields the **maximum number of watered sections**.


## Approach

1. For every section `i`, simulate rain starting there.
2. Water always flows to the starting section.
3. Move **left**:
   - While next section is equal or lower in height, increment the count.
   - Stop if a taller section is encountered.
4. Move **right**:
   - Similarly, count sections until blocked.
5. Track and print the highest watered-section count over all possible starting points.

**Complexity:**  
- Time: O(n²) (since for each section we check left and right).
- Space: O(n) (for storing section heights).
