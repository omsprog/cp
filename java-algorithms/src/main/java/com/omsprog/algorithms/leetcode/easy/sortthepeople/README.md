## Approach

The idea is to sort people based on their heights while preserving the association between names and heights.  
We use a HashMap to map each height to its corresponding name, sort the heights array, and then reconstruct the names array in descending order of height.  
This ensures that the tallest people appear first without losing track of who each height belongs to.

## Complexity Analysis

- Time: `O(n log n)`, where n is the length of the array `names`. Sorting the heights array dominates the runtime.
- Space: `O(n)`, due to the HashMap storing the mapping between heights and names.

## Notes

- Assumes that all heights are unique, which guarantees that the mapping in the HashMap is one-to-one.
- Could be optimized using a pair/tuple array instead of a HashMap, but the logic remains the same.  
