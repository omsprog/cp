## Approach

Scan the string once while tracking two values:
- Number of `'A'` (absences)
- Current streak of consecutive `'L'` (lates)

If absences reach 2 or late streak reaches 3, return `false`. Otherwise, return `true` after the scan.

## Complexity Analysis

- Time: `O(n)`
- Space: `O(1)`

## Notes

Early returns avoid extra work once rules are violated.
