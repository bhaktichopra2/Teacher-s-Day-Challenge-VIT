# Type of Triangle

Java implementation for detecting the type of triangle (equilateral, isosceles, scalene, or none) formed by three given side lengths.

---

## Problem Statement

Given an integer array `nums` of size 3, representing the lengths of the sides of a triangle, determine the type of triangle that can be formed:
- "equilateral" if all sides are equal
- "isosceles" if exactly two sides are equal
- "scalene" if all sides are different
- "none" if the sides cannot form a triangle

---

## Input Format

- An integer array `nums` of length 3.

---

## Output Format

- Return a string: one of `"equilateral"`, `"isosceles"`, `"scalene"`, or `"none"`.

---

## Approach

- Check the triangle inequality: If any side is greater than or equal to the sum of the other two, return `"none"`.
- If all sides are equal, return `"equilateral"`.
- If exactly two sides are equal, return `"isosceles"`.
- If all three sides are different, return `"scalene"`.

**Complexity:**  
- Time: O(1)  
- Space: O(1)

