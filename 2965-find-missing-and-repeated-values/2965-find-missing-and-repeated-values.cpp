class Solution {
public:
    vector<int> findMissingAndRepeatedValues(vector<vector<int>>& a) {

        int n =  a.size() ;
    vector<int> r;
    vector<int> hsh(n * n + 1, 0);

    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            int curnum = a[i][j];
            hsh[curnum]++;
        }
    }

    int hash_len = hsh.size();

    // Repeated number
    for (int i = 1; i < hash_len; i++)
    {
        if (hsh[i] == 2)
        {
            int double_element = i;
            r.push_back(double_element);
            break;
        }
    }

    // Missing number
    for (int i = 1; i < hash_len; i++)
    {
        if (hsh[i] == 0)
        {
            r.push_back(i);
            break;
        }
    }

    return r ;
        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna