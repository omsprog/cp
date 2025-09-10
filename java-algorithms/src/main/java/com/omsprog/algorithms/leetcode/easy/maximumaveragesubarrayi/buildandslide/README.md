## Approach

- Initialize the sum of the first `k` elements as the initial window.
- Use two pointers (`left` and `right`) to slide the window through the array:
    - Subtract the element leaving the window (`nums[left]`).
    - Add the element entering the window (`nums[right]`).
- Track the maximum sum seen so far.
- Return `max / k` as the maximum average.

## Complexity Analysis

- Time: `O(n)` — sum first `k` elements + one pass to slide the window across the array.
- Space: `O(1)` — only a few integer variables used.

## Notes

- Clean and simple for **fixed-size windows**.
- Can use `long` for `sum` to prevent integer overflow for large arrays.
- Slightly more concise than the general sliding window approach when `k` is fixed.
