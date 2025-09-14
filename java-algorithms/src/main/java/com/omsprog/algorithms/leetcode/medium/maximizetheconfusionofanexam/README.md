## Approach

This solution uses a **dynamic sliding window** to find the maximum length of a substring where at most `k` characters can be flipped to make all characters the same.  
We maintain two counters: `counterT` for 'T' and `counterF` for 'F' within the current window `[left, right]`.  
As we expand the window with `right`, we update the counters based on the current character.  
If the window becomes invalid (i.e., more than `k` flips would be needed), we shrink the window from the left until it becomes valid again.  
At each step, the window size represents the maximum consecutive substring satisfying the condition, and we update the global maximum accordingly.

## Complexity Analysis

- Time: `O(n)`, where n is the length of `answerKey`. Each character is processed at most twice, once when added and once when removed.
- Space: `O(1)`, only a few integer counters are used regardless of input size.

## Notes

- The helper `isValidWindow` determines if the current window can be made uniform with at most `k` flips.
- This is an example of a **dynamic sliding window**, as the left pointer moves conditionally based on the window validity.
- Efficient because it avoids checking all substrings explicitly, maintaining counters for a single pass through the string.  
