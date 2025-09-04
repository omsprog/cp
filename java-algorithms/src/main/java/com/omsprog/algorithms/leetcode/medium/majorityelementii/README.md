## Approach

1. Initialize a `HashMap` to count the frequency of each element in the array.
2. Traverse the array and update counts in the map.
3. After counting, iterate through the map entries and add elements whose count is greater than `n/3` to the result list.
4. Return the result list.

## Complexity Analysis

- Time: `O(n)`
    - One pass to count frequencies and one pass to filter majority elements.

- Space: `O(n)`
    - A HashMap stores counts of all unique elements.

## Notes

- This solution is simple and easy to understand but **not space-optimal**.
- An optimal solution exists using the **Boyer-Moore Voting Algorithm** variant with O(1) extra space, since there can be at most 2 elements appearing more than n/3 times.
- Good for interviews when simplicity is acceptable and n is moderate.
