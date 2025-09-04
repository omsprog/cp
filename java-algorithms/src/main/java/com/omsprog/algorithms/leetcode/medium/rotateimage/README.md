## Approach

1. **Transpose the matrix:**
    - Swap elements across the main diagonal (`matrix[row][col] ↔ matrix[col][row]`).
    - This step flips the matrix over its diagonal.

2. **Reverse each row:**
    - For every row, swap elements symmetrically from the left and right ends.
    - This mirrors the matrix horizontally, resulting in a 90-degree clockwise rotation.

3. The combination of transposing and reversing rows achieves the desired rotation **in-place**.

## Complexity Analysis

- Time: `O(n ^ 2)`
    - Each element in the `n x n` matrix is visited a constant number of times.

- Space: `O(1)`
    - The rotation is done in place with only temporary variables for swapping.

## Notes

- Works for any square (`n x n`) matrix.
- In-place approach avoids using extra matrices.
- Common interview follow-up: rotating counterclockwise, which can be done by transposing + reversing columns instead of rows.
- This is the canonical optimal solution for the "Rotate Image" problem.
