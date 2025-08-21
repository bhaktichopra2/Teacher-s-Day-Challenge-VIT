# Cheap Travel

This Java program calculates the minimum amount Ann must spend for a planned number of subway rides, considering both single-ride tickets and multi-ride (special) ticket offers.

---

## Problem Statement

Ann needs to ride the subway `n` times.  
She can buy tickets in two ways:

- **Single ride ticket:** costs `a` rubles per ride.
- **Special ticket:** allows `m` rides for `b` rubles (can be bought multiple times).

**Goal:**  
Find the minimum total amount Ann must pay to complete all her rides.

---

## Input Format

A single line with four space-separated integers:
- `n`: total number of rides Ann will take
- `m`: number of rides covered by each special ticket
- `a`: price of a single ride ticket
- `b`: price of a special ticket

---

## Approach

The program checks three options:
1. **All rides as single tickets:** `cost1 = n * a`
2. **Maximum special tickets + singles for leftovers:** `cost2 = (n / m) * b + (n % m) * a`
3. **Extra special tickets (might cover more rides than needed):** `cost3 = ((n / m) + 1) * b`
4. The minimum among these three is the answer.

**Complexity:**  
- Time: O(1)
- Space: O(1)

