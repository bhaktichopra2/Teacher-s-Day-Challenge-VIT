# Merge Intervals Solution (Java)

## Problem Statement

Given an array of intervals where `intervals[i] = [start_i, end_i]`, merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.

## Approach
1. Sort the intervals based on their start times.
2. Start with the first interval and add it to a result list.
3. For each following interval:

    a. If it overlaps with the last interval in the result (i.e., the current interval's start ≤ last end), merge them by updating the end time of the last interval to be max(last end, current end).
    
    b. Else, add the current interval to the result list as a new group.
4. Convert the result list to a 2D array and return it.