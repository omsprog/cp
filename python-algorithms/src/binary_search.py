from typing import List

class BinarySearch:
    def search(self, nums: List[int], target: int) -> int:
        pointerA = 0
        pointerB = len(nums) -1

        while pointerA <= pointerB:
            midPoint = (pointerA + pointerB) // 2
            
            if nums[midPoint] > target:
                pointerB = midPoint - 1
                
            if nums[midPoint] < target:
                pointerA = midPoint + 1

            if nums[midPoint] == target:
                return midPoint
        return -1