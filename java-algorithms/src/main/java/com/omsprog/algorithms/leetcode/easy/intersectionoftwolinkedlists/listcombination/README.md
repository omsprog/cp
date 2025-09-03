## Approach

- Use two pointers, `pointerA` and `pointerB`, starting at `headA` and `headB`.
- Move both pointers forward one node at a time.
- When a pointer reaches the end of its list (`null`), redirect it to the head of the other list.
- Continue moving the pointers until they meet.
- If the lists intersect, the pointers will meet at the intersection node.
- If they do not intersect, both pointers will eventually be `null` and the loop ends.

## Complexity Analysis

- Time: `O(lenA + lenB)`
    - Each pointer traverses each list at most once.
- Space: `O(1)`
    - Only two pointers are used; no extra memory is required.

## Notes

- This solution works regardless of whether the two lists have different lengths.
- Redirecting the pointers ensures both traverse the same total distance, aligning them at the intersection node.
- This is the standard **O(1) space** solution for finding the intersection of two singly linked lists.
- The solution always terminates, unlike implementations that incorrectly check `pointer.next == null`.
