## Approach

We simulate the spiral traversal by maintaining four boundaries: `up`, `down`, `left`, and `right`.
- Start at the top-left corner and move **right** until the `right` boundary.
- Move **down** along the `right` boundary.
- Move **left** along the `bottom` boundary.
- Move **up** along the `left` boundary.

After each directional move, we adjust the corresponding boundary inward.  
We continue this process until all elements are added to the result list.

## Complexity Analysis

- Time: `O(m * n)`, where `m` is the number of rows and `n` is the number of columns. Each element is visited exactly once.
- Space: `O(m * n)` for storing the result list. No extra space beyond the output is used.

## Notes

- The `expectedLength` check allows early termination once all elements are traversed.
- Boundaries (`up`, `down`, `left`, `right`) are incremented after traversing their corresponding edges.
- This approach works for non-square matrices as well.
