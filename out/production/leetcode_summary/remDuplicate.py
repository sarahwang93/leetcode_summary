class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        final = List[int]
        for i in nums:
            while nums.count(i) > 1:
                nums.remove(i)
        print(nums)
        return len(nums)