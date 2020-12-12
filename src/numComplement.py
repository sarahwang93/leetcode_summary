class Solution:
    def findComplement(self, num: int) -> int:
        binary = bin(num)
        newnum = binary[2:]
        result = ""
        for i in newnum:
            if i == "1":
                result += "0"
            else:
                result += "1"
        return int(result,2)