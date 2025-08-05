# Group Anagrams

## Problem Statement

Given an array of strings, group the anagrams together.  
Anagrams are strings made up of the same characters but in a different order.

For example, given the input:  
["eat", "tea", "tan", "ate", "nat", "bat"]
The output should be grouped anagrams, like:  
[
["eat", "tea", "ate"],
["tan", "nat"],
["bat"]
]


## Approach

- For each string, convert it to a character array and sort it.  
- Use the sorted string as a key in a hash map (`Map<String, List<String>>`).  
- Group all strings with the same sorted key together in the map.  
- After processing all strings, extract all grouped anagrams from the map and return them.

This exploits the fact that all anagrams share the exact same sorted character sequence.

## Time Complexity

- Sorting each string takes O(K log K), where K is the length of the string.
- Doing this for N strings results in O(N * K log K) time complexity.
- Hash map insert and lookup are approximately O(1) average.

