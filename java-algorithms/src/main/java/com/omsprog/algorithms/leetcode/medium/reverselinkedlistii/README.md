## Approach

1. Handle the trivial case where `left == right` — no reversal needed.
2. Use a **dummy node** (`ptrAux`) to simplify edge cases, especially when reversing from the head.
3. Traverse the list to reach the node **just before position `left`** (`ptr`).
4. Initialize pointers for reversal:
    - `prev = null`
    - `curr = ptr.next` (start of the sublist to reverse)
    - `currAux = curr` (to reconnect the end of the reversed sublist later)
5. Reverse the sublist between `left` and `right` using a standard iterative approach with `prev`, `curr`, and `next`.
6. Reconnect the reversed sublist:
    - `ptr.next = prev` → connects the node before the sublist with the new head of the reversed sublist.
    - `currAux.next = next` → connects the end of the reversed sublist with the remaining nodes.
7. Return `ptrAux.next` as the head of the updated list.

## Complexity Analysis

- Time: `O(n)`
    - Traverse the list to reach `left` and reverse the sublist once.

- Space: `O(1)`
    - Only uses a few pointers; no extra data structures.

## Notes

- Using a dummy node simplifies handling the head of the list.
- The approach works for both even and odd-length lists.
- Iterative reversal avoids recursion stack overhead.
- This pattern (dummy node + pointer manipulation) is common in linked list interview problems.
