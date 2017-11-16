public class StudentAttendanceRecord {
    public boolean checkRecord(String s) {
        char[] array = s.toCharArray();
        int countA = 0;
        int countL = 0;

        for (int i = 0; i < array.length; i++) {
            if ('A' == array[i]) {
                countA++;
                if (countA > 1) {
                    return false;
                }
            }
            if ('L' == array[i]) {
                countL++;
                if (countL > 2) {
                    return false;
                }
            }
            else{
                countL=0;
            }
        }
        return true;
    }
}

//// Solution 2:
//// public boolean checkRecord(String s) {
//    return !s.matches(".*LLL.*|.*A.*A.*");
//    }