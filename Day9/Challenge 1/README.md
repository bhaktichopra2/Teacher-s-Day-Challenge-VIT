## Problem Statement
You are given the outcomes of a programming contest where there are n problems. For each problem, three friends—Petya, Vasya, and Tonya—discuss whether they are sure about the solution. Each friend answers with 1 (sure) or 0 (not sure).
The friends agree to implement a solution for a problem if at least two out of the three are sure about the solution.

## Input:

The first line contains an integer n — the number of problems.

The next n lines each contain three integers (a, b, c), where each integer is 0 or 1 and represents the confidence of each friend for that problem.

## Output:

Output a single integer: the number of problems for which the friends will write a solution.

## Approach

1. Read the number of problems, n.

2. For each problem, read three integers representing the confidence (0 or 1) of the three friends.

3. For each problem, calculate the sum of the three confidences:

    If the sum is 2 or 3, it means at least two friends are sure, so the friends will solve this problem.
    
    If the sum is less than 2, they won't solve it.

4. Count the total number of problems where the sum is at least 2.

5. Output this count.