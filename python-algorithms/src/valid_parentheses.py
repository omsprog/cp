from collections import deque

class ValidParentheses:
    def isValid(self, s: str) -> bool:
        stack = deque()

        for currStr in s:
            if(currStr == "(" or currStr == "[" or currStr == "{"):
                stack.append(currStr)
            else:
                if(len(stack) == 0):
                    return False
                if(currStr == ")" and "(" != stack[-1]): return False
                if(currStr == "]" and "[" != stack[-1]): return False
                if(currStr == "}" and "{" != stack[-1]): return False

                stack.pop()
        return True if len(stack) == 0 else False