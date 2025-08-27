## Approach

Use a sliding window of size `k` with a HashSet to track recently seen elements.  
Iterate through the array with two pointers (`left` and `right`):
- If `nums[right]` is already in the set, return `true`.
- Otherwise, add `nums[right]` to the set.
- If the window exceeds size `k`, remove `nums[left]` and move `left` forward.  
  Continue until the end of the array. If no duplicate within distance `k` is found, return `false`.

## Complexity Analysis

- Time: `O(n)` — Each element is added and removed from the HashSet at most once.
- Space: `O(min(n, k))` — The set contains at most `k` elements.

## Notes

This method ensures that at any point, the set represents the last `k` elements in the sliding window.  
Using a HashSet allows constant-time average lookups, making the solution both clean and efficient.  
