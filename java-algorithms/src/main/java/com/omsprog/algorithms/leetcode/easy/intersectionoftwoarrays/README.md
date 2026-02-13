## Approach

Use a hash-based strategy.  
Store elements of the first array in a HashSet, then iterate over the second array to collect common elements while ensuring uniqueness.

## Complexity Analysis

- Time: `O(n + m)` single pass over both arrays
- Space: `O(n)` HashSet storage

## Notes

- Constant-time lookups with hashing
- No nested loops
- Ensures unique intersection
