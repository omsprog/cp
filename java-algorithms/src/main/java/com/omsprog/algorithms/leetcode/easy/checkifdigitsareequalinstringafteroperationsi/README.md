## Approach

Iteratively reduce the string until only 2 digits remain.  
In each step, build a new string where each digit is the sum of two adjacent digits modulo 10.  
When the string length becomes 2, return whether both digits are equal.

## Complexity Analysis

- Time: `O(n ^ 2)` — each reduction takes O(n), and the string shrinks by 1 each time.
- Space: `O(n)` — for the temporary string during each iteration.

## Notes

The process simulates repeated digit-pair reduction until reaching a base case of 2 digits.