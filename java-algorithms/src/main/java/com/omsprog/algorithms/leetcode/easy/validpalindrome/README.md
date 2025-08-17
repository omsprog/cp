## Approach

We use a **two-pointer technique** with `left` starting at the beginning of the string and `right` starting at the end.  
At each step:
1. Move `left` forward until it points to a letter or digit.
2. Move `right` backward until it points to a letter or digit.
3. Compare the characters at `left` and `right` (case-insensitive).
    - If they differ, return `false`.
    - If they match, move both pointers closer (`left++`, `right--`).
4. Continue until the pointers cross.

If no mismatch is found, the string is a valid palindrome.

## Complexity Analysis

Time: `O(n)`

Space: `O(1)`


## Notes

- Using a character array (`toCharArray()`) provides faster access than repeatedly calling `s.charAt()`, but at the cost of **extra O(n) space**.