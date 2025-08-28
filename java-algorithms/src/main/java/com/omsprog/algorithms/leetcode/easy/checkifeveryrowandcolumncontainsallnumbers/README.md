## Approach

We use two boolean matrices to track the presence of numbers in each row and column:
- `rows[r][val-1] = true` means that value `val` has been seen in row `r`.
- `cols[c][val-1] = true` means that value `val` has been seen in column `c`.

Steps:
1. Traverse the matrix once. For each cell `(r, c)`, compute its value `val` and mark it in both `rows[r]` and `cols[c]`.
2. After filling, verify that every row and every column contains all numbers `1..n`. If any `false` entry remains, the matrix is invalid.
3. If all rows and columns pass the check, return `true`.

This ensures every row and column contains all values exactly once.

## Complexity Analysis

- Time `O(n ^ 2)` → two nested loops to populate, plus two nested loops to validate.
- Space `O(n ^ 2)` → two `n × n` boolean arrays to track rows and columns.

## Notes

- This approach avoids `HashSet` overhead by using direct boolean indexing, making lookups O(1).
- Validation is done after the marking phase, but the check could also be merged into the first loop with early returns for a slightly shorter solution.  
