class Solution {
public:
    void moveZeroes(vector<int>& nums) {

    vector<int> tmp;
    int cnt = 0;
    for (int i = 0; i < nums.size(); i++)
    {
        if (nums[i] != 0)
        {
            tmp.push_back(nums[i]);
        }
        else
        {
            cnt++;
        }
    }
    int index = nums.size() - 1;
    for (int i = 0; i < cnt; i++)
    {
        nums[index] = 0;
        index--;
    }

    for (int i = 0; i < tmp.size(); i++)
    {
        nums[i] = tmp[i];
    }

        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna