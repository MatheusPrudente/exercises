class Solution {
    public int romanToInt(String s) {
        s = s.toUpperCase();
        int number = 0;

        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (i < s.length() - 1) {
                char n = s.charAt(i + 1);
                if(charRomanToInt(c) < charRomanToInt(n)) {
                    number = number - charRomanToInt(c);
                    continue;
                }
            }
            
            number = number + charRomanToInt(c);
        }
        return number;
    }

    public int charRomanToInt(char c) {
        if ('M' == c) {
            return 1000;
        }

        if ('D' == c) {
            return 500;
        }

        if ('C' == c) {
            return 100;
        }

        if ('L' == c) {
            return 50;
        }

        if ('X' == c) {
            return 10;
        }

        if ('V' == c) {
            return 5;
        }

        if ('I' == c) {
            return 1;
        }

        return 0;
    }
}
