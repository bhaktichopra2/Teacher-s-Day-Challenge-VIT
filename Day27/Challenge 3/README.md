# Sereja and Dima Card Game

This repository contains a Java solution for the card game "Sereja and Dima," a simple two-player algorithmic game that demonstrates greedy strategies and two-pointer techniques.

---

## Problem Description

Sereja and Dima play a game with a row of `n` cards, each displaying a distinct integer. The players take turns, with Sereja starting first.

- On each turn, a player must take exactly **one card** from either the **leftmost** or **rightmost** end of the row.
- The game continues until all cards are picked.
- The player with the **highest total sum** of their collected card values wins.

---

## Solution Approach: Greedy Two-Pointers

This problem can be efficiently solved by simulating the described greedy strategy using a two-pointer technique:

### Steps

1. **Initialization**
   - Two pointers, `left` (starting at index 0) and `right` (starting at index `n-1`), are used to track the current available cards.
   - Two variables hold the scores for Sereja and Dima.
   - A flag or counter keeps track of whose turn it is (alternating after each move).

2. **Game Simulation**
   - Use a `while` loop: continue while `left <= right`.
   - On each turn, compare the values at the `left` and `right` pointers.
   - The current player picks the card with the higher value:
     - If `cards[left]` >= `cards[right]`, pick from the left (`left++`).
     - Else, pick from the right (`right--`).
   - Add the chosen card's value to the current player's score.
   - Switch the turn to the other player.
   - Repeat until all cards are picked.

3. **Conclusion**
   - After the loop, both players' totals are printed.
   - The player with the higher score is the winner.

---

## Complexity

- **Time Complexity:** O(n) (each card is considered once)
- **Space Complexity:** O(1) (only variables for scores and pointers are needed)

