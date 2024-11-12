from src.monotonic_array import MonotonicArray

def test_isMonotonic():
    mA = MonotonicArray()

    input1 = [1,2,2,2,3,6,78]
    input2 = [1,100,2,6,78]
    input3 = [897,2,34,4,5,6,78]
    input4 = [400,200,100,50,20,10,1]

    assert mA.isMonotonic(input1) == True
    assert mA.isMonotonic(input2) == False
    assert mA.isMonotonic(input3) == False
    assert mA.isMonotonic(input4) == True