## Approach

The idea is to use a sliding window to maintain a running sum of a contiguous subarray.  
We expand the window by moving `right` and adding elements until the sum reaches or exceeds the target.  
Once the sum is sufficient, we shrink the window from the left to find the minimum length subarray that still satisfies the condition.  
This allows us to find the smallest subarray in a single pass with O(n) complexity.

## Complexity Analysis

- Time: `O(n)`, where n is the length of the array `nums`. Each element is processed at most twice, once when added and once when removed.
- Space: `O(1)`, since we only use a few variables to track indices, sum, and minimum length.

## Notes

- Returns 0 if no subarray satisfies the target sum.
- Works only with arrays of non-negative numbers, as negative numbers would break the sliding window assumption.  
