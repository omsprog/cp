## Approach

1. Traverse the entire linked list once to count its length.
2. Compute the index of the middle node as `(length / 2) + 1`.
    - Integer division ensures that in case of even length, the second middle node is selected.
3. Traverse the list a second time until reaching the computed middle index.
4. Return the node at that position.

## Complexity Analysis

- Time `O(n)`
    - First traversal to count nodes: O(n).
    - Second traversal to reach the middle node: O(n/2).
    - Total ≈ O(n).

- Space `O(1)`
    - Only a few integer variables and pointers are used.

## Notes

- Requires two passes through the list, making it less efficient than the fast & slow pointer method.
- Always returns the second middle node for even-length lists, which aligns with the problem requirement.
- Simple to implement and easy to reason about.  
