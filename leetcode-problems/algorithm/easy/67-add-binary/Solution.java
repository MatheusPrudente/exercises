class Solution {
    public String addBinary(String a, String b) {
        StringBuilder sumInString = new StringBuilder();
        int carry = 0;
        int sizeA = a.length() - 1;
        int sizeB = b.length() - 1;

        while (sizeA > -1 || sizeB > -1) {
            int sum = carry;

            if (sizeA > -1) {
                sum = sum + a.charAt(sizeA) - '0';
                sizeA--;
            }

            if (sizeB > -1) {
                sum = sum + b.charAt(sizeB) - '0';
                sizeB--;
            }

            sumInString.append(sum % 2);
            carry = sum / 2;
        }

        if (carry > 0) {
            sumInString.append(carry);
        }
        return sumInString.reverse().toString();
    }
}
