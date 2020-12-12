class Solution:
    def plusOne(self, digits: List[int]) -> List[int]:
        bit = 10
        sum = 0

        for i in range(0,len(digits)):
            if i !=  len(digits)-1:
                times = len(digits) -1 -i
                sum += digits[i] * (bit**times)
            else:
                sum += digits[i]+1
        print(sum)

        arr = []
        if sum>= 10:
            result = str(sum)
            for j in result:
                arr.append(j)
        else:
            arr.append(sum)
        return arr