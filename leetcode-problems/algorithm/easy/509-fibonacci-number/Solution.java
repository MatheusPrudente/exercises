class Solution {
    public int fib(int number) {
        if(number == 0 || number == 1) {
            return number;
        }

        int n = 0;
        int n2 = 0;
        int n1 = 1;

        for(int fib = 1; fib < number; fib++) {
            n = n2 + n1;
            n2 = n1;
            n1 = n;
        }

        return n;
    }
}
