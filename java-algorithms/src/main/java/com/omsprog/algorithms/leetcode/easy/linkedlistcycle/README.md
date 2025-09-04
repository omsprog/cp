## Approach

1. Handle edge cases: if the list is empty or has only one node, return false (no cycle possible).
2. Initialize two pointers:
    - `slow` starts at `head` and moves one step at a time.
    - `fast` starts at `head.next` and moves two steps at a time.
3. Traverse the list while `fast` and `fast.next` are not null:
    - If `slow` and `fast` meet, return true (cycle detected).
    - Otherwise, move `slow` by one and `fast` by two.
4. If traversal ends without pointers meeting, return false.

## Complexity Analysis

- Time: `O(n)`
    - In the worst case, both pointers may traverse the entire list before detecting a cycle or reaching the end.

- Space: `O(1)`
    - Only two pointers are used regardless of list size.

## Notes

- This is Floyd’s Cycle Detection algorithm (tortoise and hare).
- Your initialization (`fast = head.next`) avoids a false positive on the very first iteration.
- Optimal solution: detects cycles without extra memory, unlike a hash-based approach.  
