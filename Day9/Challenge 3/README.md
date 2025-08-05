## Next Round

### Problem Statement
You are given the scores of n participants in a competition and a cutoff rank k. The cutoff score is the score of the participant who is currently in the k-th place (1-based index).

Your task is to determine how many participants advance to the next round. A participant advances if:

Their score is at least as high as the cutoff score, and

Their score is greater than zero.

### Example
Input:
8 5
10 9 8 7 7 7 5 5

Output:
6

### Approach
Read the integer values n (number of participants) and k (cutoff rank).

Read the list of scores of the n participants, which are assumed sorted in non-increasing order.

Find the cutoff score as the k-th participant's score (scores[k - 1]).

Iterate through the scores and count how many:

Have a score greater than or equal to the cutoff score.

Have a score that is greater than zero.

Print the count.

This straightforward approach efficiently solves the problem in O(n) time by a single pass through participants’ scores.