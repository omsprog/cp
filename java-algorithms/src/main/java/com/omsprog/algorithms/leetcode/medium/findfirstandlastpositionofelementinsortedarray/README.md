## Approach

Use binary search to first determine whether the target exists.  
If it does, apply two additional binary searches to expand from that position: one to find the leftmost occurrence and another to find the rightmost occurrence.  
This leverages the sorted property of the array and treats the problem as two boundary-finding searches.

## Complexity Analysis

- Time `O(log n)` — Each binary search runs in logarithmic time, and a constant number of searches are performed.
- Space `O(1)` — Only a fixed number of variables are used.

## Notes

- The midpoint is calculated using `l + (r - l) / 2` to prevent overflow.
- The second and third searches are standard “first occurrence” and “last occurrence” binary search patterns.
- If the initial binary search fails, the result is immediately `[-1, -1]`.