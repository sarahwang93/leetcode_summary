class Solution:
    def rotate(self, matrix: List[List[int]]) -> None:
        """
        Do not return anything, modify matrix in-place instead.
        """
        #edge case
        if len(matrix) == 1:
            return matrix

        height = len(matrix)
        i = 0

        matrix1 = matrix.copy()
        print(matrix1)
        for j in range(height):
            lst = []
            for i in range(height):
                lst.append(matrix1[i][j])
                print(lst)
            lst.reverse()
            matrix[j] = lst
