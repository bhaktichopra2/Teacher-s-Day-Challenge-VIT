## Problem Statement - Petya and Strings

The goal is to compare two strings of the same length lexicographically (in dictionary order), treating uppercase and lowercase letters as equivalent.

The key rule is that the comparison must be case-insensitive. An uppercase letter is considered equivalent to its corresponding lowercase letter.

## Input
Two lines, each containing one string. The strings are guaranteed to be of the same length (from 1 to 100 characters).

## Output
Print -1 if the first string is lexicographically less than the second string.

Print 1 if the first string is lexicographically greater than the second string.

Print 0 if the strings are equal.

## Approach
The core of the problem is to perform a case-insensitive comparison. The most straightforward way to achieve this is to eliminate the case differences before comparing.

The algorithm follows these simple steps:

1. Read Input: Read the two strings from the standard input.

2. Standardize Case: To handle the case-insensitive requirement, convert both strings to a single case (e.g., all lowercase). This ensures characters like 'a' and 'A' are treated as identical during the comparison.

3. Compare Lexicographically: Once both strings are in the same case, you can use a built-in string comparison function. In Java, the compareTo() method is perfect for this. It compares two strings character by character and returns:

    A negative integer if the first string comes before the second.

    A positive integer if the first string comes after the second.

    Zero if the strings are identical.

4. Translate to Output: Finally, translate the result from the compareTo() method into the required output format (-1, 1, or 0).

This approach is efficient and directly solves the problem by leveraging built-in language features for string manipulation and comparison.