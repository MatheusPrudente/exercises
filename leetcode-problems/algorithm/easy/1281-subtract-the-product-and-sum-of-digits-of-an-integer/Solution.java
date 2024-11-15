class Solution {
    public int subtractProductAndSum(int n) {
        int productOfDigits = 1;
        int sumOfDigits = 0;
        String numberInString = Integer.toString(n);

        for (int i = 0; i < numberInString.length(); i++) {
            int currentNumber = Character.getNumericValue(numberInString.charAt(i));
            productOfDigits *= currentNumber;
            sumOfDigits += currentNumber;
        }

        return productOfDigits - sumOfDigits;
    }
}
