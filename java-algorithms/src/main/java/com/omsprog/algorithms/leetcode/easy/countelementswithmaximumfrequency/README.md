## Approach

Use a frequency-count strategy with a fixed-size array.  
First, count occurrences of each number while tracking the maximum frequency. Then, sum the frequencies of all elements that match this maximum value.

## Complexity Analysis

- Time: `O(n)` — count elements and scan fixed range (0–100)
- Space: `O(1)` — fixed-size frequency array

## Notes

- Efficient due to bounded value range (0–100)
- Two-pass approach: count first, aggregate after
- Avoids HashMap by using direct indexing
