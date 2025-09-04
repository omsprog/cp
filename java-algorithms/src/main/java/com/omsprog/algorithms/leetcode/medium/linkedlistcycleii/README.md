## Approach

1. Initialize a `HashSet` to store visited nodes.
2. Traverse the linked list node by node using a pointer `cNode`.
3. For each node:
    - If the node is already in the set, return it (this is the start of the cycle).
    - Otherwise, add the node to the set and continue.
4. If traversal reaches `null`, return `null` (no cycle exists).

## Complexity Analysis

- Time: `O(n)`
    - Each node is visited at most once.

- Space: `O(n)`
    - The hash set may store up to all nodes in the list in the worst case.

## Notes

- This is the **naive approach** to Linked List Cycle II.
- Simple and intuitive, but uses extra memory compared to the optimal fast & slow pointer method.
- Works for both even and odd-length lists and handles all edge cases.
