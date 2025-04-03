#        0
#       01
#      0110
#    01101001
# 0110100110010110

class KSymbolInGrammarTwoPointers:
     def kthGrammar(self, n: int, k: int) -> int:
        pointer_a = 1
        pointer_b = pow(2, n - 1)
        current_val = 0
        
        for _ in range(0, n - 1):
            mid_point = (pointer_a + pointer_b) // 2

            if k <= mid_point: # Take the left branch of the tree
                pointer_b = mid_point
            else:
                pointer_a = mid_point + 1
                current_val = 0 if current_val == 1 else 1

        return current_val