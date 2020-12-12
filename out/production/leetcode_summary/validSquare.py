class Solution:
    def isPerfectSquare(self, num: int) -> bool:
        arr = []
        for i in range(0,1000000):
            arr.append(i*i)

        for x, y in enumerate(arr):
            if num == y:
                return True

        return False