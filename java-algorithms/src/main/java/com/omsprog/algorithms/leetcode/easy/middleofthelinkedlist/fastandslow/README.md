## Approach

1. Initialize two pointers:
    - `slow` moves one step at a time.
    - `fast` moves two steps at a time.
2. Traverse the list until `fast` reaches the end or `fast.next` becomes null.
3. At that point, `slow` will be pointing at the middle node:
    - If the list length is odd, `slow` is at the exact middle.
    - If the list length is even, `slow` is at the second middle node.
4. Return `slow`.

## Complexity Analysis

- Time `O(n)`
    - Both pointers traverse the list in a single pass.

- Space `O(1)`
    - Only two pointers are used.

## Notes

- More efficient than the counting method since it only requires one pass.
- Always returns the second middle node when the list has an even length.
- A standard pattern known as the "fast and slow pointer" or "tortoise and hare" technique.  
