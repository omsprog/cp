from src.binary_search import BinarySearch

def test_search():
    bS = BinarySearch()
    assert bS.search([-1,0,3,5,9,12], 9) == 4
    assert bS.search([2,5], 0) == -1
    assert bS.search([-1,0,3,5,9,12], 2) == -1
