## Approach

1. Use a `Map<Integer, Integer>` called `memory` to store the frequency of each even number in the array.
2. Iterate through the array `nums`:
    - If the number is even:
        - Increment its count in `memory` if it already exists.
        - Otherwise, add it to `memory` with count 1.
3. Initialize variables `num = -1` and `freq = 0` to track the most frequent even number and its frequency.
4. Iterate through the entries in `memory`:
    - If the current number's frequency is higher than `freq`, update `num` and `freq`.
    - If the current number's frequency equals `freq` but its value is smaller than `num`, update `num` to the smaller number (tie-breaker).
5. Return `num`, which is the most frequent even number (or the smallest one in case of a tie).

## Complexity Analysis

- Time: `O(n)` — One pass to build the frequency map and one pass over the map entries (`n` = array length).
- Space: `O(n)` — In the worst case, the map stores all even numbers in the array.

## Notes

- Returns `-1` if there are no even numbers.
- The solution ensures that if multiple even numbers have the same maximum frequency, the smallest one is chosen.
- Using a `Map` allows efficient counting and easy tie-breaking.
