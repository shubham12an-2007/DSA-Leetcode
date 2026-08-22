class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer , Integer> map = new HashMap<>() ;
       

        for(int i = 0 ; i < nums.length ;  i++)
        {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        ArrayList<Integer> list =  new ArrayList<>(map.keySet()) ;
        list.sort((a, b) -> map.get(b) - map.get(a)); 

        int[] res = new int[k] ;

        for(int i = 0  ; i < k  ; i++)
        {
            res[i] = list.get(i) ;
        }

        return res ;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna