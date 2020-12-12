class Solution:
    def majorityElement(self, nums: List[int]) -> int:
        ele = {}
        for i in nums:
            if i not in ele:
                ele[i] = 1
            else:
                ele[i] += 1

        for s,c in ele.items():
            if c == max(ele.values()):
                return s
