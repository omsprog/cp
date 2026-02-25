## Approach

Use binary search over the version range to exploit the monotonic property (once a version is bad, all following versions are bad).  
Shrink the search space toward the left whenever a bad version is found to ensure the first bad version is returned.

## Complexity Analysis

- Time `O(log n)` — The search space is halved on each iteration.
- Space `O(1)` — Only constant extra variables are used.

## Notes

- The midpoint is computed as `l + (r - l) / 2` to avoid integer overflow.
- This is a standard “first occurrence” binary search pattern.