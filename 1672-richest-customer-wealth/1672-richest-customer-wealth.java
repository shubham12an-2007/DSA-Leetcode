class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int res =  Integer.MIN_VALUE ;
        for(int i = 0 ; i < accounts.length ;i++)
        {
            int cursum = 0 ;
            for(int j = 0 ; j < accounts[0].length ; j++)
            {
                cursum += accounts[i][j] ;
                res = Math.max(cursum , res) ;
            }
        }

        return res ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna