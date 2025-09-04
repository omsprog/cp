## Approach

1. Use the **sliding window technique**:
    - Maintain two pointers (`left`, `right`) representing the current window of size `k`.
    - Keep a running sum of the elements inside the window.

2. Expand the window by moving `right` and adding `arr[right]` to the sum.

3. When the window size reaches `k`:
    - Check if the average (`sum / k`) is greater than or equal to `threshold`.
    - If yes, increment the result counter.
    - Slide the window by removing `arr[left]` from the sum and moving `left` forward.

4. Continue until all windows are processed and return the result.

## Complexity Analysis

- Time: `O(n)`
    - Each element is added to the sum once and removed once.

- Space: `O(1)`
    - Only a few variables (`sum`, `left`, `right`, `result`) are used.

## Notes

- The sliding window avoids recalculating sums from scratch, making the solution efficient.
- Integer division (`sum / k`) works correctly because we only need to check against `threshold`.
- This is the optimal solution for the problem since every subarray of size `k` must be examined.
