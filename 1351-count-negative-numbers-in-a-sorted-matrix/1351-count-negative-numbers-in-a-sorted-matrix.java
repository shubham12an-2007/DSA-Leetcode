class Solution {
    public int countNegatives(int[][] grid) {
        
        int ans = 0 ;
        int n  = grid.length ;
        int m  = grid[0].length  ;

        for(int i= 0 ; i < n ;i++)
        {
            for(int j = 0 ; j < m ; j++)
            {
                if(grid[i][j] < 0) ans ++ ;
            }
        }

        return ans ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna