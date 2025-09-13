## Approach

1. Initialize two frequency arrays `vowelsF` and `consonantsF` of size 26 to keep count of each letter's occurrence separately for vowels and consonants.
2. Create a `Set` of vowels (`a, e, i, o, u`) for quick membership checking.
3. Iterate through the input string:
    - Convert each character to its index `c - 'a'`.
    - If the character is a vowel, increment the corresponding index in `vowelsF`.
    - Otherwise, increment the corresponding index in `consonantsF`.
4. After populating the frequency arrays, find the maximum frequency in both arrays:
    - `mostFrequentVowel` stores the highest count among vowels.
    - `mostFrequentConsonant` stores the highest count among consonants.
5. Return the sum of `mostFrequentVowel` and `mostFrequentConsonant`.

## Complexity Analysis

- Time: `O(n)` — Iterate over the string once (`n` = length of string) and then over a fixed array of size 26.
- Space: `O(1)` — Frequency arrays have fixed size 26, independent of input length.

## Notes

- Assumes input consists of lowercase English letters only.
- Using arrays for frequency counting is faster than using a `Map` for this fixed alphabet size.
- The sum of the highest-frequency vowel and consonant gives the required result efficiently without sorting or extra data structures.
