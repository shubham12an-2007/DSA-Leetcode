class Solution {
    public int maxNumberOfBalloons(String text) {
        
        Map<Character , Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < text.length() ; i++) {
            char c = text.charAt(i) ;
            map.put(c , map.getOrDefault(c , 0) + 1) ;
        }

        // now map has the frequnecy 
        int res =  Integer.MAX_VALUE  ;
        String target = "balloon" ;

        for(int i = 0 ; i < target.length() ; i++){
            char c = target.charAt(i) ;

            int frequency =  map.getOrDefault(c , 0) ;

            if(c == 'l' || c == 'o'){
                frequency = frequency  / 2;
            }
            else {
                frequency = frequency  / 1;
            }

            res = Math.min(res , frequency) ;


        }
        return res; 
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna