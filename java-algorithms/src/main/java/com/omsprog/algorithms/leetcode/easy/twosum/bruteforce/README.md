## Approach

This is a brute force solution that checks every possible pair in the array to see if their sum equals the target.  
It uses two nested loops: for each element, it checks all subsequent elements for a match.

## Complexity Analysis

    - Time: `O(n ^ 2)`
    - Space: `O(1)`

## Notes

    - This solution is straightforward but inefficient for large inputs.
    - An optimized solution uses a HashMap to achieve O(n) time complexity.