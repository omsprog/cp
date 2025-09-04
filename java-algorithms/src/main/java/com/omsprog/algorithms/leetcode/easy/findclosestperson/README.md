## Approach

1. Compute the absolute difference between `z` and `x`.
2. Compute the absolute difference between `z` and `y`.
3. Compare both differences:
    - If they are equal, return `0` (both are equally close).
    - If `x` is closer, return `1`.
    - If `y` is closer, return `2`.

## Complexity Analysis

- Time: `O(1)`
    - Only constant-time arithmetic and comparisons are performed.

- Space: `O(1)`
    - Only a few integer variables are used.

## Notes

- A simple math-based solution with no loops or extra memory.
- Handles ties explicitly by returning `0`.
- Works correctly for both positive and negative integers.