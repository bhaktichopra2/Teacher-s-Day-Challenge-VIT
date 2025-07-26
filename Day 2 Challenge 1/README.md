## Problem Statement

Given an integer `n`, return a string array `answer` (1-indexed) where:

- `answer[i] == "FizzBuzz"` if `i` is divisible by both 3 and 5.
- `answer[i] == "Fizz"` if `i` is divisible by 3.
- `answer[i] == "Buzz"` if `i` is divisible by 5.
- `answer[i] == i` (as a string) if none of the above conditions are true.

**Example:**
Input: n = 15

Output: ["1", "2", "Fizz", "4", "Buzz", "Fizz", "7", "8", "Fizz", "Buzz", "11", "Fizz", "13", "14", "FizzBuzz"]

## Approach

1. **Initialize** an empty list of strings called `answer`.
2. **Iterate** from 1 to `n` (inclusive):
    - If the number is divisible by both 3 and 5, add "FizzBuzz" to `answer`.
    - Else if divisible by 3, add "Fizz".
    - Else if divisible by 5, add "Buzz".
    - Else, add the number as a string.
3. **Return** the `answer` list.

This approach checks each number's divisibility and appends the correct value to the answer list. Time complexity is **O(n)**.

