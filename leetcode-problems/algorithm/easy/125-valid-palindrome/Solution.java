class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reverseString = new StringBuilder(s).reverse().toString();
        return s.equals(reverseString);
    }
}
