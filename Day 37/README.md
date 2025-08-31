# Calculation Function

Java solution for finding the value of the alternating sum sequence defined as:

\( f(n) = -1 + 2 - 3 + 4 - 5 + \cdots + (-1)^n n \)

where the sign alternates for each consecutive integer up to a given positive integer \( n \).

---

## Problem Statement

Given a positive integer \( n \), compute the value of the function \( f(n) \) defined by the alternating sum sequence up to \( n \). For even indexes, add the number; for odd indexes, subtract the number.

---

## Input Format

- One positive integer \( n \) (\(1 \leq n \leq 10^{15}\))

---

## Output Format

- Print a single integer: the value of \( f(n) \).

---

## Approach

- If \( n \) is even, \( f(n) = n / 2 \)
- If \( n \) is odd, \( f(n) = - (n + 1) / 2 \)
- The solution works in constant time and space.
e:
