# GukiZ and Contest

Java solution for ranking students by their contest scores as described in the "GukiZ and Contest" problem.

---

## Problem Statement

Given the ratings of `n` students, determine each student's contest rank. The highest rating receives position 1, and students with the same score share the same position. Positions increase continuously, skipping ties accordingly.

---

## Input Format

- The first line contains the integer `n` — the number of students.
- The second line contains `n` integers — each student's rating.

---

## Output Format

- A single line with `n` integers: the contest positions for each student, in the same order as input.

---

## Approach

- Count the frequency of each rating using an array (from 1 to 2000).
- Calculate the contest rank for each rating by looping from the highest rating (2000) down to 1, assigning the next available rank and incrementing by the frequency.
- Output, for each student, the rank for their rating in order of input.

**Complexity:**  
- Time: O(N + M) where N is student count and M is the max possible rating (2000)  
- Space: O(M), for frequency and rank arrays

