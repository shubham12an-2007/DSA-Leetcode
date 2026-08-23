class Solution {
    public int firstUniqChar(String s) {
        
        Map<Character , Integer> map =  new HashMap<>() ;
        int n = s.length()  ;

        for(int i = 0 ; i < n ;i++) {
            char c =  s.charAt(i) ;
            map.put(c , map.getOrDefault(c , 0 ) + 1) ;
        } 

        // now we have the hashmap with the freq  
        int mapsize = map.size() ;

        for(int i = 0 ; i < n   ; i++)
        {
             char c = s.charAt(i);
            int curcount  =  map.get( c ) ;
            if(curcount  == 1) {
                return i ;
            }
        }

        return  -1 ;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna