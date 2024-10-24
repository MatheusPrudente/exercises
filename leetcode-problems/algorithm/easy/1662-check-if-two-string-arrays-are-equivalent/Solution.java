class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String word3 = "";
        String word4 = "";

        for (String s : word1) {
            word3 = word3.concat(s);
        }

        for (String s : word2) {
            word4 = word4.concat(s);
        }

        return word3.equals(word4);
    }
}
