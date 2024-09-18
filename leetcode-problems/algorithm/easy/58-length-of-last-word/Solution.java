class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        for(int i = s.length() - 1; i > 0; i--) {
            if(s.charAt(i) == ' ') {
                String lastWord = s.substring(i + 1, s.length());
                return lastWord.length();
            }
        }
        return s.length();
    }
}
