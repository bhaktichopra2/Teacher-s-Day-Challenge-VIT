# Xenia and ringroad

This project implements a Java solution for a problem where a worker must complete a series of tasks located at different positions around a circular track.

---

## Problem Description

There are `n` houses arranged in a circle, numbered `1` to `n`. A worker starts at house `1` and has to complete `m` tasks in order.  
Each task is at a specific house `dest`. The worker can only move **forward** along the circle (from house `i` to `i+1`, wrapping back to `1` after `n`).  

For each task, the worker goes from their current position to the destination house.  
The goal is to calculate the **total time (or distance)** taken to complete all tasks, assuming moving from one house to the next takes **1 unit of time**.

---

## Approach

1. Keep track of the **current position** (starts at `1`).
2. For each task at `dest`:
   - If `dest >= current`, add `(dest - current)` to time.
   - Otherwise, add `(n - current) + dest` (wrap around the circle).
3. Update `current = dest`.
4. Print the total accumulated time.

