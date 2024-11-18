from src.longest_substring_without_repeating_characters import LongestSubstringWithoutRepeatingCharacters

def test_lengthOfLongestSubstring():
    lSWRC = LongestSubstringWithoutRepeatingCharacters()
    assert lSWRC.lengthOfLongestSubstring("abcabcbb") == 3
    assert lSWRC.lengthOfLongestSubstring("tmmzuxt") == 5