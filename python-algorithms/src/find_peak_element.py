from typing import List

class FindPeekElement:
    def findPeakElement(self, nums: List[int]) -> int:
        if len(nums) == 1:
            return 0

        pointer_a = 0
        pointer_b = len(nums) - 1

        while pointer_a <= pointer_b:
            mid_point = pointer_a + (pointer_b - pointer_a) // 2
            if mid_point == 0 or mid_point == len(nums) - 1:
                if mid_point == 0:
                    return mid_point if nums[mid_point] > nums[mid_point + 1] else mid_point + 1
                else:
                    return mid_point if nums[mid_point] > nums[mid_point - 1] else mid_point - 1
            else:
                if nums[mid_point -1] < nums[mid_point] and nums[mid_point] > nums[mid_point + 1]:
                    return mid_point
                else:
                    if nums[mid_point] < nums[mid_point + 1]:
                        pointer_a = mid_point + 1
                    else:
                        pointer_b = mid_point - 1 
