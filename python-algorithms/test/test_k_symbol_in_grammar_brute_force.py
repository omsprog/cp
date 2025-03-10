from src.k_symbol_in_grammar_brute_force import KSymbolInGrammarBruteForce

def test_kthGrammar():
    kSIG = KSymbolInGrammarBruteForce()
    assert kSIG.kthGrammar(2,2) == 1
    assert kSIG.kthGrammar(3,3) == 1
    assert kSIG.kthGrammar(3,4) == 0
    assert kSIG.kthGrammar(4,8) == 1
    assert kSIG.kthGrammar(5,13) == 0