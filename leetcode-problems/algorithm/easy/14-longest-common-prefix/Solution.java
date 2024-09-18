class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String commonPrefix = strs[0];

        for(int i = 1; i < strs.length; i++) {
            commonPrefix = compare(commonPrefix, strs[i]);
        }
        return commonPrefix; 
    }

    public String compare(String s1, String s2) {
        int stop = 0;

        if(s1.length() > s2.length()) {
            String s3 = s1;
            s1 = s2;
            s2 = s3;
        }

        for(int c = 0; c < s1.length(); c++) {
            if(s1.charAt(c) == s2.charAt(c)) {
                stop++;
            } else {
                break;
            }

        }
        return s1.substring(0, stop);
    }
}
