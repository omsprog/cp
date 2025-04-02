## Python Env

`python3 -m venv myenv`  
`source myenv/bin/activate`  
`pip list`  
`pip install pytest`  
`pip freeze > requirements.txt`  
`pytest -s test/test_solution1.py` # execute test case by name  
`deactivate` # inactivate virtualenv

## Problems

1. [Squares of a Sorted Array](https://leetcode.com/problems/squares-of-a-sorted-array/description/)
    - Brute Force `O(n log n)`
    - Linear algorithm `O(n)`
2. [Monotonic Array](https://leetcode.com/problems/monotonic-array/description/) `O(n)`
3. [K-th symbol in grammar](https://leetcode.com/problems/k-th-symbol-in-grammar/description/)
    - Brute Force `O(2 ^ n)`  
    - Two Pointers (Binary Search Tree) `O(n)`
4. [Sign of the product of an array](https://leetcode.com/problems/sign-of-the-product-of-an-array/) `O(n)`
5. [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/) `O(n)`
6. [Two sum](https://leetcode.com/problems/two-sum/description/)
    - Brute Force `O(n ^ 2)`
    - Optimal using HashMap `O(n)` 
8. [Binary Search](https://leetcode.com/problems/binary-search/description/) 
   - `O(log n)`
9. [Sqrt](https://leetcode.com/problems/sqrtx) `O(log n)` 
10. [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/) `O(n)`

## Medium Problems

14. [Container With Most Water](https://leetcode.com/problems/container-with-most-water) April 1, 2025
   - Brute Force `O(n ^ 2)`
   - Optimal Two Pointers `O(n)`
38. [Add Two Numbers](https://leetcode.com/problems/add-two-numbers/) April 1, 2025
    - `O(n)`