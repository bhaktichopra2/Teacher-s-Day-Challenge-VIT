## Problem Statement
Design a stack data structure that supports the following operations, all in constant time (O(1)):

push(val): Push an integer val onto the stack.

pop(): Remove the top element of the stack.

top(): Get the top element of the stack.

getMin(): Retrieve the minimum element currently in the stack.

You must implement the structure so that you can get the minimum element at any time in constant time.

## Approach
Use two stacks internally:

1. The main stack holds all pushed values.
2. A secondary stack (minStack) keeps track of the minimum values so far.
3. When pushing a value:
    Push it onto the main stack.

    If minStack is empty or the value is less than or equal to the current minimum value (top of minStack), also push it onto minStack.
4. When popping:
    Remove the top element from the main stack.

    If that element equals the top of minStack, pop it from minStack as well.

5. top() simply returns the top element of the main stack.
6. getMin() returns the current minimum element from the top of minStack.

This structure ensures getMin() returns the minimum element in constant time.