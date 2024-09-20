/*
    Input: n = 00000000000000000000000000001011
    Output: 3
    Explanation: The input binary string 00000000000000000000000000001011 has a total of three '1' bits.
*/

public class Solution {
    public int hammingWeight(int n) {
        int occurrence = 0;
        String binary = Integer.toBinaryString(n);
        for (int j = 0; j < binary.length(); j++) {
            if (binary.charAt(j) == '1') {
                occurrence++;
            }
        }
        return occurrence;
    }
}
