class Solution:
    def compareVersion(self, version1: str, version2: str) -> int:
        v1 = enumerate(version1.split("."))
        v2 = enumerate(version2.split("."))

        lst1 = []
        lst2 = []
        for i,j in v1:
            lst1.append(int(j))

        for m,n in v2:
            lst2.append(int(n))

        if len(lst1) < len(lst2):
            lst1 += [0] * (len(lst2) - len(lst1))
        elif len(lst2) < len(lst1):
            lst2 += [0] * (len(lst1) - len(lst2))

        res = 0
        for l in range(0,len(lst1)):
            if lst1[l] == lst2[l]:
                continue
            elif lst1[l] > lst2[l]:
                return 1
            else:
                return -1

        return 0