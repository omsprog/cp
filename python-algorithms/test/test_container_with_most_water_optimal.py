from src.container_with_most_water_optimal import ContainerWithMostWaterOptimal

def test_max_area():
    cW = ContainerWithMostWaterOptimal()
    assert cW.maxArea([1,8,6,2,5,4,8,3,7]) == 49
    assert cW.maxArea([1,1]) == 1

