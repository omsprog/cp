## Problems

### Arrays

1. [Find All Duplicates in an Array](https://leetcode.com/problems/find-all-duplicates-in-an-array) Medium
   - Time `O(n)` Space `O(1)`
2. [Determine Whether Matrix Can Be Obtained By Rotation](https://leetcode.com/problems/determine-whether-matrix-can-be-obtained-by-rotation) Easy
   - Time `O(n ^ 2)` Space `O(1)`
3. [Transpose Matrix](https://leetcode.com/problems/transpose-matrix) Easy
   - Time `O(rows * cols)` Space `O(rows * cols)`
4. [Spiral Matrix](https://leetcode.com/problems/spiral-matrix) Medium
   - Time `O(m * n)` Space `O(m * n)`
5. [Spiral Matrix II](https://leetcode.com/problems/spiral-matrix-ii) Medium
   - Time `O(n ^ 2)` Space `O(n ^ 2)`
6. [Spiral Matrix IV](https://leetcode.com/problems/spiral-matrix-iv) Medium
   - Time `O(m * n)` Space `O(m * n)`
7. [Maximum Area of Longest Diagonal Rectangle](https://leetcode.com/problems/maximum-area-of-longest-diagonal-rectangle) Easy
   - Time `O(n)` Space `O(1)`
8. [Valid Sudoku](https://leetcode.com/problems/valid-sudoku) Medium
   - Time `O(81)` Space `O(1)`
9. [Check if Every Row and Column Contains All Numbers](https://leetcode.com/problems/check-if-every-row-and-column-contains-all-numbers) Easy
   - Time `O(n ^ 2)` Space `O(n ^ 2)`
10. [Sort Matrix by Diagonals](https://leetcode.com/problems/sort-matrix-by-diagonals) Medium
    - Time `O(n ^ 2 log n)` Space `O(n)`
11. [Rotate Image](https://leetcode.com/problems/rotate-image) Medium
    - Time: `O(n ^ 2)` Space `O(1)`

### Hash and Set

1. [Two Sum](https://leetcode.com/problems/two-sum) Easy
   - Time `O(n ^ 2)` Space `O(1)` - Brute Force
   - Time `O(n)` Space `O(n)` - Hash Map
2. [Set Matrix Zeroes](https://leetcode.com/problems/set-matrix-zeroes) Medium
   - Time `O(m * n)` Space `O(m + n)` - Hash Set
3. [Happy Number](https://leetcode.com/problems/happy-number) Easy
   - Time `O(k * log n)` Space `O(k)`
4. [Jewels and Stones](https://leetcode.com/problems/jewels-and-stones) Easy
   - Time `O(n + m)` Space `O(n)`
5. [Majority Element II](https://leetcode.com/problems/majority-element-ii) Medium
   - Time `O(n)` Space `O(n)`

### Two Pointers

1. [3Sum](https://leetcode.com/problems/3sum) Medium
   - Time `O(n ^ 2)` Space `O(log n)` (Java’s dual-pivot quicksort for primitives)
2. [Valid Palindrome](https://leetcode.com/problems/valid-palindrome) Easy
   - Time `O(n)` Space `O(1)`
3. [Camelcase Matching](https://leetcode.com/problems/camelcase-matching) Medium
   - Time `O(m · (n + p))` Space `O(m + n + p)`
4. [Palindrome Number](https://leetcode.com/problems/palindrome-number) Easy
   - Time `O(n)` Space `O(n)`
5. [Container With Most Water](https://leetcode.com/problems/container-with-most-water) Medium
   - Time `O(n)` Space `O(1)`
6. [Move Zeroes](https://leetcode.com/problems/move-zeroes) Easy
   - Time `O(n)` Space `O(1)` Two Pointers I
   - Time `O(n)` Space `O(n)` Queue
   - Time `O(n)` Space `O(1)` Two Pointers II

### Linked List

1. [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list) Easy
   - Time `O(n)` Space `O(1)` Iterative
   - Time `O(n)` Space `O(n)` Recursive
2. [Remove Nth Node From End of List](https://leetcode.com/problems/remove-nth-node-from-end-of-list) Medium
   - Time `O(L)` Space `O(1)` Two passes
   - Time `O(L)` Space `O(1)` Fast and slow pointers
3. [Intersection of Two Linked Lists](https://leetcode.com/problems/intersection-of-two-linked-lists) Easy
   - Time `O(lenA + lenB)` Space `O(lenA)` Set
   - Time `O(lenA + lenB)` Space `O(1)` Combination of list1 and list2
4. [Delete Nodes From Linked List Present in Array](https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array) Medium
   - Time `O(n + m)` Space `O(m)` Delete nodes in-place
5. [Palindrome Linked List](https://leetcode.com/problems/palindrome-linked-list) Easy 
   - Time `O(n)` Space `O(n/2)` Stack approach
   - Time `O(n)` Space `O(1)` Fast and slow pointers
6. [Linked List Cycle II](https://leetcode.com/problems/linked-list-cycle-ii) Medium
   - Time `O(n)` Space `O(n)` HashSet
7. [Reverse Linked List II](https://leetcode.com/problems/reverse-linked-list-ii) Medium
   - Time `O(n)` Space `O(1)`
8. [Merge Nodes in Between Zeros](https://leetcode.com/problems/merge-nodes-in-between-zeros) Medium
   - Time `O(n)` Space `O(1)`
9. [Merge In Between Linked Lists](https://leetcode.com/problems/merge-in-between-linked-lists) Medium
   - Time `O(n + m)` Space `O(1)`
10. [Double a Number Represented as a Linked List](https://leetcode.com/problems/double-a-number-represented-as-a-linked-list) Medium
    - Time `O(n)` Space `O(n)`
11. [Remove Nodes From Linked List](https://leetcode.com/problems/remove-nodes-from-linked-list) Medium
    - Time `O(n)` Space `O(n)`

### Fast and Slow pointers

1. [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list) Easy
   - Time `O(n)` Space `O(1)` Fast and slow pointers
   - Time `O(n)` Space `O(1)` Count and get
2. [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle) Easy
   - Time `O(n)` Space `O(1)`

### Sliding Window

1. [Maximum Average Subarray I](https://leetcode.com/problems/maximum-average-subarray-i) Easy
   - Time `O(n)` Space `O(1)` Build and Slide (Fixed sliding window)
   - Time `O(n)` Space `O(1)` Fixed sliding window
2. [Contains Duplicate II](https://leetcode.com/problems/contains-duplicate-ii) Easy
   - Time `O(n)` Space `O(min(n, k))` Fixed sliding window
3. [Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold](https://leetcode.com/problems/number-of-sub-arrays-of-size-k-and-average-greater-than-or-equal-to-threshold) Medium
   - Time `O(n)` Space `O(1)` Fixed sliding window

### Math

1. [Add Digits](https://leetcode.com/problems/add-digits) Easy
   - Time `O(k * log n)` Space `O(1)`
2. [Count the Digits That Divide a Number](https://leetcode.com/problems/count-the-digits-that-divide-a-number) Easy
   - Time `O(n)` Space `O(1)`
3. [Find Closest Person](https://leetcode.com/problems/find-closest-person) Easy
   - Time `O(1)` Space `O(1)`

## TODO

- Optimize `Happy Number` to Space `O(1)` using Floyd’s cycle detection algorithm (Fast and slow pointers)
- Optimize `Remove Nodes From Linked List`, it can be solved in `O(1)` space
- https://leetcode.com/problems/lru-cache/

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