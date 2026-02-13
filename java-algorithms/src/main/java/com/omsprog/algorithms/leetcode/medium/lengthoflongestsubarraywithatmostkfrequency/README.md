## Approach

Use a sliding window strategy with a HashMap to track frequencies.  
Expand the window with the right pointer while counting occurrences. If any element exceeds `k` frequency, shrink the window from the left until the constraint is satisfied. Track the maximum valid window length during the process.

## Complexity Analysis

- Time: `O(n)` — each element is added and removed from the window at most once
- Space: `O(n)` — HashMap may store up to all distinct elements

## Notes

- Classic variable-size sliding window
- Maintains frequency constraint dynamically
- Efficient due to linear traversal
