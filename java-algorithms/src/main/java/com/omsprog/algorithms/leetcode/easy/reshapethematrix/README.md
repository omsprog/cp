## Approach

Use index mapping between the original and reshaped matrix.  
Treat both matrices as a flattened 1D sequence of elements and map each linear index to its corresponding row and column in both the old and new matrices. Only perform reshaping if the total number of elements matches.

## Complexity Analysis

- Time: `O(m * n)` — iterate once over all elements
- Space: `O(r * c)` — new reshaped matrix

## Notes

- Uses mathematical index conversion (division and modulo)
- No extra data structures beyond the result matrix
- Preserves row-major order