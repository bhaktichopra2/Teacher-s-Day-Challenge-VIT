# Presents

## 📌 Problem Description

Little Petya loves gifts. For the New Year, he received a new laptop from his mother, but as he enjoys gifting others more, he decided to give it away next year.  
This year, he hosted a New Year party and invited **n** friends. Petya himself did not exchange gifts but watched his friends giving gifts to each other.

- Petya numbered his friends from `1` to `n`.
- Petya knows that **friend `i` gave a gift to friend `p[i]`**.
- Each friend received **exactly one gift** (no more, no less).
- Some friends might even give gifts to themselves.

**Task:**  
For each friend **i**, determine **the number of the friend who gave them a gift**.

---

## 🔹 Input Format

1. First line: integer `n` — number of friends.  
   - Constraint: `1 ≤ n ≤ 100`

2. Second line: `n` space-separated integers,  
   where the `i`-th number is `p[i]` — the ID of the friend who received a gift from friend `i`.

---

## 🔹 Output Format

- Print `n` space-separated integers,  
  where the `i`-th number is the ID of the friend who gave **a gift to friend `i`**.

---

---

## ⚙️ Approach

1. Create an array `givers[]` of size `n`.
2. For each friend number `giver` (from 1 to n):
   - Read the `receiver`.
   - Assign `givers[receiver - 1] = giver`.
3. Output the contents of `givers[]`.

This way, we reverse the mapping from **giver → receiver** to **receiver → giver**.

---

## ⏱️ Complexity Analysis

- **Time Complexity:** O(n) — single loop to reverse the mapping.
- **Space Complexity:** O(n) — for storing the `givers` array.

