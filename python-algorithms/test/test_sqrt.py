from src.sqrt import Sqrt

def test_mySqrt():
    sqrt = Sqrt()
    assert sqrt.mySqrt(4) == 2
    assert sqrt.mySqrt(9) == 3
    assert sqrt.mySqrt(8) == 2
    assert sqrt.mySqrt(99) == 9