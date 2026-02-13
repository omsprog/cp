## Approach

Use a frequency-count strategy.  
Build two HashMaps to store the occurrence count of each number in both arrays. Then iterate over one map and, for each common key, add the minimum frequency to the result.

## Complexity Analysis

- Time: `O(n + m)` — build both maps and iterate once
- Space: `O(n + m)` — two frequency maps

## Notes

- Handles duplicates correctly using counts
- Uses hashing for efficient lookups
- Avoids nested comparisons
