## Approach

Use linear index mapping to construct the 2D matrix.  
Validate that the total number of elements matches `m * n`, then map each index from the 1D array to its corresponding row and column using division and modulo.

## Complexity Analysis

- Time: `O(m * n)` — iterate once over all elements
- Space: `O(m * n)` — new 2D matrix

## Notes

- Direct index arithmetic (row = i / n, col = i % n)
- Preserves original order
- Returns empty matrix if dimensions are invalid
