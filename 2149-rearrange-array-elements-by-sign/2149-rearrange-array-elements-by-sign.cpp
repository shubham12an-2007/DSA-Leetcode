class Solution {
public:
    vector<int> rearrangeArray(vector<int>& a) {
        int n = a.size();
        vector<int> pos;
        vector<int> neg;

        for (int i = 0; i < n; i++)
        {
            if (a[i] > 0)
            {
                pos.push_back(a[i]);
            }
            else
            {
                neg.push_back(a[i]);
            }
        }

        int i = 0;
        int j = 0;
        vector<int> res;
        while (i < pos.size() && j < neg.size())
        {
            res.push_back(pos[i]);
            res.push_back(neg[j]);
            i++;
            j++;
        }
        return res;

        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna