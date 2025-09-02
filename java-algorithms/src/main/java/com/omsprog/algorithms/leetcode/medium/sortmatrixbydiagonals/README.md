## Approach
1. Iterate over the diagonals starting from the top-right corner:
    - Collect elements along the diagonal.
    - Sort them in ascending order.
    - Place them back into the matrix.
2. Iterate over the diagonals starting from the left column:
    - Collect elements along the diagonal.
    - Sort them in descending order.
    - Place them back into the matrix.
3. Return the modified matrix.

## Complexity Analysis

- Time: `O(n² log n)`, where n is the size of the matrix. Sorting each diagonal of length up to n takes O(n log n), and there are about 2n diagonals.
- Space: `O(n)`, for temporarily storing elements of each diagonal.

## Notes
- `Collections.sort()` is used for ascending order, `Collections.sort(list, Collections.reverseOrder())` for descending.
- The algorithm modifies the matrix in-place.
- Works specifically for square matrices.
- Step 1 handles the diagonals above and including the main diagonal from the top-right.
- Step 2 handles diagonals starting from the leftmost column, including the main diagonal.
