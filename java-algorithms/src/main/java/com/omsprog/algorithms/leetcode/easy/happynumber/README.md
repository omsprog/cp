## Approach

- Use a helper method `getNext(int n)` to compute the **sum of squares of digits** of a number.
    - Extract each digit using `n % 10`.
    - Square it and add to a running sum.
    - Remove the last digit using `n / 10`.
- Maintain a `Set<Integer>` to **track numbers seen** in the sequence.
    - If a number repeats → cycle detected → return `false`.
    - If the number becomes `1` → happy number → return `true`.
- Iteratively apply `getNext()` until reaching `1` or detecting a cycle.

## Complexity Analysis

- Time: `O(k * log n)`
    - `k` = number of iterations until reaching 1 or a cycle.
    - `log n` = number of digits in the number (each digit is processed in `getNext()`).
- Space: `O(k)`
    - `Set` stores all numbers in the sequence to detect cycles.

## Notes

- Avoids converting numbers to strings for digit extraction → faster and more memory efficient.
- Separates logic cleanly: `getNext()` handles digit processing, `isHappy()` handles cycle detection.
- Optional optimization: Use **Floyd’s cycle detection** to reduce space to O(1).
