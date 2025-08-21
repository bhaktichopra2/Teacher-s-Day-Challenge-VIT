# Elephant 

This program calculates the minimum number of steps an elephant needs to travel from position **0** to his friend's house at position **x** on a number line. In one step, the elephant can move forward by **1**, **2**, **3**, **4**, or **5** units.

## Problem Statement

Given an integer **x** \((1 \leq x \leq 1\,000\,000)\) — the location of the friend's house, determine the minimum number of steps required for the elephant to reach his friend, always moving the maximum possible distance at each step (up to 5 units).


**Explanation:**  
The elephant can move 5 + 5 + 2 = 12 units in 3 steps.

## Approach

- The optimal strategy is to take the largest possible step each time.
- The number of steps is:  
   steps = (x+4)/5
 
