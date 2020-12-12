public class arrangeCoins {
    public int arrangeCoins(int n) {
        if(n==0){
            return 0;
        }

        int remain = n;
        int result = 1;
        for(int i=1;i<n;i++){
            if(remain>=i){
                remain = remain -i;
                if(remain == 0){
                    return i;
                }
            }else{
                result = i-1;
                break;
            }
        }

        return result;
    }
}
