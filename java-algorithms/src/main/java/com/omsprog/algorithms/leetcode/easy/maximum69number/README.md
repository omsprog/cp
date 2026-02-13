## Approach

Use a greedy digit-replacement strategy.  
Convert the number to a string and replace the first occurrence of '6' with '9', since changing the most significant possible digit maximizes the result. Keep the remaining digits unchanged.

## Complexity Analysis

- Time: `O(d)` — iterate once over the digits (d = number of digits)
- Space: `O(d)` — StringBuilder storage

## Notes

- Greedy works because higher-place digits have greater impact
- Only the first '6' should be replaced
- Could also be solved mathematically without string conversion
