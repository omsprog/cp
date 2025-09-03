## Approach

1. Traverse the list once to count the total number of nodes.
2. Determine if the list length is even or odd.
3. Use a **stack** to store the first half of the list values.
4. Move a pointer to the start of the second half:
    - If the list is odd, skip the middle node.
5. Traverse the second half of the list, popping values from the stack and comparing them with the current node’s value.
6. If all values match and the stack is empty at the end, the list is a palindrome; otherwise, return false.

## Complexity Analysis

- Time: `O(n)`
    - Counting nodes: O(n)
    - Pushing first half into the stack: O(n/2)
    - Comparing second half with stack: O(n/2)
    - Total ≈ O(n)

- Space: `O(n/2)`
    - Stack stores half of the list values.

## Notes

- Uses extra memory proportional to half the list size.
- Works for both even and odd length lists.
- Simple to implement but less space-efficient than the fast & slow pointer approach.
- Handles edge cases (0 or 1 node) implicitly.
