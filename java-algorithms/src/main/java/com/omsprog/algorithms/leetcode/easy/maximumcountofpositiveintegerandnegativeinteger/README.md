## Approach

Use binary search to count negatives and positives separately.  
Since the array is sorted, perform two binary searches: one to find the boundary between negatives and non-negatives, and another to find the boundary between non-positives and positives. Return the larger count.

## Complexity Analysis

- Time: `O(log n)` — two binary searches
- Space: `O(1)` — constant extra space

## Notes

- Leverages sorted property of the array
- Avoids full traversal
- Counts values using boundary indices
