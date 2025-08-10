# Minimum Time Visiting All Points (LeetCode 1266)

## Problem Statement

Given an array of points on a 2D plane, where each point has integer coordinates `points[i] = [xi, yi]`, return the **minimum time in seconds** to visit all the points in the order specified.

You can move according to the following rules in each one second:
- Move **vertically** by one unit,
- Move **horizontally** by one unit,
- Move **diagonally** by one unit (i.e., move one unit vertically and one unit horizontally simultaneously).

You must visit the points in the order given, and you are allowed to pass through other points as you move, but only visits count.

**Explanation:**  
- Time to move from `[1,1]` to `[3,4]` is `max(|3-1|, |4-1|) = max(2,3) = 3`.
- Time to move from `[3,4]` to `[-1,0]` is `max(|-1-3|, |0-4|) = max(4,4) = 4`.
- Total time = 3 + 4 = **7**.

---

## Approach

1. **For each consecutive pair** of points, compute the difference in x and y coordinates:
   - `dx = abs(points[i+1][0] - points[i][0])`
   - `dy = abs(points[i+1][1] - points[i][1])`
2. **Diagonal moves** allow you to reduce both dx and dy by 1 per second. So, the required time to move between two points is the **maximum** of dx and dy.
3. **Sum up** the times for all pairs to get the total minimum time.

- **Time Complexity:** O(n) (single pass over input)
- **Space Complexity:** O(1)



