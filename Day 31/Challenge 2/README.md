# Soft Drinking (Codeforces Problem)

Calculate the maximum number of toasts each of `n` friends can make, given quantities of drink, limes, and salt, and per-toast requirements.

---

## Problem Statement

A group of friends has:
- `k` bottles of a drink, each with `l` milliliters.
- `c` limes, cut into `d` slices each.
- `p` grams of salt.

Each friend needs for one toast:
- `nl` milliliters of drink,
- one lime slice,
- `np` grams of salt.

Find out how many toasts *each friend* can make, so everyone gets the same number.

---

## Approach

1. Calculate total drink in milliliters: `k * l`
2. Calculate total lime slices: `c * d`
3. Calculate possible toasts by drink: `(k * l) // (n * nl)`
4. Calculate possible toasts by lime: `(c * d) // n`
5. Calculate possible toasts by salt: `p // (n * np)`
6. The answer is the minimum among these three.

**Complexity:**  
- Time: O(1)
- Space: O(1)

