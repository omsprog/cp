## Approach

1. Initialize `newHead` and `tail` as `null`, and `accum` to accumulate node values between zeros.
2. Traverse the linked list:
    - If `head.val == 0` and `accum != 0`:
        - Create a new node with value `accum`.
        - Append it to the new list using `tail`.
        - Reset `accum` to 0.
    - Otherwise, add `head.val` to `accum`.
3. Continue until the end of the list.
4. Return `newHead` as the head of the merged list.

## Complexity Analysis

- Time: `O(n)`
    - Each node is visited exactly once.

- Space: `O(1)` (ignoring the output list)
    - Only a few pointers and an integer accumulator are used.
    - New nodes are part of the result, not extra auxiliary space.

## Notes

- Assumes the input list always starts and ends with a zero.
- Merges sequences of nodes between zeros by summing their values.
- Maintains the original order of merged segments.
- Using `tail` pointer avoids traversing the new list to append each node.
