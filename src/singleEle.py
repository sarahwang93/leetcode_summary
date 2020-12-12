class Solution:
    def singleNonDuplicate(self, nums: List[int]) -> int:
        dic = {}
        for i in nums:
            if i not in dic:
                dic[i] = 1
            elif i in dic:
                dic[i] += 1
        for m,n in dic.items():
            if n == 1:
                return m