## Approach

1. Create an integer array `freq` of size 26 to store the frequency of each lowercase letter.
2. Convert the input string `s` to a character array `charArray`.
3. Iterate through `charArray` and increment the count of each character in the `freq` array using the index `c - 'a'`.
4. Iterate through `charArray` again:
    - For each character, check its frequency in `freq`.
    - Return the index of the first character with a frequency of 1.
5. If no unique character exists, return `-1`.

## Complexity Analysis

- Time: `O(n)` — Two passes over the string (`n` = length of string).
- Space: `O(1)` — Fixed size array of 26 elements regardless of input length.

## Notes

- Assumes input consists of lowercase English letters only.
- Using an array for frequency counting is more efficient than a `Map` for this fixed alphabet size.
- The solution ensures the first unique character is returned without extra sorting or complex data structures.
- Returns `-1` if no unique character exists.
