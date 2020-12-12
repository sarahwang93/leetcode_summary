class largeSubset:
    def largestDivisibleSubset(self, nums: List[int]) -> List[int]:
            N = len(nums)
            nums.sort()
            dp = [0] * N
            index = [0] * N

            res = list()
            mx = 0 #should be 0-N
            mx_index = -1

            if N==0:
                return res

            # the idea is to check the larger number could divide smaller number
            # so sort the array, then iterate from end to start
            for i in range(N):
                for j in range(i - 1, -1, -1):
                    if nums[i] % nums[j] == 0 and dp[i] < dp[j] + 1:
                        dp[i] = dp[j] + 1
                        # update the array with the index of number could be divided
                        index[i] = j;

                        # update dp
                        if dp[i] > mx:
                            mx = dp[i]
                            mx_index = i
            # dp is to check how many number could be divided by present value
            print(dp)
            # index is to check the index of number could be divided by nums[i]
            print(index)
            for k in range(mx + 1):
                res.append(nums[mx_index])
                mx_index = index[mx_index]

            print(res)
            #reverse of array
            print(res[::-1])
            return res[::-1]
