class Solution {
    public int strStr(String haystack, String needle) {
        for(int h = 0; h < haystack.length(); h++) {
            boolean match = true;
            for(int n = 0; n < needle.length(); n++) {
               if(h + n < haystack.length()) {
                    if(haystack.charAt(h + n) != needle.charAt(n)) {    
                        match = false;
                        break;
                    }
                } else {
                    match = false;
                }
            }
            
            if(match) {
                return h;
            }
        }

        return -1;
    }
}
