# A. I Wanna Be the Guy (Codeforces)

Java solution for the Codeforces problem **"I Wanna Be the Guy"**, where two friends try to cooperatively beat all levels of a video game.

---

## Problem Statement

There is a game consisting of `n` levels, numbered from 1 to `n`.
- Each of two players, Little X and Little Y, can beat only some of the levels.
- Little X can pass `p` distinct levels, and Little Y can pass `q` distinct levels.

---

## Approach

- Use a **HashSet** to track all unique levels either friend can pass.
- Add levels from both friends to the set.
- If the set covers all levels from 1 to n (`set.size() == n`), then print success.
- Otherwise, print failure.

**Complexity:**  
- Time: O(p + q)
- Space: O(n)
