from src.two_sum_optimal import TwoSumOptimal

def test_twoSum():
    tSO = TwoSumOptimal()
    assert tSO.twoSum([2,7,11,15], 9) == [0,1]
    assert tSO.twoSum([3,2,4], 6) == [1,2]