from src.k_symbol_in_grammar_brute_force import KSymbolInGrammar

def test_kthGrammar():
    kSIG = KSymbolInGrammar()
    assert kSIG.kthGrammar(2,2) == 1
    assert kSIG.kthGrammar(3,3) == 1
    assert kSIG.kthGrammar(3,4) == 0
    assert kSIG.kthGrammar(4,10) == 0
    assert kSIG.kthGrammar(4,14) == 1