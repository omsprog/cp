## Approach

We use a **fixed-size sliding window** of length `2 * k + 1` to compute the average for each element that can have a full window around it.

1. Initialize the `answer` array with `-1`, which will remain for indices where a full window cannot be formed.
2. Use two pointers, `left` and `right`, to represent the current window and maintain a running `sum` of elements inside the window.
3. Expand the window by moving `right` and adding `nums[right]` to `sum`.
4. When the window reaches the required length, calculate the integer average `(int)(sum / windowLength)` and assign it to the center index `left + k`.
5. Slide the window forward by subtracting `nums[left]` from `sum` and incrementing `left`.

This approach ensures each average is computed in **O(1) per step** after the initial sum buildup.

## Complexity Analysis

- Time: `O(n)`, where n is the length of `nums`. Each element is added and removed from `sum` at most once.
- Space: `O(n)`, for the `answer` array. No additional space is used apart from the `sum` and pointers.

## Notes

- Indices that cannot form a complete window of length `2*k + 1` remain `-1`.
- Using `long sum` prevents integer overflow for large values in `nums`.
- `left + k` correctly identifies the center of the current window.
- Integer division `(int)(sum / windowLength)` ensures the average is truncated toward zero.
