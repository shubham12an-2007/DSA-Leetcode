class Solution {
    public int[] findErrorNums(int[] nums) {
        
        int[] res = new int[2] ;
        Map<Integer , Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < nums.length  ;  i++)
        {
            int curnum = nums[i] ;
            map.put(curnum , map.getOrDefault(curnum , 0) + 1) ;

        }

         
        for (int i = 1; i <= nums.length; i++) {
            if (map.containsKey(i)) {
                if (map.get(i) == 2) {
                    res[0] = i; 
                }
            } else {
                res[1] = i;     
            }
        }

        return res ;

    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna