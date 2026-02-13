## Approach

Use a sliding window strategy with a frequency array.  
Expand the window with a right pointer while tracking character counts. If any character appears more than twice, shrink the window from the left until the constraint is restored. Track the maximum valid window length during the process.

## Complexity Analysis

- Time: `O(n)` — each character is processed at most twice (once by right, once by left)
- Space: `O(1)` — fixed-size frequency array (constant alphabet)

## Notes

- Classic sliding window pattern
- Maintains window validity dynamically
- Efficient due to constant-size character set
