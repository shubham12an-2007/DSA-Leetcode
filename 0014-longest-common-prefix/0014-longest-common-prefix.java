class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        int i = 0;

        while(i < first.length() &&
                i < last.length() &&
                first.charAt(i) == last.charAt(i)) {
                    i++;
    }

    return first.substring(0, i);


        
    }
}   

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna