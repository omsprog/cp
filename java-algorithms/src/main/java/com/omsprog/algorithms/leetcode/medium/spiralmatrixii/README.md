## Approach

We generate an `n x n` matrix filled with numbers from 1 to n² in spiral order by maintaining four boundaries: `up`, `down`, `left`, and `right`.

- Start at the top-left corner and move **right** along the top boundary, filling numbers sequentially.
- Move **down** along the right boundary.
- Move **left** along the bottom boundary.
- Move **up** along the left boundary.

After each directional move, we increment the corresponding boundary inward and continue until the sequence reaches `n²`.

## Complexity Analysis

- Time: `O(n * n)`, since each of the `n²` numbers is written exactly once.
- Space: `O(n * n)` for the output matrix. No additional data structures are used.

## Notes

- The `expectedLength` check allows early termination once all numbers are filled.
- Boundaries (`up`, `down`, `left`, `right`) are consistently updated after traversing each edge.
- This approach works for any positive integer `n`.  
