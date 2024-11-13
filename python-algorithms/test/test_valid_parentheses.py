from src.valid_parentheses import ValidParentheses

def test_isValid():
    vP = ValidParentheses()
    assert vP.isValid("()") == True
    assert vP.isValid("()[]{}") == True
    assert vP.isValid("(]") == False
    assert vP.isValid("([])") == True