from typing import List

class ValidMountainArray:
    def validMountainArray(self, arr: List[int]) -> bool:
        if len(arr) < 3:
            return False

        last_increasing_index = 0
        last_decreasing_index = 0

        for a in range(len(arr) - 1):
            if not (arr[a] < arr[a + 1]):
                last_increasing_index = a
                break

        if last_increasing_index == 0:
            return False

        for b in range(len(arr) - 1, 0, -1):
            if not (arr[b - 1] > arr[b]):
                last_decreasing_index = b
                break

        if last_decreasing_index == len(arr) - 1:
            return False

        return last_increasing_index == last_decreasing_index