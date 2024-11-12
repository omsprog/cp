from typing import List

class SortedSquaresOptimal:
    def sortedSquares(self, nums: List[int]) -> List[int]:
        pointerA = 0
        pointerB = len(nums) - 1
        sortedArray = [None] * len(nums)

        for i in range(0, len(nums)):
            if(pointerA == pointerB):
                break;
            if(abs(nums[pointerA]) >= abs(nums[pointerB])):
                sortedArray[len(nums) -1 -i] = pow(nums[pointerA], 2)
                pointerA = pointerA + 1
            else:
                sortedArray[len(nums) -1 -i] = pow(nums[pointerB], 2)
                pointerB = pointerB - 1

        sortedArray[0] = pow(nums[pointerA], 2)
        return sortedArray