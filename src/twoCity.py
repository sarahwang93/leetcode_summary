class twoCity:
    def twoCitySchedCost(self, costs: List[List[int]]) -> int:
        costDiff = []
        sum1 = 0

        for a, b in costs:
            sum1 += a
            costDiff.append(a-b)

        costDiff.sort()
        print(costDiff)
        #4a - (2a - 2b) = 2a + 2b
        #to get the minumum result, 2a-2b should be as large as possible

        return sum1 - sum(costDiff[len(costs)//2:])