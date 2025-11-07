## Approach

Use a fixed-size sliding window over the circular array to efficiently compute the sum of the next or previous `k` elements for each index, depending on whether `k` is positive or negative. 

Handle the special case when `k = 0` by returning all zeros.

## Complexity Analysis

- Time: `O(n)`  
  The window slides across the array once, updating the sum in constant time per step.

- Space:`O(n)`  
  A separate array is used to store the decrypted values.

## Notes

- This uses a **static (fixed-size) sliding window** with size `|k|`.
- Circular behavior is handled using modulo arithmetic.
- The starting position depends on the sign of `k`.
