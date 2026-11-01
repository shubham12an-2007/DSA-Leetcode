class Solution {
public:
    int majorityElement(vector<int>& nums) {
    

        int n = nums.size();
        unordered_map<int, int> mp;
        for (int i = 0; i < n; i++)
        {
            mp[nums[i]]++;
        }

        for (auto it : mp)
        {
            int curnum = it.first;
            if (mp[curnum] > (n / 2))
            {
                return curnum;
            }
        }
        return -1;
            
    }
        
    
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna