class LongestSubstringWithoutRepeatingCharacters:
    def lengthOfLongestSubstring(self, s: str) -> int:
        if len(s) < 2:
            return len(s)
        
        pointerA = 0
        pointerB = 0
        visited = {}
        longest = 0

        while pointerB < len(s):
            if s[pointerB] in visited:
                indexOfDuplicated = visited[s[pointerB]]
                while pointerA <= indexOfDuplicated:
                    del visited[s[pointerA]]
                    pointerA = pointerA + 1
            else:
                delta = pointerB - pointerA + 1
                if delta > longest:
                    longest = delta

            visited[s[pointerB]] = pointerB
            pointerB = pointerB + 1

        return longest                