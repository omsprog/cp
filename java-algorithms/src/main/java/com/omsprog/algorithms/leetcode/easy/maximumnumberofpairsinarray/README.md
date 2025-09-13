## Approach

1. Use a `Map<Integer, Integer>` called `memory` to track the last seen index of each number.
2. Use a `Set<Integer>` called `indexes` to store the indices of numbers that form pairs.
3. Iterate through the array `nums`:
    - If the current number exists in `memory`, it forms a pair with the previously stored index:
        - Add both the stored index and current index to `indexes`.
        - Remove the number from `memory` because it has been paired.
    - Otherwise, store the current index in `memory`.
4. After processing all numbers:
    - The number of pairs is `indexes.size() / 2` (each pair has 2 indices).
    - The number of leftover elements is `nums.length - indexes.size()`.
5. Return these two values in an array: `[numberOfPairs, leftoverElements]`.

## Complexity Analysis

- Time: `O(n)` — Iterate over the array once, with `Map` and `Set` operations taking average `O(1)` each.
- Space: `O(n)` — `Map` and `Set` can store up to `n` indices in the worst case.

## Notes

- This solution efficiently pairs identical numbers without sorting.
- Using a `Map` allows quick lookup to determine if a number can form a pair.
- The `Set` ensures no duplicate indices are counted for leftover calculation.
- The solution handles arrays of any size, including arrays where no pairs exist.
