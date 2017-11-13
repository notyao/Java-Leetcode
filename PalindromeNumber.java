class PalindromeNumber {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        else if (x == 0)
            return true;
        else {
            int digits = 1;
            while (x / digits >= 10) {
                digits *= 10;
            }
            while (digits > 1) {
                int left = x / digits;
                int right = x % 10;
                if (left != right) {
                    return false;
                }
                x = (x % digits) / 10;
                digits /= 100;
            }
        }
        return true;
    }
}