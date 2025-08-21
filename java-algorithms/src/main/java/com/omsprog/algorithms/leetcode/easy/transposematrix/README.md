## Approach

- To transpose a matrix, we swap its rows with its columns.
- If the original matrix has size `rows x cols`, the transposed matrix will have size `cols x rows`.
- Create a new matrix `response` with dimensions `[cols][rows]`.
- Iterate through each element of the original matrix and assign `response[col][row] = matrix[row][col]`.
- Return the resulting `response` matrix.

## Complexity Analysis

- Time: `O(rows * cols)`
    - Each element of the matrix is processed once.

- Space: `O(rows * cols)`
    - A new matrix of size `cols x rows` is created to store the result.
    - In-place transposition is only possible for square matrices.

## Notes

- This solution works for both square and non-square matrices.
- If the matrix is square (`n x n`), an in-place solution can reduce space complexity to `O(1)`.  
