public class DetectCapital {
    public boolean detectCapitalUse(String word) {

        // Case 1: all letters are lowercase,
        // Make all letters lowercase then compare
        String lower = word.toLowerCase();
        if (lower.equals(word)) {
            return true;
        }

        // Case 2: all letters are uppercase,
        // Make them all uppercase then compare
        String upper = word.toUpperCase();
        if (upper.equals(word)) {
            return true;
        }

        // Case 3: only first letter is uppercase, the rest are lowercase,
        // get substring start from the second letter
        // if rest are all lowercase, true
        // otherwise, false
        String rest = word.substring(1);
        if (rest.equals(rest.toLowerCase())) {
            return true;
        }

        return false;
    }
}
