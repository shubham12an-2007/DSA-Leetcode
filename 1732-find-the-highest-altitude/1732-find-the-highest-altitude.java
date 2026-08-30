class Solution {
    public int largestAltitude(int[] gain) {
        int[]  alti = new int[gain.length + 1] ;

        int sum = 0 ;
        for(int i =  0 ; i < gain.length ; i++)
        {
            sum = sum + gain[i];
            alti[i + 1] = sum;
        }

        int ans =  Integer.MIN_VALUE ;
        for(int i = 0 ; i < alti.length ;i++)
        {
            if(ans < alti[i]) 
            {
                ans = alti[i] ;
            }
        }
        return ans ; 
        
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna