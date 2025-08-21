## Problem Statement
On internet forums, it is sometimes difficult to tell a user's gender based on their username or avatar.
A new method suggests that if a username contains an odd number of distinct letters, the user is considered "male," and if it has an even number of distinct letters, the user is "female."\

## Approach

1. Read the username string from input.

2. Count the number of distinct characters in the string:

3. Use a data structure like a Set to store unique characters.

4. Go through the string, inserting each character into the set.

5. Check whether the count is even or odd:

6. If the count is even, print "CHAT WITH HER!"

7. If odd, print "IGNORE HIM!"