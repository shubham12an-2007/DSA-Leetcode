class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res =  "" ;
        String first = strs[0] ;

        for(int i = 0 ; i < first.length()  ; i++) {
            char ch =  first.charAt(i) ;

            for(int j =  1  ; j < strs.length  ; j++) {
                if(i >= strs[j].length() || ch != strs[j].charAt(i)) {
                    return res  ;
                }
            }

            res += ch ;
        }

        return res  ;


        
    }
}   

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna