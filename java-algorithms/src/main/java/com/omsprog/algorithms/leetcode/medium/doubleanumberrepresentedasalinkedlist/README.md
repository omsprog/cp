## Approach

1. **Push values into a stack:**
    - Traverse the linked list and push each digit into a stack to allow processing from the least significant digit.

2. **Process doubling with carry:**
    - Pop digits from the stack one by one.
    - Double each digit and add any carry from the previous step.
    - If the result is 10 or greater, keep the last digit and set carry = 1; otherwise, carry = 0.
    - Build the new linked list in reverse order by prepending nodes.

3. **Handle leftover carry:**
    - If a carry remains after processing all digits, prepend a new node with value `1`.

4. Return the newly built linked list.

## Complexity Analysis

- Time: `O(n)`
    - Each node is pushed and popped once from the stack.

- Space: `O(n)`
    - The stack requires extra memory proportional to the number of digits.

## Notes

- The stack simulates reverse traversal in a singly linked list.
- Correctly handles cases where doubling introduces an extra digit (e.g., `999 → 1998`).
- An alternative approach reverses the linked list, performs the doubling in place, and reverses it back, reducing space usage to O(1).
- This stack-based solution is straightforward, clean, and interview-friendly.
