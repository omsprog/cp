## Approach

1. Handle edge cases: if the list is empty or has only one node, return true.
2. Use **slow** and **fast** pointers to find the middle of the list:
    - `slow` moves one step at a time.
    - `fast` moves two steps at a time.
3. If the list has an odd number of nodes (`fast != null`), move `slow` one step forward to skip the middle node.
4. Reverse the second half of the list starting from `slow` using the `reverseList` helper.
5. Compare nodes from the first half (starting at `head`) with nodes from the reversed second half.
6. If all corresponding nodes match, return true; otherwise, return false.

## Complexity Analysis

- Time: `O(n)`
    - Finding the middle: O(n/2)
    - Reversing the second half: O(n/2)
    - Comparing halves: O(n/2)
    - Total ≈ O(n)

- Space: `O(1)`
    - Only a few pointers are used; no extra memory proportional to n.

## Notes

- This approach **modifies the list** by reversing its second half.
- To restore the original list, reverse the second half again at the end (optional).
- Works for both **even** and **odd** length lists.
- Handles edge cases (0 or 1 node) efficiently.
