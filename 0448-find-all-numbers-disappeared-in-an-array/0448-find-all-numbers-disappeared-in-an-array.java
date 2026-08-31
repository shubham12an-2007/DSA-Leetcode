class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>() ;
        int arrLength  =  nums.length  ;
        TreeSet<Integer> set = new TreeSet<>() ;
        int n =  Integer.MIN_VALUE  ;

      
        // adding it in treeset 
        for(int i = 0 ; i < arrLength  ; i++)
        {
            set.add(nums[i]) ;
        }

        for(int i = 1 ; i <=  arrLength ; i++)
        {
            if(!set.contains(i))
            {
                res.add(i) ;
            }
        }

        return res ;

      
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna