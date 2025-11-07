## Approach

Convert the broken letters into a hash set for fast lookup, then split the sentence into words and check each word to see if it contains any broken letter. 
Count only the words that do not contain any broken character.

## Complexity Analysis

- Time: `O(n + m)`
  Where `n` is the total number of characters in the input text and `m` is the number of broken letters.  
  Building the set takes O(m), and scanning all characters across all words takes O(n).

- Space: `O(m)` 
  We store the broken letters in a hash set for O(m) space.

## Notes

- Uses a **simple scan** of each word to verify typeability.
- Broken letters are stored in a `HashSet` for O(1) lookup time.
- Splits the text using `" "` (space), assuming valid input formatting (single space separator).
