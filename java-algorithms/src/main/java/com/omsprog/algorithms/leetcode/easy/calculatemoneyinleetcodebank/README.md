## Approach

Simulate the deposit process day by day.  
Use two counters:
- `mondayCounter` to represent the starting value each week (increases every 7 days)
- `nonMondayCounter` to track the daily increment within a week

For each day:
- If it's Monday (`i % 7 == 0`), increment the weekly base and reset the daily counter.
- Add the sum of weekly base + daily increment to the total.

Return the final accumulated amount.

## Complexity Analysis

- Time: `O(n)` — iterate once through the `n` days.
- Space: `O(1)` — only a few integer counters are used.

## Notes

This directly simulates the pattern rather than using a formula, making it simple and clear.