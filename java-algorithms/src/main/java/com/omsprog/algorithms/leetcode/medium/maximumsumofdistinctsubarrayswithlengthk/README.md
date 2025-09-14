## Approach

This solution uses a **Fixed Sliding Window** of size `k` to calculate the sum of subarrays while ensuring all elements are distinct.  
A HashMap tracks the frequency of each element inside the current window. As the window expands with `right`, the sum and frequency map are updated.  
Once the window reaches size `k`, we check if all elements are unique (map size == k) and update the maximum sum if necessary.  
After that, the window is slid forward by incrementing `left`, updating the sum and map accordingly.

## Complexity Analysis

- Time: `O(n)`, where n is the length of `nums`. Each element is added and removed at most once.
- Space: `O(k)`, due to the HashMap storing counts of elements in the window.

## Notes

- This implementation specifically uses a **Fixed Sliding Window** of length `k`.
- The problem could also be solved using a **Dynamic Sliding Window**, which can handle subarrays of varying lengths and distinct constraints.
- Returns 0 if no subarray of length `k` with all distinct elements exists.
- Efficient for large arrays because each element is processed a constant number of times.  
