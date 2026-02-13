## Approach

Use a row-wise binary search strategy.  
For each row (sorted in non-increasing order), perform binary search to find the first negative element. The number of negatives in that row is the remaining elements after that index. Accumulate the count across all rows.

## Complexity Analysis

- Time: `O(m log n)` — binary search on each of the m rows
- Space: `O(1)` — constant extra space

## Notes

- Leverages sorted property of each row
- More efficient than scanning every element
- Counts negatives in bulk using index position
