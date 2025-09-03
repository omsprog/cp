## Approach

We use the **two-pointer technique (fast and slow)** to find the Nth node from the end in a single pass.

1. Initialize both `fast` and `slow` pointers at the head.
2. Move the `fast` pointer `n` steps ahead.
3. If `fast` is `null` after this, it means the node to remove is the **head**, so we return `head.next`.
4. Otherwise, move both pointers one step at a time until `fast.next` is `null`.
    - At this point, `slow` is just before the node to remove.
5. Update `slow.next` to skip the target node.

Finally, return the updated `head`.

## Complexity Analysis

- Time Complexity `O(L)`, where `L` is the length of the linked list.
    - We make a single pass through the list.
- Space Complexity `O(1)`
    - Only a few pointers are used, no extra data structures.

## Notes

- This solution avoids the use of a dummy node by explicitly handling the case where the first node must be removed (`fast == null`).
- The two-pointer technique ensures we only traverse the list once.  
