class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
       
       unordered_map<int , int > f ;
       for(int i = 0 ; i  < nums.size() ; i++)
       {
        int complement =  target - nums[i] ;

        if(f.contains(complement))
        {
            return { i , f[complement] } ;
        }
        else 
        {
            f[nums[i]] = i ;
        }

       }

       return { - 1, -1} ;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna