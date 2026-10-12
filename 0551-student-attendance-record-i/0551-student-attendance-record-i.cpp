class Solution {
public:
    bool checkRecord(string s) {
        
        int absentcount  = 0 ;
        int latecount  = 0 ;
        int n  = s.size() ;

        int maxcons  = INT_MIN;

        for(int i = 0; i< n ; i++){
            char ch = s[i] ;
            if(s[i] == 'A'){
                absentcount ++ ;
            }
            else if(s[i] == 'L'){
                int count  = 0;
                while( i < n && s[i] == 'L'){
                    i ++ ;
                    count ++ ;
                   
                }
                maxcons = max(maxcons,count ) ;
                i-- ;

            } else {
                continue ;
            }
        }

        if(absentcount < 2 && maxcons < 3) return true ;
        else return false;
        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna