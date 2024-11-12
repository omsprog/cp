from typing import List

class MonotonicArray:
    def isMonotonic(self, nums: List[int]) -> bool:
        isMonotonic = True
        isAscending = None
        for i in range(0, len(nums) - 1):
            if(nums[i] > nums[i+1]):
                if(isAscending == True):
                    return False
                isAscending = False               
            if(nums[i] < nums[i+1]):
                if(isAscending == False):
                    return False
                isAscending = True

        return isMonotonic
