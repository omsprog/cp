from typing import List

class ContainerWithMostWaterOptimal:
    def maxArea(self, height: List[int]) -> int:
        pointer_a = 0
        pointer_b = len(height) - 1
        area = 0

        while pointer_a != pointer_b:
            l_area = (pointer_b - pointer_a) * min(height[pointer_a], height[pointer_b])
            area = max(l_area, area)
            if height[pointer_a] < height[pointer_b]:
                pointer_a = pointer_a + 1
            else:
                pointer_b = pointer_b - 1

        return area