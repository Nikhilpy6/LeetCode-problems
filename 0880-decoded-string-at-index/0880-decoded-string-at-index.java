class Solution {
    public String decodeAtIndex(String s, int k) {
        
        int n = s.length();
        long size = 0;  // cnt the size of the encoded string
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                size *= (c - '0');
            } else {
                size += 1;
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            char c = s.charAt(i);
            k %= size;

            if (k == 0 && Character.isLetter(c)) {//when get 0 size and character at that index then it will be answer
                return String.valueOf(c);
            }

            if (Character.isDigit(c)) {
                size /= (c - '0');
            } else {
                size -= 1;
            }
        }
        
        return "";
    }
}




