class Solution {
    public int[] plusOne(int[] digits) {
        int carry = 1;
        int i = digits.length - 1;
        ArrayList<Integer> arrayList = new ArrayList<>();

        while(carry != 0 || i > -1) {
            if(i > -1) {
                int sum = digits[i] + carry;
                int digit  = sum % 10;
                carry = sum/10;
                arrayList.add(0, digit);
            } else {
                arrayList.add(0, carry);
                carry = 0;
            }
            i--;
        }

        int[] intArray = new int[arrayList.size()];

        for(int j = 0; j < arrayList.size(); j++) {
            intArray[j] = arrayList.get(j);
        }

        return intArray;
    }
}
