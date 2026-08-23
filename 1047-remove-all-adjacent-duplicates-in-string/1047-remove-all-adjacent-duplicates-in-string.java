class Solution {
    public String removeDuplicates(String s) {
        String res = ""  ;
        
        Stack<Character> st = new Stack<>() ;

        for(int i = 0 ;  i < s.length() ; i++){
            char c = s.charAt(i) ;

            if(st.size() !=0  && c == st.peek()){
                st.pop() ;
            }

            else{
                st.push(c) ;
            }


        }

        for(int i = 0 ; i < st.size() ; i++){
            res += st.get(i);
        }

        return res;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna