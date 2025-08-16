## Problem Statement

A soldier wants to buy `w` bananas from a shop.  
- The price of the first banana is `k` dollars.
- The second banana costs `2 * k` dollars.
- The third banana costs `3 * k` dollars.
- ... and so on, with the i-th banana costing `i * k` dollars.

The soldier has `n` dollars.  
What is the minimum number of dollars the soldier needs to borrow from his friend in order to buy all `w` bananas?  
If the soldier already has enough money, print `0`.

**Input Format:**
- Three integers separated by spaces:  
  1. `k` (cost of one banana)
  2. `n` (money the soldier has)
  3. `w` (number of bananas to buy)

**Output Format:**
- One integer: the number of dollars to borrow (or `0` if not needed)

---

## Approach

1. **Calculate Total Cost:**  
   - The bananas cost in increasing order:  
     - 1st banana: `k`
     - 2nd banana: `2k`
     - 3rd banana: `3k`
     - ... up to `w * k`.


2. **Determine Borrow Amount:**  
   - Subtract the money the soldier already has (`n`) from the total cost.
   - If the result is less than or equal to zero, print `0`.
   - Otherwise, print the result.
  

3. **Complexity:**  
   - Runs in O(1) time (only uses simple math operations).
