class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        
        Map<Character , Integer> map = new HashMap<>() ;

        for(int i = 0 ; i < order.length() ; i++)
        {
            map.put(order.charAt(i) , i ) ;
        }

        for(int i = 0  ; i< words.length - 1 ; i++)
        {
            String curEle = words[i] ;
            String adjEle = words[i + 1] ;

            // to compare charcater
            int minlen =  Math.min(curEle.length() , adjEle.length()) ;

            for(int j = 0 ; j < minlen ; j++)
            {
               int cur = map.get(curEle.charAt(j));
                int next = map.get(adjEle.charAt(j));

                if (cur > next) {
                    return false;
                }

                if (cur < next) {
                    break;
                }
            }

            if (curEle.length() > adjEle.length()
                    && curEle.substring(0, minlen).equals(adjEle)) {
                return false;

                
            }

        }

        return true  ;


    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna