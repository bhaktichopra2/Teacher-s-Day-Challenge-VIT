## Watermelon Problem
A solution to the classic "Watermelon" programming problem.

## Problem Statement
Given a watermelon of weight w (where 1 ≤ w ≤ 100), determine if it can be split into two parts where each part has a positive and even weight. The parts do not need to be equal.

Input: An integer w.

Output: Print YES if possible, otherwise print NO.

## Approach
The solution is based on a simple mathematical rule and one key edge case.

For the watermelon to be divisible into two even parts, its total weight w must also be even. However, the smallest possible split into two positive even parts is 2 + 2 = 4. This means a weight of 2 cannot be split as required (only 1 + 1 is possible, and 1 is odd).

Therefore, a valid split is possible if and only if the watermelon's weight is an even number and is greater than 2.

Final Condition: w > 2 && w % 2 == 0