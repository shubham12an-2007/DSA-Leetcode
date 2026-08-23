class Solution {

    public int checkPalindrome(String s, int left, int right) {

        int count = 0;

        while(left >= 0 &&
              right < s.length() &&
              s.charAt(left) == s.charAt(right)) {

            count++;

            left--;
            right++;
        }

        return count;
    }

    public int countSubstrings(String s) {

        int ans = 0;

        for(int i = 0; i < s.length(); i++) {

            // Odd length palindrome
            ans += checkPalindrome(s, i, i);

            // Even length palindrome
            ans += checkPalindrome(s, i, i + 1);
        }

        return ans;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna