#include <vector>
#include <set>

class Solution {
public:
    int removeDuplicates(std::vector<int>& nums) {
        // 1. Insert all elements into a set to remove duplicates
        std::set<int> uniqueElements(nums.begin(), nums.end());
        
        // 2. Write the unique elements back into the front of the original array
        int index = 0;
        for (int val : uniqueElements) {
            nums[index++] = val;
        }
        
        // 3. Return the number of unique elements
        return uniqueElements.size();
    }
};


// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna