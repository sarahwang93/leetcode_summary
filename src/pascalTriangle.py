from typing import List

class pascalTriangle:
    def getRow(self, rowIndex: int) -> List[int]:
        init = [[1],[1,1]]

        for i in range(2, rowIndex+1):
            lst = [0] * (i+1)
            lst[0] = 1
            lst[i] = 1
            for j in range(1, i):
                lst[j] = init[i-1][j-1] + init[i-1][j]
            init.insert(i, lst)



        print(init)

        return init[rowIndex]