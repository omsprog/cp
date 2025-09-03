## Approach

- Use a `HashSet` to store all the nodes from the first list (`headA`).
- Traverse the second list (`headB`) and check if any node already exists in the `HashSet`.
- The first node found in common is the intersection node.
- If no common node is found, return `null`.

## Complexity Analysis

- Time: `O(lenA + lenB)`
    - We traverse each list once.
- Space: `O(lenA)`
    - We store all nodes of list `A` in a `HashSet`.

## Notes

- This solution **does not achieve O(1) space**, but it is straightforward and easy to implement.
- To reduce space to O(1), you can use the **two-pointer cross technique** (A→B and B→A) that compensates for the difference in lengths and finds the intersection without extra memory.
- It works even if the lists have different lengths and if there is no intersection (returns `null`).
