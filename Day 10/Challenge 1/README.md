# String Task

## Problem Statement

The task is to process a given string consisting of uppercase and lowercase Latin letters according to the following rules:

1. Delete all vowels. The vowels are defined as the letters "A", "O", "Y", "E", "U", "I".

2. Insert a . character before each consonant.

3. Replace all uppercase consonants with their corresponding lowercase ones.

4. The final result should be printed as a single string.

### Example
Input: tour

Output: .t.r

Input: Codeforces

Output: .c.d.f.r.c.s

## Approach

The solution processes the string by building a new, modified string. Since strings in Java are immutable (cannot be changed), we use a StringBuilder for efficiency.

The algorithm follows these steps:

Convert to Lowercase: The first step is to convert the entire input string to lowercase. This simplifies the logic, as we no longer need to check for both uppercase and lowercase versions of vowels and consonants (e.g., 'A' and 'a', 'B' and 'b').

Initialize a StringBuilder: An empty StringBuilder is created to construct the final result string.

Iterate Through the String: The code loops through each character of the (now lowercase) input string.

Check for Vowels: Inside the loop, each character is checked against the list of vowels ('a', 'o', 'y', 'e', 'u', 'i').

Build the Result:

If the character is a vowel, it is ignored. This effectively "deletes" it from the final output.

If the character is a consonant, a . character is first appended to the StringBuilder, followed by the consonant character itself.

Print the Output: After the loop has processed all characters, the final string is generated from the StringBuilder and printed to the console.