## Approach

This solution uses a **dynamic sliding window** to count all contiguous subarrays whose product is less than `k`.  
We maintain a running `product` for the current window `[left, right]`. As we expand the window by moving `right`, we multiply the current element into the product.  
If the product becomes greater than or equal to `k`, we shrink the window from the left until the product is below `k`.  
At each step, the number of valid subarrays ending at `right` is equal to the window length `right - left + 1`, which we accumulate into the result.

## Complexity Analysis

- Time: `O(n)`, where n is the length of `nums`. Each element is multiplied and divided at most once.
- Space: `O(1)`, using only a few integer variables to track pointers, product, and result.

## Notes

- Handles the edge case where `k <= 1` explicitly, because no subarray can have a product less than 1 given all elements are ≥ 1.
- The approach avoids enumerating all subarrays explicitly, counting them efficiently using the window size.
- This is an example of a **dynamic sliding window** where the left boundary moves conditionally based on a cumulative product constraint.  
