## Problem Statement - Word Capitalisation
You are given a string consisting of one or more lowercase or mixed-case letters.
Your task is to capitalize only the first letter of the string, leaving the rest of the string unchanged.
Print the resulting string.

## Approach
1. Read the input word as a string from the user.

2. Extract the first character (substring(0,1)).

3. Convert this character to uppercase using toUpperCase().

4. Extract the remainder of the string starting from the second character (substring(1)).

5. Concatenate the capitalized first character and the remainder.

6. Output the resulting string.

This approach ensures that only the first character changes (if needed), while all following characters are left as they were.

Time Complexity: O(n), where n is the length of the string.