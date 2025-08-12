## Approach

The solution first sorts the input array in ascending order.  
Then, it iterates through each element `nums[i]` (up to the third-last), skipping duplicates to avoid repeated triplets.  
For each `nums[i]`, it calls a helper method `twoSum` to find pairs `(b, c)` such that:

nums[i] + b + c = 0 => -nums[i] = b + c 

The `twoSum` method uses the **two-pointer technique**:

- Initialize `left` at `startIndex` and `right` at the last index.
- Move pointers inward based on whether the current sum is less than, greater than, or equal to the target.
- When a valid pair is found, it is added to the list and duplicates for the left pointer are skipped.

Finally, all found pairs are combined with `nums[i]` to form the triplets for the `threeSum` result.

## Complexity Analysis

Time: `O(n log n) + O(n) * O(n) = O(n ^ 2)`
Space: `O(log n)` (Java’s dual-pivot quicksort for primitives)

## Notes

- The duplicate skipping logic in `twoSum` only skips consecutive duplicates for the **left pointer**; duplicates for the `right` pointer are naturally avoided by pointer movement.
- Sorting ensures that duplicates can be skipped in linear time, and also enables the two-pointer technique to work efficiently.
- The algorithm is optimal for the `3Sum` problem — reducing the naive `O(n³)` brute-force approach to `O(n²)`.
- The `List.of(...)` calls create immutable lists, which is safe here since the triplet values will not be modified.