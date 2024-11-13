from src.sign_of_the_product_of_an_array import SignOfTheProductOfAnArray

def test_arraySign():
    sOTPOAA = SignOfTheProductOfAnArray()
    
    assert sOTPOAA.arraySign([-1,-2,-3,-4,3,2,1]) == 1
    assert sOTPOAA.arraySign([1,5,0,2,-3]) == 0
    assert sOTPOAA.arraySign([-1,1,-1,1,-1]) == -1