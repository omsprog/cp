## Approach

Use a global frequency-count strategy.  
Traverse all arrays and count how many times each number appears using a HashMap. Then collect the numbers whose frequency equals the total number of arrays. Finally, sort the result.

## Complexity Analysis

- Time: `O(T + k log k)` — count all elements (T total elements) and sort result (k common elements)
- Space: `O(U)` — store unique elements in the map

## Notes

- Counts presence across all arrays
- Sorting ensures ordered output
- Efficient lookup using hashing
