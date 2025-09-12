## Approach

We use a sliding window approach with two pointers (`left` and `right`) and a `Set` to keep track of characters currently in the window. The `right` pointer expands the window by adding characters, and if a duplicate is encountered, we move the `left` pointer forward while removing characters from the set until the duplicate is removed. At each step, we update the length of the longest substring without repeating characters.

## Complexity Analysis

- Time: `O(n)`, where n is the length of the string. Each character is visited at most twice (once by `right` and once by `left`).
- Space: `O(n)` in the worst case, when all characters are unique and stored in the set.

## Notes

- This solution handles any characters, not just lowercase letters.
- The sliding window ensures we only store unique characters in the current substring.
- `longest` keeps track of the maximum length found.
- `right - left + 1` calculates the current window size.
