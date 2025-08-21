# Bit++ Problem

## Problem Statement

In the Bit++ programming language, there is a single variable `x` initially set to **0**.  
There are two possible operations:

- `++x` or `x++` increases the value of `x` by 1.
- `--x` or `x--` decreases the value of `x` by 1.

You are given `n` statements (operations).  
Your task is to execute all of them **in the given order** and print the final value of `x`.

---

## Input

- The first line contains an integer `n` (`1 ≤ n ≤ 150`) — the number of operations.
- The next `n` lines each contain exactly one operation:  
  One of the strings `++x`, `x++`, `--x`, or `x--`.

---

## Output

- Output a single integer — the final value of `x` after executing all given statements.

---

**Explanation:**
- Initially, `x = 0`.
- Operation 1 (`X++`): `x = 1`.
- Operation 2 (`++X`): `x = 2`.
- Operation 3 (`--X`): `x = 1`.  
Final result = **1**.

---

## Approach

1. Initialize `x = 0`.
2. Read `n` — the number of operations.
3. For each operation string:
   - If the second character is `'+'`, increment `x` by 1.
   - If the second character is `'-'`, decrement `x` by 1.  
     (We can safely check `charAt(1)` since operation strings are always of length 3.)
4. Print the final value of `x`.

**Complexity:**
- **Time:** O(n) (single scan through operations)
- **Space:** O(1) (only one variable used for counting)

