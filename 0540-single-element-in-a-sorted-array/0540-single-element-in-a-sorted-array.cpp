class Solution {
public:
    int singleNonDuplicate(vector<int>& a) {

        int n = a.size() - 1;

    if (a.size() == 1)
    {
        return a[0];
    }

    if (a[0] != a[1])
        return a[0];

    if (a[n] != a[n - 1])
        return a[n];

    // now for all the middle elements
    int low = 1;
    int high = n - 1;

    while (low <= high)
    {
        int mid = low + (high - low) / 2;

        if (a[mid] != a[mid - 1] && a[mid] != a[mid + 1])
        {
            return a[mid];
        }

        // if i am standing at an odd index
        if ((mid % 2 == 1 && a[mid - 1] == a[mid]) ||
            (mid % 2 == 0 && a[mid + 1] == a[mid]))
        {
            low = mid + 1;
        }
        else
        {
            high = mid - 1;
        }
    }

    return -1;
        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna