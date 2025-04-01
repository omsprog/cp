from src.sorted_squares_brute_force import SortedSquaresBruteForce

def test_sortedSquares():
    sS = SortedSquaresBruteForce()

    input = [-4,-1,0,3,10]
    expected = [0,1,9,16,100]
    result = sS.sortedSquares(input)

    assert len(result) == len(expected)
    assert all([a == b for a, b in zip(result, expected)])