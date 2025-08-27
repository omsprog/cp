## Approach

We use a single pointer `index` to track the position where the next non-zero element should go.
1. Iterate over the array: for each non-zero element, write it to `nums[index]` and increment `index`.
2. After placing all non-zero elements, fill the rest of the array with zeros.

This moves all zeros to the end while preserving the relative order of non-zero elements, **without using extra space**.

## Complexity Analysis

- Time `O(n)` — each element is visited once.
- Space `O(1)` — no extra data structures are used.

## Notes

- This is the most space-efficient solution.
- Relative order of non-zero elements is maintained.
- Simple and fast for practical use.
