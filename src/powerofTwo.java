public class powerofTwo {
    public boolean isPowerOfTwo(int n) {
        return n>0 && (n&n-1)==0;
    }
}
