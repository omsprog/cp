## Approach

Use binary search to locate the target or the position where it should be inserted.  
Instead of returning `-1` when not found, return the `left` pointer, which always ends up at the correct insertion index.

## Complexity Analysis

- Time: `O(log n)`
- Space: `O(1)` — only constant extra variables are used.

## Notes

This approach avoids linear scanning and guarantees the insertion position even when the target is not present.