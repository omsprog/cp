from typing import List

class TwoSumOptimal:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        auxDic = {}
        index = 0
        for val in nums:
            if target - val in auxDic:
                return [auxDic[target - val], index] 
            else:
                auxDic[val] = index
            index+=1