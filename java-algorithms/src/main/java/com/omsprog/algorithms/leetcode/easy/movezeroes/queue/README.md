## Approach

We use a queue to temporarily store all non-zero elements.
1. Iterate over the array and `offer` each non-zero element into the queue.
2. Poll elements from the queue back into the array, filling from the start.
3. Fill the remaining positions in the array with zeros.

This ensures all zeros are moved to the end while maintaining the relative order of non-zero elements.

## Complexity Analysis

- Time `O(n)` — each element is visited at most twice (once to offer, once to poll).
- Space `O(n)` — the queue may store up to all non-zero elements.

## Notes

- This approach is simple and easy to understand.
- It preserves the relative order of non-zero elements.
- Slightly less space-efficient than the in-place two-pointer method.
