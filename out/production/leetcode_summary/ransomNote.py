class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        list1 = list(ransomNote)
        list2 = list(magazine)

        newstr = []
        for i in list2:
            if i in list1:
                list1.remove(i)
                newstr.append(i)

        if len(list1) == 0:
            return True
