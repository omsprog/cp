from src.container_with_most_water_brute_force import ContainerWithMostWaterBruteForce

def test_max_area():
    cW = ContainerWithMostWaterBruteForce()
    assert cW.maxArea([1,8,6,2,5,4,8,3,7]) == 49
    assert cW.maxArea([1,1]) == 1
