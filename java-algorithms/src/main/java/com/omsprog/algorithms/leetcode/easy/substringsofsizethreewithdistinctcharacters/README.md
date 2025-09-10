## Approach

Use a fixed-length sliding window of size 3.  
Maintain a frequency array of size 26 to count characters in the current window.  
For each window, check if any character appears more than once.  
If all characters are unique, increment the counter.  
Slide the window by removing the leftmost character and moving the right pointer forward.

## Complexity Analysis

- Time: `O(n)`, where n = s.length()
- Space: `O(1)`, frequency array of size 26

## Notes

- The window size is fixed at 3.
- Uses a frequency array to detect duplicates efficiently.
- Can be slightly optimized using a set instead of the 26-length array since window size is small.
