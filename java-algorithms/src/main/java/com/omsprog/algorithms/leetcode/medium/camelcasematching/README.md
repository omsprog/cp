## Approach

We need to check if each query matches the given `pattern` under camelcase rules.
- Convert the `pattern` into a character array (`charsInPattern`).
- For each query:
    - Convert it into a character array (`charsInQuery`).
    - Use two pointers:
        - `a` → iterates through the pattern characters.
        - `b` → iterates through the query characters.
    - For each pattern character:
        - If it matches the current query character -> advance both pointers.
        - Otherwise, advance `b` until a match is found, ensuring that any skipped uppercase characters in the query cause failure.
    - After processing the pattern, ensure no extra uppercase letters remain in the query.

If all these conditions hold, the query matches the pattern.

## Complexity Analysis

Time:

- Each query is scanned at most once by pointer `b`.
- For `m = queries.length`, `n = average length of queries`, and `p = length of pattern`, the total time is **O(m · (n + p))**, which simplifies to **O(m·n)** in practice.

Space:

- Each query and the pattern are converted to character arrays: **O(n + p)** per query.
- Result list uses **O(m)** space.
- Overall space complexity: **O(m + n + p)**.
- If we avoided `toCharArray()` and worked directly with `charAt`, we could reduce space to **O(1)** per query (excluding output list).

## Notes

- This approach enforces camelcase rules:
    - All uppercase characters in the pattern must match directly.
    - Lowercase characters in the query may be skipped.
- Using `toCharArray()` simplifies indexing and avoids repeated `charAt()` calls but costs extra memory.
- An optimized version could work directly with `String.charAt()` to reduce space to constant per query.
