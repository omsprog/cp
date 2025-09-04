## Approach

We push all node values into a stack to process them from right to left.  
While popping values, we keep track of the maximum seen so far and rebuild a new linked list including only the nodes that are greater than or equal to this maximum.  
This way, nodes that are smaller than a later larger value are removed.

## Complexity Analysis

- Time: `O(n)` one pass to fill the stack and one pass to rebuild the list.
- Space: `O(n)` the stack stores all node values.

## Notes

- This approach is straightforward but not space optimal.
- An `O(1)` extra space solution exists using in-place reversal and processing.  
