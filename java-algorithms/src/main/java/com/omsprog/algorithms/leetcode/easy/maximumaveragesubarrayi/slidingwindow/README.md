## Approach

- Initialize `sum`, `left`, and `right` pointers.
- Expand the window by moving `right` and adding `nums[right]` to `sum`.
- When the window size reaches `k` (`right - left + 1 == k`):
    - Update `maxSum` if current `sum` is larger.
    - Remove the element leaving the window (`nums[left]`) and increment `left`.
- Continue sliding until the end of the array.
- Return `maxSum / k` as the maximum average.

## Complexity Analysis
 
- Time: `O(n)` — single pass through the array.
- Space: `O(1)` — only a few integer variables used.

## Notes

- Flexible approach — works for **variable-size window problems** as well.
- Useful template for problems like "Longest Substring Without Repeating Characters" or "Minimum Size Subarray Sum".
- Slightly more verbose than Build-and-Slide, but more general.
