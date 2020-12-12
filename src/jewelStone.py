class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        num = 0
        for i in S:
            for j in J:
                if j==i:
                    num += 1
            else:
                continue
        return num