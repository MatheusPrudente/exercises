class Solution {
    public boolean isValid(String s) {
      char[] charArray = new char[s.length()];
      int top = 0;

      for(int i = 0; i < s.length(); i++) {
          if (top > 0) {
            char c1 = charArray[top - 1];
            char c2 = s.charAt(i);

            if('(' ==  c1 && ')' == c2) {
                top--;
            } else if('[' == c1 && ']' == c2) {
                top--;
            } else if('{' == c1 && '}' == c2) {
                top--;
            } else {
                charArray[top] = s.charAt(i);
                top++;
            }
          } else {
            charArray[top] = s.charAt(i);
            top++;
          }
      }

      return top <= 0;
    }
}
