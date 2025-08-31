# Even Odds

Java program to find the number standing at position \( k \) in the sequence of the first \( n \) natural numbers reordered with all odds first, then evens.

---

## Problem Statement

Given a sequence of the first \( n \) natural numbers reordered such that all odd numbers appear first (in ascending order), followed by all even numbers (also in ascending order), determine the number at position \( k \).

---

## Input Format

- Two integers, \( n \) and \( k \), with \(1 \leq k \leq n \leq 10^{12}\).

---

## Output Format

- A single integer representing the number at position \( k \) in the reordered sequence.

---

## Approach

- Calculate the count of odd numbers up to \( n \) as \(\text{oddCount} = (n + 1) / 2\).
- If \( k \leq \text{oddCount} \), the number at position \( k \) is the \( k \)-th odd number: \(2k - 1\).
- Otherwise, it's the \((k - \text{oddCount})\)-th even number: \(2 \times (k - \text{oddCount})\).

---

## Complexity

- Time: \( O(1) \)
- Space: \( O(1) \)

