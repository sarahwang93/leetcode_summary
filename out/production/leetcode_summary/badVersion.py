class Solution(object):
    def firstBadVersion(self, n):
        i = 1
        j = n
        mid = 1
        while i<=j:
            mid = int((i + j)/2)
            if isBadVersion(mid) == False:
                i = mid + 1
            elif isBadVersion(mid) == True:
                j = mid - 1
        return i