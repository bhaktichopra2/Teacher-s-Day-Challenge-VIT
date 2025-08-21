# Dubstep

## 📌 Problem Description
In the "Dubstep" problem, DJs often remix songs by inserting the substring `"WUB"` into the original lyrics multiple times, sometimes consecutively.  
Given the remixed song as a single string, the task is to:
- Remove all occurrences of `"WUB"`.
- Restore the original words, separated by a single space.
- Maintain the correct word order.

---

## 🛠️ Approach

### Steps:
1. **Input**: Read a single string `s` which contains the remixed song.
2. **Replace "WUB" occurrences**:
   - Use `String.replaceAll("(WUB)+", " ")` to replace one or more `"WUB"` sequences with a single space.
   - The `(WUB)+` regex means:
     - `WUB` literal match
     - `+` for "one or more occurrences"
3. **Trim extra spaces**:
   - `.trim()` removes leading and trailing spaces that may appear after replacement.
4. **Output**: Print the cleaned-up song string.

---
