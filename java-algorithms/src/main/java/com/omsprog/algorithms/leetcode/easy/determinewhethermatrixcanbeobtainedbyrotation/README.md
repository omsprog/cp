## Approach

- To rotate the matrix 90° clockwise:
    1. **Transpose** the matrix in place (swap `mat[row][col]` with `mat[col][row]`).
    2. **Reverse** each row to complete the rotation.
- Define a helper function `isSameMatrix` to compare two matrices element by element.
- In the main method, `findRotation`, repeat the rotation up to **4 times** (0°, 90°, 180°, 270°), checking for equality after each rotation.
- If at any stage the matrices match, return `true`. Otherwise, after 4 rotations, return `false`.

## Complexity Analysis

Time: `O(n^2)`
    - Transposing the matrix takes `O(n^2)`.
    - Reversing rows takes another `O(n^2)`.
    - Comparing two matrices also takes `O(n^2)`.
    - These steps are repeated at most 4 times, so the complexity remains `O(n^2)`.

Space: `O(1)`
    - Rotation is done **in place** without extra data structures.
    - Only a few variables are used for swapping.

## Notes

- The input matrix `mat` is mutated during execution.
- If preserving the original matrix is required, a copy should be made before applying rotations.
- This solution leverages the well-known trick: **transpose + reverse = 90° rotation**.
