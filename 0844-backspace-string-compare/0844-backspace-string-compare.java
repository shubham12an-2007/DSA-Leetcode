class Solution {
    public boolean backspaceCompare(String s, String t) {
        
        Stack<Character> st = new Stack<>() ;
        Stack<Character> st2 = new Stack<>() ;

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i) ;

            if(c != '#'){
                st.push(c) ;
            }
            else if(!st.isEmpty()) {
                
                st.pop() ;
            }
        }

        for(int i = 0 ; i < t.length() ; i++){
            char c = t.charAt(i) ;

            if(c != '#'){
                st2.push(c) ;
            }
            else if (!st2.isEmpty()){
                st2.pop() ;
            }
        }

        return st.equals(st2) ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna