package strings.palindrome;
class Palindrome {
    public static boolean isPalindrome(String palindrome) {
        if (palindrome.length() == 0 || palindrome.length() == 1) {
            return true;
        }
        int lastString = palindrome.length() - 1;
        return isaBoolean(palindrome, lastString);
    }

    private static boolean isaBoolean(String palindrome, int lastString) {
        return palindrome.substring(0, 1).equals(palindrome.substring(lastString)) && isPalindrome(palindrome.substring(1, lastString));
    }
}
