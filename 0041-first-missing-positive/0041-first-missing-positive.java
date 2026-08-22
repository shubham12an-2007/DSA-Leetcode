class Solution {
    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        
        for(int i = 0; i < n; i++)
        {
            if(nums[i] <= 0 || nums[i] > n)
            {
                nums[i] = n + 1;
            }
        }

        
        for(int i = 0; i < n; i++)
        {
            int num = Math.abs(nums[i]);

            if(num <= n)
            {
                nums[num - 1] = -Math.abs(nums[num - 1]);
            }
        }

        
        for(int i = 0; i < n; i++)
        {
            if(nums[i] > 0)
            {
                return i + 1;
            }
        }

        return n + 1;
    }
}

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna