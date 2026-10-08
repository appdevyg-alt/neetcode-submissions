class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() <= 0)
            return false;

        int l = 0;
        int r = s.length() - 1;

        char[] chars = s.toCharArray();
        while (l < r) {
            if (!Character.isLetterOrDigit(chars[l])) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(chars[r])) {
                r--;
                continue;
            }

            if (Character.toLowerCase(chars[l]) != Character.toLowerCase(chars[r]))
                return false;

            else {
                l++;
                r--;
            }
        }
        return true;
    }
}
