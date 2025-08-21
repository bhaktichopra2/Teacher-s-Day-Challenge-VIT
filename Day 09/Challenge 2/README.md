## Way too long words

### Problem Statement
You are given n words. For each word, if its length is more than 10 characters, it needs to be abbreviated using the following format:

Write the first letter of the word,

Then write the number of characters between the first and last letter,

Then write the last letter of the word.

If the word has 10 or fewer characters, print it unchanged.

### Input Format:

The first line contains an integer n — the number of words.

The following n lines each contain one word.

### Output Format:

For each word, output the abbreviated form if its length is more than 10; otherwise, print the word itself.

Example
Input:
4
word
localization
internationalization
pneumonoultramicroscopicsilicovolcanoconiosis

Output:
word
l10n
i18n
p43s


### Approach
Read the integer n from input, which represents how many words will be processed.

For each of the n words:

Check if the word length is greater than 10.

If yes, build the abbreviated string:

Take the first character of the word.

Append the number of characters between the first and last character (length - 2).

Append the last character of the word.

Otherwise, print the word as-is.

This approach uses simple string manipulation and runs in O(n * m), where n is the number of words and m is the average length of a word.