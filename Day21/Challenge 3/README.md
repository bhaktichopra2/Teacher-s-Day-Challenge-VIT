# Queue in the school

## 📌 Problem Statement
During the break at school, boys (`B`) and girls (`G`) are standing in a queue. 
Initially, they line up in the order they arrive.  

However, every second, **any boy (`B`) standing directly in front of a girl (`G`) will let her move ahead**, meaning they swap positions.

Formally:
- The queue positions are numbered `1` to `n` (with `1` being served first).
- If at a given second a boy is at position `i` and a girl is at position `i+1`, in the **next second** they swap places.
- Multiple swaps can happen in parallel in each second.

Given:
- The initial arrangement of children.
- A number of seconds `t`.

You need to determine the final arrangement after `t` seconds.

---

## 🛠️ Input Format
- **First line:** Two integers `n` and `t`  
  - `n` = number of children in the queue (`1 ≤ n ≤ 50`)
  - `t` = number of seconds to simulate (`1 ≤ t ≤ 50`)

- **Second line:** String `s` of length `n`
  - Each character is either:
    - `B` for boy
    - `G` for girl

---

## 📤 Output Format
- A string representing the queue arrangement after `t` seconds.

---

### Explanation
Initial: `B G G B G`  
After 1 second:
- Swap at positions 1–2 (`B` and `G` → `G` and `B`)
- Swap at positions 4–5 (`B` and `G` → `G` and `B`)  
Result: `G B G G B`

---

## 🧮 Approach

1. Store the queue as a **character array** for easy swapping.
2. For each second (loop `t` times):
   - Traverse the queue from **left to right**.
   - If the current position is `B` and the next is `G`:
     - Swap them.
     - Skip the next index (`i += 2`) because the positions just swapped should not swap again in the same second.
   - Otherwise, move to the next position (`i++`).
3. After all time steps, convert the array back to a string and print the result.

---

## ⏱️ Time Complexity
- **O(t × n)** — In the worst case, every position is checked for every second.
- Constraints are small (`n, t ≤ 50`), so this is efficient enough.

