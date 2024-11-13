# 1 if x is positive.
# -1 if x is negative.
# 0 if x is equal to 0.

from typing import List

class SignOfTheProductOfAnArray:
    def arraySign(self, nums: List[int]) -> int:
        signCounter = 0
        for currVal in nums:
            if(currVal == 0):
                return 0
            if(currVal < 0):
                signCounter += 1
        return 1 if signCounter % 2 == 0 else -1