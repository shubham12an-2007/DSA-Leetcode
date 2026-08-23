class Solution {
    public int findDuplicate(int[] nums) {
        
        HashMap<Integer,  Integer> map = new HashMap<>() ;
        for(int i = 0 ; i < nums.length ; i++){
            int curele = nums[i] ;
            map.put(curele , map.getOrDefault(curele , 0) + 1) ;
        }

        for(int i = 0 ; i < map.size() ; i++){
            if(map.get(nums[i]) > 1){
                return nums[i] ;
            }
        }

        return -1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna