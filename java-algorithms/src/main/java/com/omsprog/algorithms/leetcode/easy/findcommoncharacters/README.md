## Approach

Use an incremental frequency-intersection strategy.  
Start by computing the character frequencies of the first word. Then, for each subsequent word, intersect its frequency map with the running map by keeping the minimum count for shared characters and removing non-common ones. Finally, build the result list based on the remaining frequencies.

## Complexity Analysis

- Time: `O(N * L)` — process each word (N words, average length L)
- Space: `O(1)` — at most 26 lowercase letters stored

## Notes

- Maintains running intersection of character counts
- Uses minimum frequency to handle duplicates
- Efficient due to limited alphabet size
