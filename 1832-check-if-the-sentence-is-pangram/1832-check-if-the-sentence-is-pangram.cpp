class Solution {
public:
    bool checkIfPangram(string sentence) {
        int arr[26] = {0} ;
        int n = sentence.size() ;

        for(int i = 0  ; i < n ;i++)
        {
            arr[sentence[i] - 'a']++ ;
        }

        for(int i = 0 ; i < 26 ; i++)
        {
            if(arr[i] == 0) return false;
        }
        return true  ;
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna