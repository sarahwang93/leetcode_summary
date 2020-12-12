class pow:
    #use n/2 to seperate with divide and conquer
    #O(logn)
    def pow(self, x:float, n:int) -> float:
        if n==0:
            return 1
        elif n==1:
            return x

        res = self.pow(x, n//2)
        if n%2 == 1:
            return res * res * x
        else:
            return res * res

    def myPow(self, x: float, n: int) -> float:
        if n<0 :
            return 1/self.pow(x, abs(n))
        return self.pow(x, n)