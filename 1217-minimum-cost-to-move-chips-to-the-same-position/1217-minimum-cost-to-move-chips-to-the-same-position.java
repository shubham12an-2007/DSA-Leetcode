class Solution {
    public int minCostToMoveChips(int[] position) {
        
        int evenCount  = 0;
        int oddCount  = 0 ;

        for(int pos: position)
        {
            if(pos % 2 == 0) evenCount ++ ;
            else oddCount ++ ;
        }

        return Math.min(evenCount, oddCount)  ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna