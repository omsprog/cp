class Sqrt:
    def mySqrt(self, x: int) -> int:
        if x < 2:
            return x
        
        pointer_a = 1
        pointer_b = x
        result  = 0

        while pointer_a <= pointer_b:
            mid_point = pointer_a + (pointer_b - pointer_a) // 2
            mid_point_calc = mid_point * mid_point

            if mid_point_calc == x:
                return mid_point
            elif mid_point_calc < x:
                result = mid_point
                pointer_a = mid_point + 1
            else:
                pointer_b = mid_point - 1

        return result