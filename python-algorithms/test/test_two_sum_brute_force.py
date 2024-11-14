from src.two_sum_brute_force import TwoSumBruteForce

def test_twoSum():
    tSBF = TwoSumBruteForce()
    assert tSBF.twoSum([2,7,11,15], 9) == [0,1]
    assert tSBF.twoSum([3,2,4], 6) == [1,2]