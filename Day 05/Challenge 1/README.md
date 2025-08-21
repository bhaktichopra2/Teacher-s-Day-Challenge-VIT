# Top K Frequent Elements

## Problem Statement

Given an integer array `nums` and an integer `k`, write a function to return the **k most frequent elements** from the array. The answer can be returned in **any order**.


## Approach

To find the **k most frequent elements**, we perform the following steps:

1. **Count the frequencies:**
   - Traverse the input array `nums` and use a **HashMap** to map each unique number to its frequency.

2. **Use a Min-Heap (Priority Queue):**
   - Use a priority queue (min-heap) to keep track of the top k frequent elements.
   - The queue stores map entries `(number, frequency)` with the smallest frequency at the top.
   - For each entry in the frequency map:
     - Add it to the min-heap.
     - If the size of the min-heap exceeds `k`, remove the smallest frequency element.
   - This ensures the heap only contains the `k` most frequent numbers.

3. **Build the result:**
   - Extract all elements from the min-heap (which now contains the `k` most frequent numbers).
   - Store their keys (the numbers) in an output array and return it.

---

## Time Complexity

- Counting frequencies: **O(n)**, where n is the length of `nums`.
- Adding all unique numbers to the heap: **O(m log k)**, where m is the number of unique elements.
- Extracting k elements from the heap: **O(k log k)**, which is usually less than or equal to the above.


