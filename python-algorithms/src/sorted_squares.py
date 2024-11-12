from typing import List

class SortedSquares:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        sortedArray = []
        for val in nums:
            sortedArray.append(val*val)
        sortedArray.sort()
        return sortedArray