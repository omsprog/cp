## Approach

We reverse the linked list iteratively by maintaining three pointers: `previousNode`, `currentNode`, and `nextNode`.

1. `currentNode` traverses the list.
2. At each step, store the next node in `nextNode`.
3. Reverse the current node’s pointer: `currentNode.next = previousNode`.
4. Move `previousNode` and `currentNode` one step forward.
5. Repeat until `currentNode` becomes `null`.

At the end, `previousNode` will be the new head of the reversed list.

This works because each node’s pointer is reversed while keeping track of the rest of the list using `nextNode`. By the end, all links are reversed without losing any nodes.

## Complexity Analysis

- Time `O(n)`, we traverse each node once.
- Space `O(1)`, only a constant number of pointers are used.

## Notes

- In-place iterative reversal, no extra list is needed.
- Can also be done recursively, but iterative uses less space.
- Useful for problems like palindrome linked lists or merging reversed lists.
