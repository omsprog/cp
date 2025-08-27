## Approach

- Use **two pointers**, `left` at the start and `right` at the end, to explore all possible container widths efficiently.
- **Key insight**: The area is determined by the **shorter line** and the distance between pointers.
    - If you try to move the taller line inward, the width decreases but the height cannot increase beyond the shorter line, so the area cannot improve.
    - Therefore, to potentially find a larger area, always move the pointer pointing to the **shorter line** inward.
- By doing this, you **systematically eliminate suboptimal containers** without checking all pairs, ensuring the maximum area is found.

## Complexity Analysis

- Time: `O(n)`
    - Each pointer moves at most `n` steps, so linear time.
- Space: `O(1)`
    - Only a few integer variables used; no extra data structures.

## Notes

- This is a classic **Two Pointers problem**.
- The greedy choice of moving the shorter line ensures no possible maximum is skipped.
- Avoids brute-force O(n²) solution by exploiting the geometric constraints of the problem.
