class Solution:
    def checkStraightLine(self, coordinates: List[List[int]]) -> bool:
        coordinates = sorted(coordinates)
        xdiff = coordinates[1][0] - coordinates[0][0]
        ydiff = coordinates[1][1] - coordinates[0][1]
        if xdiff !=0 and ydiff!=0:
            rate = ydiff/xdiff
        else:
            rate = 0

        result = True
        if len(coordinates) == 2:
            result = True
        else:
            for i in range(2, len(coordinates)-1):
                if rate == 0 and ((coordinates[i][1] - coordinates[i-1][1]) == 0 or (coordinates[i][0] - coordinates[i-1][0] == 0)):
                    result = result
                elif rate != 0 and coordinates[i][1] - coordinates[i-1][1] !=0 and coordinates[i][0] - coordinates[i-1][0] != 0 and (coordinates[i][1] - coordinates[i-1][1])/(coordinates[i][0] - coordinates[i-1][0]) == rate:
                    result = result & True
                else:
                    result = result & False
        return result