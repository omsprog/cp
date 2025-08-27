## Problems

### Arrays

1. [Find All Duplicates in an Array](https://leetcode.com/problems/find-all-duplicates-in-an-array) Medium
   - Time `O(n)` Space `O(1)`
2. [Determine Whether Matrix Can Be Obtained By Rotation](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation) Easy
   - Time `O(n^2)` Space `O(1)`
3. [Transpose Matrix](https://leetcode.com/problems/transpose-matrix) Easy
   - Time `O(rows * cols)` Space `O(rows * cols)`
4. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix) Medium
   - Time `O(m * n)` Space `O(m * n)`
5. [Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii) Medium
   - Time `O(n * n)` Space `O(n * n)`
6. [Spiral Matrix IV](https://leetcode.com/problems/spiral-matrix-iv) Medium
   - Time `O(m * n)` Space `O(m * n)`
7. [Maximum Area of Longest Diagonal Rectangle](https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle) Easy
   - Time `O(n)` Space `O(1)`

### Hash and Set

1. [Two Sum](https://leetcode.com/problems/two-sum) Easy
   - Time `O(n ^ 2)` Space `O(1)` - Brute Force
   - Time `O(n)` Space `O(n)` - Hash Map
2. [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes) Medium
   - Time `O(m * n)` Space `O(m + n)` - Hash Set
3. [Happy Number](https://leetcode.com/problems/happy-number) Easy
   - Time `O(k * log n)` Space `O(k)`

### Two Pointers

1. [3Sum](https://leetcode.com/problems/3sum) Medium
   - Time `O(n ^ 2)` Space `O(log n)` (Java’s dual-pivot quicksort for primitives)
2. [Valid Palindrome](https://leetcode.com/problems/valid-palindrome) Easy
   - Time `O(n)` Space `O(1)`
3. [Camelcase Matching](https://leetcode.com/problems/camelcase-matching) Medium
   - Time `O(m · (n + p))` Space `O(m + n + p)`
4. [Palindrome Number](https://leetcode.com/problems/palindrome-number)
   - Time `O(n)` Space `O(n)`

### Sliding Window

1. [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii) Easy
   - Time `O(n)` Space `O(min(n, k))` Fixed sliding window


## Tricks

- Convert a digit character to int: `int local = mToString.charAt(i) - '0';`

- Digit extraction using modulo and integer division:

```java
private int getNext(int n) {
    int res = 0;
    while (n > 0) {
        int digit = n % 10;
        res += digit * digit;
        n /= 10;
    }
    return res;
}
`````

## TODO

- Optimize `Happy Number` to Space `O(1)` using Floyd’s cycle detection algorithm