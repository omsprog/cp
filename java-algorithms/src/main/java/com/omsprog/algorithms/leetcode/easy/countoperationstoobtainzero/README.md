## Approach

Use an iterative subtraction strategy.  
Repeatedly subtract the smaller number from the larger one until one of them becomes zero, counting each operation.

## Complexity Analysis

- Time: `O(max(num1, num2))` — repeated subtraction until one value reaches zero
- Space: `O(1)` — constant extra space

## Notes

- Equivalent to a subtraction-based Euclidean process
- Can be optimized using division (modulo) for fewer steps
- Pure iterative solution
