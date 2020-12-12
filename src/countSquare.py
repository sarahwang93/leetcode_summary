class Solution:
    def countSquares(self, matrix: List[List[int]]) -> int:
        num = 0

        height = len(matrix)
        width = len(matrix[0])

        dp = [[0 for i in range(width)] for j in range(height)]

        #edge
        for m in range(0, height):
            for n in range(0, width):
                #the single one on edge is not changed
                if m> 0 and n>0 and matrix[m][n] == 1:
                    matrix[m][n] += min(matrix[m-1][n-1], min(matrix[m][n-1], matrix[m-1][n]))
                num += matrix[m][n]
        return num
