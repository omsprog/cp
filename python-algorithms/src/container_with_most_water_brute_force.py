from typing import List

class ContainerWithMostWaterBruteForce:
    def maxArea(self, height: List[int]) -> int:
        area = 0

        for i in range(len(height)):
            for j in range(i + 1, len(height)):
                local_area = (j - i) * min(height[i], height[j])
                area = max(area, local_area)

        return area