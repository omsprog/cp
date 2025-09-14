## Approach

This solution uses a **dynamic sliding window** to find the longest contiguous subarray containing at most two distinct fruits.  
A HashMap tracks the frequency of each fruit type in the current window `[left, right]`.  
As we expand the window by moving `right`, we update the count of the current fruit.  
If the window contains more than two types, we shrink it from the left, decrementing counts in the map, until only two types remain.  
At each step, the window length represents a candidate for the maximum length, which we update dynamically.

## Complexity Analysis

- Time: `O(n)`, where n is the length of the `fruits` array. Each element is processed at most twice, once when added and once when removed.
- Space: `O(1)` in practice, since the map stores at most 3 fruit types (constant), but O(m) if generalized to more types, where m is the number of distinct fruit types.

## Notes

- This is a classic **dynamic sliding window** problem, where the window size adjusts based on the number of distinct elements.
- Efficient because it avoids checking all subarrays explicitly, maintaining only counts for current window elements.
- Can be generalized to "at most k distinct elements" by replacing 2 with k.  
