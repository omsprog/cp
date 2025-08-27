## Approach

- Use a helper method `sumDigits(int num)` to compute the **sum of digits** of a number.
    - Extract each digit using `num % 10`.
    - Add it to a running sum.
    - Remove the last digit using `num / 10`.
- In `addDigits(int num)`:
    - While `num` has more than one digit (`num > 9`), replace it with `sumDigits(num)`.
    - Continue until `num` is a single-digit number.
    - Return the single-digit result.

## Complexity Analysis

- Time `O(k * log n)`
    - `log n` = number of digits in `num` (each `sumDigits` call)
    - `k` = number of iterations until a single digit is obtained (bounded, ≤3 for 32-bit integers)
- Space `O(1)`
    - Only uses integer variables; no extra data structures.

## Notes

- This is a **digit manipulation problem** using modulo and division.
- Optional optimization: Use the **digital root formula** for O(1) solution: