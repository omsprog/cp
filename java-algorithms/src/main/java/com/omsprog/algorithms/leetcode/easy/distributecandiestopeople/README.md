## Approach

Use a direct simulation strategy.  
Model the problem exactly as described by incrementally distributing candies in increasing order while cycling through the array of people. The idea is to maintain state (current person and next amount to give) and update it until all candies are distributed.

## Complexity Analysis

- Time: `O(square(candies))`
- Space: `O(numPeople)`

## Notes

- This is an iterative simulation approach.
- No extra data structures are required beyond the result array.
- Can be optimized mathematically, but simulation is sufficient.
