## Approach

We use three `boolean[9][9]` arrays to track the presence of digits in rows, columns, and 3×3 boxes.
- `rows[r][val]` is `true` if digit `val+1` already appeared in row `r`.
- `cols[c][val]` is `true` if digit `val+1` already appeared in column `c`.
- `boxes[boxIndex][val]` is `true` if digit `val+1` already appeared in the corresponding 3×3 sub-box.

For each non-empty cell `(r, c)`:
1. Convert the character into an index `val = element - '1'` (range `0..8`).
2. Compute the sub-box index as `(r / 3) * 3 + (c / 3)`.
3. If the digit is already marked in its row, column, or box → the board is invalid.
4. Otherwise, mark the digit as seen in all three trackers.

If no conflicts are found, the board is valid.

## Complexity Analysis

- Time `O(81)` → each of the 81 cells is processed once with O(1) checks.
- Space `O(1)` → fixed-size arrays of `3 * 9 * 9 = 243` booleans.

## Notes

- This approach is more efficient than using `HashSet` because lookups and inserts are just array accesses, avoiding hashing overhead.
- The board size is always fixed (9×9), so both time and space are effectively constant.
