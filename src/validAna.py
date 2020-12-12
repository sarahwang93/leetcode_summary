import collections

class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        #condition: letter exists in string and the appearance not larger

        sc = collections.Counter(s)
        tc = collections.Counter(t)

        for i in tc.keys():
            if tc[i] != sc[i]:
                return False

        if len(tc.keys()) != len(sc.keys()):
            return False


        return True



