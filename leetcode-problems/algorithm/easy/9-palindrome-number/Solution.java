class Solution {
    public boolean isPalindrome(int x) {
        String normal = Integer.toString(x);
        String reverse = new StringBuilder(normal).reverse().toString();
        return reverse.equals(normal);
    }
}
