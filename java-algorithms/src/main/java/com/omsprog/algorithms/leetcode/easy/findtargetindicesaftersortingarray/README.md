## Approach

Use a counting strategy instead of sorting.  
Count how many elements are strictly less than the target and how many times the target appears. Since sorting would place all smaller elements first, the target indices start at `lessThanTargetCounter` and span `occurrences` positions.

## Complexity Analysis

- Time `O(n)` — single pass to count values
- Space `O(1)` — only counters (excluding output list)

## Notes

- Avoids explicit sorting
- Uses counting logic to simulate sorted positions
- Output size depends on number of occurrences
