## Approach

We use recursion:
- **Base case**: if `head == null` or `head.next == null`, return `head` (the new head of the reversed list).
- **Recursive step**: call `reverseList(head.next)` to reverse the rest of the list.
- After recursion returns, set `head.next.next = head` to reverse the link and `head.next = null` to break the original connection.
- Return the `newHead` from recursion.

## Complexity Analysis

- Time: `O(n)`, since each node is processed once.
- Space: `O(n)`, because the recursion stack can go as deep as the length of the list.

## Notes

- The key trick is `head.next.next = head` which flips th
