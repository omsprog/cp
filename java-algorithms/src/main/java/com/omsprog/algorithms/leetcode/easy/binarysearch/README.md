## Approach

Use binary search to narrow down the search space by comparing the middle element with the target and adjusting the search boundaries accordingly. 

Since the array is sorted, each step eliminates half of the remaining elements until the target is found or the range becomes invalid.

## Complexity Analysis

- Time: `O(log n)`
- Space: `O(1)` — only a few integer variables are used.

## Notes

- Using `left <= right` ensures the last possible index is checked.
- The 'mid' calculation avoids overflow.
- Only works on sorted arrays.