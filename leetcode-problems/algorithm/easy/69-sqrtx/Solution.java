class Solution {
    public int mySqrt(int x) {
        int sqrt = x;
        while(sqrt*2 > x) {
            sqrt = sqrt/2;        
        }
        return sqrt;
    }
}
