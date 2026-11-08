class Solution {
public:
    int pivotIndex(vector<int>& nums) {
        int left = 0;
        int totalSum = 0;
        int n = nums.size();

        // 1. Calculate the grand total
        for(int i = 0; i < n; i++){
            totalSum += nums[i];
        }

        // 2. Start from index 0 to catch all edge cases
        for(int i = 0; i < n; i++){
            int right = totalSum - left - nums[i];

            if(left == right){
                return i;
            }
            
            // Update left sum for the next index's perspective
            left += nums[i];
        }

        return -1;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna