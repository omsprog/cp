## Approach

Convert the number to a string, then use a two-pointer technique to check for palindrome.
- Initialize two pointers, `l` at the start and `r` at the end of the string.
- Compare characters at `l` and `r`.
    - If they differ, return `false`.
    - Otherwise, move `l` forward and `r` backward.
- If all character pairs match, return `true`.

## Complexity Analysis

- Time `O(n)`, where n is the number of digits in `x`. Each digit is checked once.
- Space `O(n)`, due to conversion of the integer to a string.

## Notes

- Simple and easy to implement.
- Less optimal in space compared to numeric approaches because of string conversion.
- Works for all integers including single-digit numbers.
- Negative numbers automatically fail since their string representation contains `-`.  
