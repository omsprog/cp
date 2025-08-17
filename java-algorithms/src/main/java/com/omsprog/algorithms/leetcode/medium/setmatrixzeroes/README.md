## Approach

1. Create two sets, `rowZeroMemory` and `columnZeroMemory`, to track which rows and columns contain at least one zero.
2. **First pass**: iterate through the matrix. Whenever a zero is found, add its row index to `rowZeroMemory` and column index to `columnZeroMemory`.
3. **Second pass**: iterate through the matrix again. If a cell’s row or column is in the corresponding set, set that cell to zero.
4. The sets act as memory to ensure that modifying one cell doesn’t interfere with the detection of zeros in other cells.

## Complexity Analysis

Time: `O(m · n)`

Space: `O(m + n)`

## Notes

- This approach ensures all rows and columns containing a zero are correctly zeroed.
- Using sets avoids accidental overwriting during the first pass.
- An **optimized in-place version** can reduce space to **O(1)** by using the first row and column as markers.
- This solution is simple and easy to understand, though not the most memory-efficient.
