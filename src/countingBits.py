public class countingBits {
    def countBits(self, num: int) -> List[int]:
    result =[0] * (num+1);
    result[0] = 0;
        for i in range(1, num+1):
            if(i%2 == 0):
    result[i] = result[int(i/2)];
            else:
    print(i-1);
    result[i] = result[int((i-1)/2)]+1;            
    
        return result;
    
}
