class Solution:
    def reverse(self, x: int) -> int:
        xstr = str(x)
        res = ""

        if xstr[0] == "-":
            res = "-" + xstr[1:][::-1]
        else:
            res = xstr[::-1]

        if -2147483648 >= int(res) or int(res)>= 2147483647:
            return 0
        else:
            return int(res)