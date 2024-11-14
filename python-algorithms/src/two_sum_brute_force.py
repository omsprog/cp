from typing import List

class TwoSumBruteForce:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        pointerA = 0
        pointerB = 1

        if(len(nums) == 2):
            return [0,1]
        
        for i in range(0, len(nums) - 1):
            pointerA = i
            pointerB = i + 1
            for _ in range(pointerB, len(nums)):
                if(nums[pointerA] + nums[pointerB] == target):
                    return [pointerA, pointerB]
                pointerB+=1