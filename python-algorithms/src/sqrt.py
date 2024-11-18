class Sqrt:
    def mySqrt(self, x: int) -> int:
        if x == 0:
            return 0
        
        pointerA = 1
        pointerB = x
        result  = 1

        while pointerA <= pointerB:
            midPoint = (pointerA + pointerB) // 2
            midPointCalc = midPoint * midPoint

            if midPointCalc == x:
                return midPoint
            
            if midPointCalc < x:
                result = midPoint
                pointerA = midPoint + 1

            if midPointCalc > x:
                pointerB = midPoint - 1

        return result