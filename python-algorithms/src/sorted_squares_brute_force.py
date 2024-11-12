from typing import List

class SortedSquaresBruteForce:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        sortedArray = []
        for val in nums:
            sortedArray.append(val*val)
        sortedArray.sort()
        return sortedArray