from typing import List

class BinarySearch:
    def search(self, nums: List[int], target: int) -> int:
        pointer_a = 0
        pointer_b = len(nums) -1

        while pointer_a <= pointer_b:
            mid_point = (pointer_a + pointer_b) // 2
            
            if nums[mid_point] == target:
                return mid_point
            elif nums[mid_point] > target:
                pointer_b = mid_point - 1  
            else:
                pointer_a = mid_point + 1
                
        return -1