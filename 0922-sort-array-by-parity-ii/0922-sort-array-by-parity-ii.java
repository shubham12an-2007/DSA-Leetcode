class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        
        int n = nums.length;
        int[] res = new int[n];

        
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                even.add(nums[i]);
            } else {
                odd.add(nums[i]);
            }
        }

        int evenptr =0 ;
        int oddptr = 0 ;

        for(int i = 0 ; i< nums.length  ;i++)
        {
            if(i % 2 == 0)
            {
                res[i] = even.get(evenptr) ;
                evenptr ++ ;

            }
            else
            {
                res[i] = odd.get(oddptr) ;
                oddptr ++ ;
            }
        }
        return res; 
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna