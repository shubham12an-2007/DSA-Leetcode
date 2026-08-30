class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        
        int n =  aliceSizes.length ;
        int m =  bobSizes.length  ;

        int bobTotal = 0 ;
        int aliceTotal = 0  ;

        for(int i = 0 ; i< n ;i++)
        {
            aliceTotal += aliceSizes[i] ;
        }

        for(int i = 0 ; i< m ;i++)
        {
            bobTotal += bobSizes[i] ;
        }

        // result 
        // bob ke liye ke hashset bnayenge 
        Set<Integer> set = new HashSet<>() ;
        for(int i = 0 ; i < m; i++)
        {
            set.add(bobSizes[i]) ;
        }

        for(int i = 0 ; i < n ;i++)
        {
            int a = aliceSizes[i] ;
            int b =  a -  (aliceTotal - bobTotal) / 2 ;

            if(set.contains(b))
            {
                return new int[] {a ,b}  ;
            }
        }

        return new int[]{}  ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna