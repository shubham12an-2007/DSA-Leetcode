class Solution {

    public boolean isPalindrome(String s) {

        int low = 0;
        int high = s.length() - 1;

        while(low <= high) {

            if(s.charAt(low) != s.charAt(high)) {
                return false;
            }

            low++;
            high--;
        }

        return true;
    }

    public int countSubstrings(String s) {

        ArrayList<String> list = new ArrayList<>();

        // Generate all substrings
        for(int i = 0; i < s.length(); i++) {

            for(int j = i + 1; j <= s.length(); j++) {

                list.add(s.substring(i, j));
            }
        }

        // Check every substring
        int count = 0;

        for(int i = 0; i < list.size(); i++) {

            if(isPalindrome(list.get(i))) {
                count++;
            }
        }

        return count;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna