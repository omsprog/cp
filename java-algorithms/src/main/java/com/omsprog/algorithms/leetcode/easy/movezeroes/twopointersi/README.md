## Approach

We use two pointers: `zeroIndex` to scan the array and `nonZeroIndex` to find the next non-zero element.  
Whenever we encounter a zero at `zeroIndex`, we swap it with the next non-zero element at `nonZeroIndex`.  
This ensures all zeros are moved to the end while maintaining the relative order of non-zero elements.

## Complexity Analysis

- Time: `O(n)` — each element is visited at most once.
- Space: `O(1)` — only a few pointers are used.

## Notes

- The algorithm is in-place, requiring no extra array.
- Relative order of non-zero elements is preserved.
- Handles arrays with consecutive zeros correctly.
