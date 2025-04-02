class LongestSubstringWithoutRepeatingCharacters:
    def lengthOfLongestSubstring(self, s: str) -> int:
        chars = set()

        a = 0
        b = 0
        longest = 0

        for c in s:
            if c in chars:
                while c in chars:
                    c_aux = s[a]
                    chars.remove(c_aux)
                    a += 1  # moving pointer A

            chars.add(c)
            b += 1  # moving pointer B

            delta = b - a
            longest = max(longest, delta)

        return longest              