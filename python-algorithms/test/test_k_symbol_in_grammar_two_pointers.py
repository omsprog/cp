from src.k_symbol_in_grammar_two_pointers import KSymbolInGrammarTwoPointers

def test_kthGrammar():
    kSIG = KSymbolInGrammarTwoPointers()
    assert kSIG.kthGrammar(2, 2) == 1
    assert kSIG.kthGrammar(3, 3) == 1
    assert kSIG.kthGrammar(3, 4) == 0
    assert kSIG.kthGrammar(4, 8) == 1
    assert kSIG.kthGrammar(5, 13) == 0