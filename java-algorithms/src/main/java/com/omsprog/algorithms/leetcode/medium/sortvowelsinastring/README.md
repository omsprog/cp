## Approach

1. Convert the input string `s` into a `char[]` for easy in-place modification.
2. Create a `Set<Character>` containing all vowels (both uppercase and lowercase).
3. Iterate through the char array and collect all vowels into a `List<Character>` called `vowelsInS`.
4. Sort `vowelsInS` in ascending order using `Collections.sort()`.
5. Iterate through the original char array again, and whenever a vowel is encountered, replace it with the next vowel from the sorted `vowelsInS` list.
6. Convert the modified char array back to a string and return it.

This ensures that **only vowels are sorted**, while consonants remain in their original positions.

## Complexity Analysis

- Time: `O(n log n)`
    - Collecting vowels → `O(n)`
    - Sorting vowels → `O(k log k)` where `k` is the number of vowels, `k ≤ n`
    - Replacing vowels → `O(n)`
    - Overall: `O(n + k log k + n) = O(n log n)` in the worst case (`k ~ n`)

- Space: `O(k)`
    - For storing the vowels in `vowelsInS`
    - `Set` of vowels is `O(1)` since it’s fixed size

## Notes

- Only vowels are affected; consonants remain untouched.
- The solution handles both uppercase and lowercase vowels.
- For a faster vowel lookup, a `boolean[128]` array can be used instead of a `Set`.
- The approach maintains the relative order of consonants and positions of vowels while sorting vowels globally.
