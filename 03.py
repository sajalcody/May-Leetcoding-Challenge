class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        for c in ransomNote:
            if c in magazine:
                i=magazine.index(c)
                magazine = magazine[:i] + magazine[i+1:]
            else:
                return False
        return True
