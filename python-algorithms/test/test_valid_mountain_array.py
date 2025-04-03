from src.valid_mountain_array import ValidMountainArray

def test_validMountainArray():
    vMA = ValidMountainArray()
    assert vMA.validMountainArray([2,1]) == False
    assert vMA.validMountainArray([3,5,5]) == False
    assert vMA.validMountainArray([0,3,2,1]) == True