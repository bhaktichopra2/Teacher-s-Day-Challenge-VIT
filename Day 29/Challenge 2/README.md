# Magnets

This Java program calculates the number of groups formed by arranging a sequence of magnets on a table following specific attraction/repulsion rules. This is based on the Codeforces problem "Magnets."

---

## Problem Statement

Mike arranges `n` magnets in a row. Each magnet is either oriented as `"01"` (plus-minus) or `"10"` (minus-plus). When placing magnets:

- If the current magnet has the **same orientation** as the previous one, it is attracted and forms part of the current group.
- If the current magnet has a **different orientation** from the previous magnet, it is repelled and starts a new group.

A group is any sequence of consecutive magnets with the same orientation.


## Approach

- Read the number of magnets, `n`.
- Initialize counters for the previous magnet's orientation and total group count.
- Loop through each magnet:
  - For the first magnet, start a new group.
  - For each subsequent magnet, compare its orientation with the previous one:
    - If it’s **different**, increment the group counter.
    - If it’s **same**, do not increment (part of the same group).
- Output `count + 1` to account for the initial group.

**Complexity:**  
- Time: O(n) — single pass through all magnets.
- Space: O(1).

