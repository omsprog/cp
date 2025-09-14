## Approach

This solution uses a **sliding window** to find the longest "beautiful" substring, defined as a substring containing all five vowels in order.  
We maintain a frequency array of the five vowels within the current window. As we expand the window with `right`, we check if the order of vowels is preserved.  
If the current character violates the ascending vowel order, we reset the window starting from `right`.  
Whenever the frequency array indicates that all five vowels are present, we update the maximum length.  
This approach allows scanning the string in a single pass while tracking both order and presence of vowels efficiently.

## Complexity Analysis

- Time: `O(n)`, where n is the length of the input string `word`. Each character is processed once.
- Space: `O(1)`, the frequency array always has a fixed size of 5 regardless of input size.

## Notes

- The `indexOfVowel` helper maps vowels to indices for quick access in the frequency array.
- `isBeautifulString` checks if all five vowels are present in the current window.
- The algorithm resets the window when the vowel order is broken, which ensures correctness without checking all substrings.
- Works efficiently for long strings since it only maintains a fixed-size array and two pointers.  
