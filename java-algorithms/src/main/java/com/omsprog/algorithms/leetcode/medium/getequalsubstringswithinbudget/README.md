## Approach

This solution uses a **dynamic sliding window** to find the longest substring of `s` that can be changed to match `t` within a given `maxCost`.  
We maintain a running `cost` for the current window `[left, right]`, where `cost` is the sum of absolute differences between corresponding characters in `s` and `t`.  
As we expand the window with `right`, we add the cost of the new character pair.  
If the total cost exceeds `maxCost`, we shrink the window from the left until the cost is within the limit.  
The length of the current valid window represents a candidate for the maximum equal substring, which we track and update dynamically.

## Complexity Analysis

- Time: `O(n)`, where n is the length of `s` (or `t`). Each character is processed at most twice, once when added and once when removed.
- Space: `O(1)`, using only a few integer variables to track pointers, cost, and maximum length.

## Notes

- The `calculateCost` helper computes the cost to convert one character to another.
- This is a **dynamic sliding window** problem because the left boundary moves conditionally based on the accumulated cost.
- Efficient because it avoids checking all possible substrings explicitly and computes the maximum length in a single pass.  
