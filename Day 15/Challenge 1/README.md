# Smaller Numbers Than Current 

## Problem Statement

Given the array `nums`, for each `nums[i]` find out how many numbers in the array are **smaller** than it.  
That is, for each `nums[i]` you count the number of valid `j`'s such that `j != i` and `nums[j] < nums[i]`.

Return the answer as an array.

## Approach

1. **Copy and Sort** the original array into a new array `sorted`.
2. **Build a Map** (`count`) where the key is a number and the value is the **first index** it appears in `sorted`.  
   - The first index in sorted order represents **how many numbers are smaller** than that value.
3. **Fill the Result Array**:
   - For each element in the original array, look up `count.get(nums[i])` and place it in the result array.
4. **Return** the result.

### Why this works
Sorting the array arranges elements from smallest to largest. The index of an element in the sorted version equals the count of smaller numbers before it. Using a `putIfAbsent` ensures that we store the **first occurrence position** for duplicate values.

**Complexity:**
- Time: O(n log n) — dominated by sorting.
- Space: O(n) — for the sorted copy and map.
