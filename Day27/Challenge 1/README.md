# Bear and Big Brother (Codeforces)

Java solution for the Codeforces problem **"Bear and Big Brother"**, where you determine how many years it will take Bear Limak to surpass his brother Bob in weight.

---

## Problem Statement

Limak the bear wants to become strictly heavier than his brother Bob.

- Limak's current weight: **a**
- Bob's current weight: **b** (where `a ≤ b`)
- Each year:
    - Limak's weight is **tripled** (`a = a * 3`)
    - Bob's weight is **doubled** (`b = b * 2`)

**Question:**  
After how many full years will Limak become strictly heavier than Bob (`a > b`)?

---

## Approach

- Simulate each year:
    - Multiply Limak's weight by 3
    - Multiply Bob's weight by 2
    - Increment the year count
- Loop continues until Limak is strictly heavier than Bob.
- Print the number of years taken.

**Time Complexity:**  
- O(1) in practice (since initial weights are small and values grow fast).

