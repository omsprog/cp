## Approach

We first compute the total length of the linked list with a traversal.  
Knowing the length, we can determine the position of the node to remove counting from the beginning:  

`targetPosition = listLength - n`.

- If the node to remove is the head (`targetPosition == 0`), we simply return `head.next`.
- Otherwise, we traverse again until reaching the node right before the target position.
- We update the `next` pointer to skip the target node.

This ensures the node is removed correctly in all cases.

## Complexity Analysis

- Time: `O(L)`, where `L` is the length of the list. We traverse the list twice (once for length, once for removal).
- Space: `O(1)`, since we only use a few pointer variables.

## Notes

- This solution handles edge cases: removing the head, removing the last node, or removing a middle node.
- While it works, it requires two traversals of the list.
- A more optimized approach uses the two-pointer technique (fast & slow) to solve it in one pass.
