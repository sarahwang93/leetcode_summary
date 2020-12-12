class Solution:
    def containsDuplicate(self, nums: List[int]) -> bool:
        newnums = set(nums)
        if len(newnums) == len(nums):
            detect = False
        else:
            detect = True
        return detect