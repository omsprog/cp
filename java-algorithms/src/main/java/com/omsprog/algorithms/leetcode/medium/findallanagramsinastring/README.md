## Approach

- Use a **sliding window** of size `p.length()` on string `s`.
- Maintain two **frequency arrays** of size 26:
    - `freqP` for characters in `p`.
    - `freqS` for characters in the current window of `s`.
- Expand the window by moving `right` and updating `freqS`.
- When the window size equals `p.length()`, check if `freqS` matches `freqP` using the helper `isAnagram`.
- If it's an anagram, add `left` to the result list.
- Shrink the window by moving `left` and decrementing the frequency of `s[left]`.

## Complexity Analysis

- Time: `O(n)`, where n = `s.length()`.
    - Each window check compares 26 elements → treated as O(1).
- Space: `O(1)`, two arrays of size 26.

## Notes

- Uses **sliding window + frequency arrays**.
- `isAnagram` helper improves readability.
- Could be optimized further with a **match count** to avoid comparing all 26 characters every time.