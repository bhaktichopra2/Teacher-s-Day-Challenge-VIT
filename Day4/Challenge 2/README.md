# Roman to Integer

## Problem Statement

Given a Roman numeral as a string, convert it to an integer.

Roman numerals are represented by seven different symbols:

| Symbol | Value  |
|--------|---------|
| I      | 1       |
| V      | 5       |
| X      | 10      |
| L      | 50      |
| C      | 100     |
| D      | 500     |
| M      | 1000    |

Roman numerals are usually written largest to smallest from left to right. However, to represent certain numbers, smaller numerals are placed before larger ones to indicate subtraction. For example:

- `IV` is 4 (5 - 1)
- `IX` is 9 (10 - 1)
- `XL` is 40 (50 - 10)
- `XC` is 90 (100 - 10)
- `CD` is 400 (500 - 100)
- `CM` is 900 (1000 - 100)

## Approach

We convert the Roman numeral to an integer by iterating through the string from **right to left**:

1. Map each character to its integer value.
2. Start from the last character and initialize `total` with its value.
3. For every other character from right to left:
   - Compare its value with the value of the numeral immediately to its right.
   - If the current value is less than the next one, subtract it from `total`.
   - Otherwise, add it to `total`.
4. This correctly accounts for subtractive cases (like `IV`, `IX`, etc.).

## Example

For the input `"MCMXCIV"`:

- Start from right:  
  `V` (5) → total = 5  
  `I` (1) < `V` (5) → subtract 1 → total = 4  
  `C` (100) > `I` (1) → add 100 → total = 104  
  `X` (10) < `C` (100) → subtract 10 → total = 94  
  `M` (1000) > `X` (10) → add 1000 → total = 1094  
  `C` (100) < `M` (1000) → subtract 100 → total = 994  
  `M` (1000) > `C` (100) → add 1000 → total = 1994  

## Time Complexity

- The solution runs in **O(n)** time, where *n* is the length of the Roman numeral string.
- Each character is processed once.


