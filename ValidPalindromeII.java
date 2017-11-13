class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int d1 = 0, d2 = 0;
        int l = 0, r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                l++;
                d1++;
            } else {
                l++;
                r--;
            }
        }
        l = 0;
        r = s.length() - 1;
        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                r--;
                d2++;
            } else {
                l++;
                r--;
            }
        }
        return d1 < 2 || d2 < 2;

    }
}