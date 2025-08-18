## Approach

We use the fact that the array values are in the range `[1, n]`.  
Each number can be mapped to an index (`num - 1`).  
We iterate through the array and for each number `num`:
- Take its absolute value.
- Use `num - 1` as the index.
- If the value at that index is already negative, it means we have seen `num` before → add it to the result.
- Otherwise, negate the value at that index to mark `num` as visited.

This way, the input array itself is used as a marker to track occurrences without needing extra memory.

## Complexity Analysis

Time: `O(n)`

Space: the marking is done in-place `O(1)`

## Notes

- This approach leverages the input array itself for bookkeeping.
- Works only when numbers are in the range `[1, n]`, which is guaranteed by the problem.
