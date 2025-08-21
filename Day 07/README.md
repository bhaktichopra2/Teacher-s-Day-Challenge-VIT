# Remove Duplicates from Sorted Array

This repository contains a solution to the classic [LeetCode Problem #26: Remove Duplicates from Sorted Array](https://leetcode.com/problems/remove-duplicates-from-sorted-array/).

## Problem Statement

Given a sorted array `nums`, remove the duplicates in-place such that each element appears only once and returns the new length.  
You must do this by modifying the input array in-place with O(1) extra memory.

## Solution Approach

- Use two pointers technique.
- Iterate through the array and for each unique element found, assign it to the next available position.
- Return the new length (`k`) of the array with unique elements at the start.


