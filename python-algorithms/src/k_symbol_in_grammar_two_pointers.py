#        0
#       01
#      0110
#    01101001
# 0110100110010110

class KSymbolInGrammarTwoPointers:
     def kthGrammar(self, n: int, k: int) -> int:
        header = 0
        pointerA = 1
        pointerB = pow(2, n - 1)
        
        for val in range(0, n - 1):
            midPoint = (pointerA + pointerB)//2
            if(midPoint < k): #Take the right branch of the tree
                if(header == 0):
                    header = 1
                else:
                    header = 0
                pointerA = midPoint + 1
            else: #Take the left right branch of the tree
                pointerB = midPoint

        return header