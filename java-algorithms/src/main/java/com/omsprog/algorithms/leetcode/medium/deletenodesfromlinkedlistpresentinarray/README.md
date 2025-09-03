## Approach

Store all values to delete in a `HashSet` for O(1) lookup.  
Use a dummy node pointing to the original head to simplify deletion of the head.  
Traverse the list with a pointer `current`. For each node:
- If `current.next.val` is in the `HashSet`, skip it by doing `current.next = current.next.next`.
- Otherwise, move `current` forward.  
  Return `dummyNode.next` as the new head.

## Complexity Analysis

- Time: `O(n + m)`, where n is the number of nodes in the list and m is the size of the array.
- Space: `O(m)`, for storing the values in the `HashSet`.

## Notes

- The dummy node avoids special handling of the head.
- All deletions are done in-place with respect to the node pointers.
- Each node is visited exactly once.
