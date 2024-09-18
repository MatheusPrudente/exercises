class Solution {
    public int climbStairs(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        int sum = 0;
        int previousSum = 0;
        int currentStep = 1;
        for(int c = 0; c < n; c++) {
            sum = previousSum + currentStep;
            previousSum = currentStep;
            currentStep = sum;
        }
        return sum;
    }
}
