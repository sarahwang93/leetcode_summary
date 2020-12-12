class Solution:
    def majorityElement(self, nums: List[int]) -> List[int]:
        n = len(nums)//3
        print(n)
        lst = {}
        res = []

        if len(nums) == 0:
            return res
        elif len(nums) == 1:
            res.append(nums[0])
        else:
            for i in range(len(nums)):
                if nums[i] in lst:
                    lst[nums[i]] += 1
                else:
                    lst[nums[i]] = 1

                if lst[nums[i]] > n and nums[i] not in res:
                    res.append(nums[i])
            print(lst)
        return res