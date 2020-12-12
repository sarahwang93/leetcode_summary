class Solution:
    def intersect(self, nums1: List[int], nums2: List[int]) -> List[int]:
        subnum1 = dict()

        result = []
        for i in nums1:
            subnum1[i] = nums1.count(i)

        for j in nums2:
            if j in subnum1 and subnum1[j]>0:
                subnum1[j] -= 1
                result.append(j)
        #print(result)
        return result