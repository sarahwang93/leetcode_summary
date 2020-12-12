class Solution:
    def firstUniqChar(self, s: str) -> int:
        lenth = len(s)
        if len(s) == 0:
            return -1

        if len(s) == 2 and s[0] == s[1]:
            return -1

        frequency = {}
        for i in s:
            if i not in frequency:
                frequency[i] = 1
            else:
                frequency[i] +=1

        for i in range(lenth):
            if frequency[s[i]] == 1:
                return i
        return -1