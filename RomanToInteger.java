public class RomanToInteger {
    public int romanToInt(String s) {
        //build Roman number to integer map
        Map<Character, Integer> m = new HashMap<Character, Integer>();
        m.put('I', 1);
        m.put('V', 5);
        m.put('X', 10);
        m.put('L', 50);
        m.put('C', 100);
        m.put('D', 500);
        m.put('M', 1000);


        int length = s.length();
        int result = m.get(s.charAt(length - 1));


        for (int i = length - 2; i >= 0; i--) {
            if (m.get(s.charAt(i + 1)) <= m.get(s.charAt(i))) {
                //XI means 11
                result += m.get(s.charAt(i));
            } else {
                //IX means 9
                result -= m.get(s.charAt(i));
            }
        }
        return result;
    }
}