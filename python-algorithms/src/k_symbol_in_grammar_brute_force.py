# 0
# 01
# 0110
# 01101001
# 0110100110010110

class KSymbolInGrammarBruteForce:

    def kthGrammar(self, n: int, k: int) -> int:
        myStr = "0"
        for i in range(0, n):
            myStrAux = ""
            for c in myStr:
                if(c == "0"):
                    myStrAux += "01"
                if(c == "1"):
                    myStrAux += "10"
            myStr = myStrAux
        
        return int(myStr[k-1])
