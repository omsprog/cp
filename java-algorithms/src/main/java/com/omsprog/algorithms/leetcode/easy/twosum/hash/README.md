## Approach

This solution uses a HashMap to store previously seen numbers and their indices.  
For each element, it checks if the complement (`target - current number`) is already in the map.  
If yes, it returns the indices immediately, achieving a one-pass O(n) solution.

## Complexity Analysis

Time: `O(n)`
Space: `O(n)`

## Notes

    - This is the optimal solution for the Two Sum problem in terms of time complexity.