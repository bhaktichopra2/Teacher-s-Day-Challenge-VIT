# Find All Numbers Disappeared in an Array 

## Problem Statement

Given an array `nums` of length `n` where `nums[i]` is in the range `[1, n]`, some numbers may appear twice and others appear once.  
Return **all the numbers in the range** `[1, n]` that do **not** appear in `nums`.

## Approach

- **Mark Presence In-Place:**  
  Iterate over the input array. For each value `nums[i]`, use its absolute value minus one as an index (`index = Math.abs(nums[i]) - 1`). Negate the number at this index to indicate that the value `index + 1` has appeared in the array.

- **Identify Missing Numbers:**  
  After the first pass, iterate through the array a second time. If `nums[i]` is still positive, it means the value `i + 1` was never seen in the original array (its position was never negated).

- **Collect Results:**  
  Add all such values (`i + 1` where `nums[i] > 0`) to the result list and return it.

