class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int numberOfJewels = 0;
        for(char j : jewels.toCharArray()) {
            for(char s : stones.toCharArray()) {
                if(j == s) {
                    numberOfJewels++;
                }
            }
        }
        return numberOfJewels;
    }
}
