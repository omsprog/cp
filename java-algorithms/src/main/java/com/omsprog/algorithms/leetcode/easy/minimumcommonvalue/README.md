## Approach

Use a hash-based lookup strategy.  
Store all elements from the first array in a HashSet, then iterate through the second array and return the first element found in the set.

## Complexity Analysis

- Time: `O(n + m)` — build set from first array and scan second array
- Space: `O(n)` — HashSet storage

## Notes

- Returns the first common element encountered
- Constant-time average lookups with hashing
- Can be optimized to O(n + m) time and O(1) space using two pointers if arrays are sorted