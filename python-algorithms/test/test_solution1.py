from src.solution1 import add

def test_add():
    print("Hello world")  
    assert add(2, 3) == 5
    assert add(-1, 1) == 0
    assert add(0, 0) == 0