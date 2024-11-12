from src.sorted_squares_optimal import SortedSquaresOptimal

def test_sortedSquares():
    sS = SortedSquaresOptimal()

    input1 = [-4,-1,0,3,10]
    expected1 = [0,1,9,16,100]
    result1 = sS.sortedSquares(input1)

    assert len(result1) == len(expected1)
    assert all([a == b for a, b in zip(result1, expected1)])

    input2 = [-20,-19,-14,-12,-7,-5,2,2,4,6,6,7,8,9,10,12,17,17,18,18]
    expected2 = [4,4,16,25,36,36,49,49,64,81,100,144,144,196,289,289,324,324,361,400]
    result2 = sS.sortedSquares(input2)

    assert len(result2) == len(expected2)
    assert all([a == b for a, b in zip(result2, expected2)])