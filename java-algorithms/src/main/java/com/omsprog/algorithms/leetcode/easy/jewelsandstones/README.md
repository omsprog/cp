## Approach

1. Convert the string `jewels` into a `HashSet<Character>` for O(1) lookups.
2. Initialize a counter `numOfJewels` to 0.
3. Traverse each character in `stones`:
    - If the character exists in the `jewels` set, increment `numOfJewels`.
4. Return `numOfJewels`.

## Complexity Analysis

- Time: `O(n + m)`
    - n = length of `jewels` (for building the set).
    - m = length of `stones` (for counting).

- Space: `O(n)`
    - HashSet stores all jewel characters.

## Notes

- Efficient lookup using a set avoids nested loops.
- Works for any characters in `jewels` and `stones`.
- Simple and readable solution suitable for interviews.
