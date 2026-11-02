class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& a) {
       sort(a.begin(), a.end());

    int n = a.size();
    vector<vector<int>> res;

    for (int i = 0; i < n; i++)
    {
        if (i > 0 && a[i] == a[i - 1])
            continue;
        int low = i + 1;
        int high = n - 1;

        while (low < high)
        {
            int curnum = a[low] + a[high];

            if (curnum == 0 - a[i])
            {
                res.push_back({a[i], a[low], a[high]});

                low++;
                high--;

                 while (low < high && a[low] == a[low - 1])
                    low++;

                while (low < high && a[high] == a[high + 1])
                    high--;
            }
            else if (curnum > 0 - a[i])
            {
                high--;
            }
            else
            {
                low++;
            }
        }
    }

    return res;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna