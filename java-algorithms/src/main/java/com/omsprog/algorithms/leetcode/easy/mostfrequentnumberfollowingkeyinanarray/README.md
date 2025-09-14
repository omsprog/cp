## Approach

The idea is to track which number most frequently appears immediately after `key` in the array.  
By using a frequency map (HashMap), we can efficiently count occurrences of each number following `key` and update the most frequent one dynamically as we iterate through the array.  
This allows us to find the answer in a single pass without storing extra subarrays or performing multiple scans.

## Complexity Analysis

- Time: `O(n)`, where n is the length of the array `nums`. We iterate through the array once.
- Space: `O(m)`, where m is the number of distinct values that follow `key`, stored in the HashMap.

## Notes

- The solution works even if `key` never appears (returns -1).
- Assumes the array has at least one element following each occurrence of `key`.
- Can be slightly optimized using Java's `getOrDefault` to reduce lines of code without changing the logic.  
