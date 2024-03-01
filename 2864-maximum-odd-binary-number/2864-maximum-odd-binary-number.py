class Solution:
    def maximumOddBinaryNumber(self, s: str) -> str:
        z=s.count('0')
        o=s.count('1')
        return ((o-1)*"1"+z*"0"+"1")
        