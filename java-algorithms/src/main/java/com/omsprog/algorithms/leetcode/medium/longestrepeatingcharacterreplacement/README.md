## Approach

We use a **sliding window** to find the longest substring where we can replace at most `k` characters to make all characters the same.

1. Use an array `memory` of size 26 to store counts of each uppercase letter in the current window (`'A'` to `'Z'`).
2. Expand the window by moving the `right` pointer and incrementing `memory[s[right] - 'A']`.
3. While the window is **invalid**, shrink it from the left: decrement `memory[s[left] - 'A']` and move `left` forward.
4. A window is valid if the number of letters that need to be replaced (`total letters in window - count of most frequent letter`) is ≤ `k`. This check is done in the helper method `isValidWindow`.
5. Update `longest` with the size of the current valid window (`right - left + 1`).

The helper function `isValidWindow` computes the total letters and the maximum frequency in the current window, returning whether replacements are within the allowed limit.

## Complexity Analysis

- Time: `O(n)`, where n is the length of the string. Each character is added to and removed from the window at most once.
    - `isValidWindow` scans 26 letters each time, which is constant, so the overall complexity is linear.
- Space: `O(26)` → the `memory` array for letter counts, effectively `O(1)`.

## Notes

- `memory[c - 'A']` maps `'A'..'Z'` to indices `0..25`.
- The sliding window ensures we always maintain the largest valid substring at any point.
- `total - biggest <= k` ensures the current window can be converted to all same characters with ≤ `k` replacements.
- This solution is correct, simple, and efficient for uppercase letters.
