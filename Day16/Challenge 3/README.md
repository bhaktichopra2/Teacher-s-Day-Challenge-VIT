# Problem: George and Accommodation

## Problem Statement

You are given a list of `n` rooms. For each room, you know the number of people currently living in it (`a`) and the total capacity of the room (`b`).

Your task is to count how many rooms have at least **two free spaces** (i.e., `b - a >= 2`). Output the total count of such rooms.

### Input

- The first line contains one integer `n` (`1 ≤ n ≤ 100`), the number of rooms.
- Each of the next `n` lines contains two integers:
    - `a` — the number of people currently in the room (`0 ≤ a < b ≤ 100`),
    - `b` — the total capacity of the room.

### Output

- Print a single integer: the number of rooms that have at least two free spaces.

---

**Explanation**

- Room 1: `10 - 1 = 9 ≥ 2` (possible)
- Room 2: `5 - 0 = 5 ≥ 2` (possible)
- Room 3: `3 - 2 = 1 < 2` (not possible)

Answer: There are 2 rooms with at least two free spaces.

---

## Approach

1. **Initialize counter:**  
   Start with `c = 0` to count rooms with sufficient free space.

2. **Process input:**  
   For each room, read `a` and `b`.

3. **Check free space:**  
   If `b - a >= 2`, increment the counter.

4. **Output:**  
   Print the counter after processing all rooms.

**Complexity:**  
- Time: O(n) — a single pass through the input data.
- Space: O(1) — only basic variables used.

