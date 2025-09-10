## Approach

- Create two **frequency arrays** of size 26 for the strings `s` and `t`.
- Loop through each character of `s` and increment the corresponding index in `freqS`.
- Loop through each character of `t` and increment the corresponding index in `freqT`.
- Compare both frequency arrays element by element:
    - If all counts match, `s` and `t` are anagrams.
    - Otherwise, they are not.

## Complexity Analysis

- Time: `O(n + m)`, where n = `s.length()` and m = `t.length()`.
- Space: `O(1)`, two arrays of size 26.

## Notes

- Works only for lowercase English letters (`a`–`z`).
- Simple and clear solution using **counting sort technique**.
- Alternative: sort both strings and compare, but that would be O(n log n).
