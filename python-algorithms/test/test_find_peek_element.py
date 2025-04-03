from src.find_peak_element import FindPeekElement

def test_findPeakElement():
    fPE = FindPeekElement()
    assert fPE.findPeakElement([1,2,3,1]) == 2
    assert fPE.findPeakElement([1,2,1,3,5,6,4]) == 5