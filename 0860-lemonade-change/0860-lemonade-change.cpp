class Solution {
public:
    bool lemonadeChange(vector<int>& bills) {
        int n = bills.size() ;
        int five = 0;
        int ten = 0 ;

        for(int i = 0; i< n ; ++i) {
            int money = bills[i] ;
            if(money == 5) five ++ ;
            else if(money == 10) {
                if(five == 0) return false;
                else {
                    five -- ;
                    ten ++ ;
                }

            }
            else if(money == 20){
                // case 1 : 1 10 and 1  5
                if(ten >  0){
                    ten -- ;
                    if(five == 0) return false;
                    else {
                        five -- ;
                    }
                }
                else {
                    // case 2 : 3 5  notes 
                    if(five < 3) return false;
                    else {
                        five  = five  -  3;
                    }
                }
               
            }
        }

        return true ; 
        
    }
};

// Synced seamlessly with LeetHub Pro
// Pro features: https://bit.ly/leethubpro | Free version: https://bit.ly/leethubv4
// Get it here: https://chromewebstore.google.com/detail/bcilpkkbokcopmabingnndookdogmbna