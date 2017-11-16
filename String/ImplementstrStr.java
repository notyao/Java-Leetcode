public class ImplementstrStr {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if (l2 > l1) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int n = l1 - l2;
        for (int i =0;i<=n;i++){
            if (haystack.substring(i,i+l2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
