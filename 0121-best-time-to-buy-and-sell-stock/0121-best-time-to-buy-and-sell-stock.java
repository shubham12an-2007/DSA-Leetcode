class Solution {
    public int maxProfit(int[] prices) {
        
        int minprice = Integer.MAX_VALUE ;
        int maxprofit  = 0 ;

        for(int n : prices)
        {
            if(n < minprice)
            {
                minprice = n ;
            }

            int profit  =  n - minprice ;
            maxprofit = Math.max(maxprofit , profit   ) ;
        }


        return maxprofit  ;
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna