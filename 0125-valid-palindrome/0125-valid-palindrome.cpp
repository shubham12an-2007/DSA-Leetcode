class Solution {
public:
     string solve(string s) {

        string ans = "";

        for(char ch : s)
        {
            if(isalnum(ch))
            {
                ans += tolower(ch)  ;
            }
        }

        return ans;
    }

    bool isPalindrome(string s) {

        bool ans  = false;
        string newstr = solve(s) ;
        int n = newstr.size() ;

        for(int i = 0 ; i < n ;i++ )
        {
            if(newstr[i] != newstr[n-i-1])
            {
                return ans  ;
            }
        }

        ans = true  ;
        return ans; 


        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna